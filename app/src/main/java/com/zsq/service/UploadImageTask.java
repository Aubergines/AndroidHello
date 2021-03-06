package com.zsq.service;

import android.os.Handler;
import android.util.Base64;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

/**
 * Created by Aubergine on 2016/6/30.
 */
public class UploadImageTask {
    private String requestURL = "http://127.0.0.1:18080/allin_api/services/customer/review/attachment/v2/upload/"; // default
    private final String CRLF = "\r\n";
    private Handler handler;
    private String token;
//    public UploadImageTask(Handler handler) {
//        this.handler = handler;
//    }

    public String execute(File...files) {
        InputStream inputStream = null;
        HttpURLConnection urlConnection = null;
        FileInputStream fileInput = null;
        DataOutputStream requestStream = null;
//        handler.sendEmptyMessage(50);
        try {
            // open connection
            URL url = new URL(requestURL);
            urlConnection = (HttpURLConnection) url.openConnection();
            // create random boundary
            Random random = new Random();
            byte[] randomBytes = new byte[16];
            random.nextBytes(randomBytes);
            String boundary = Base64.encodeToString(randomBytes, Base64.NO_WRAP);

            /* for POST request */
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setUseCaches(false);
            urlConnection.setRequestMethod("POST");
            long size = (files[0].length() / 1024);
            if(size >= 1000) {
//                handler.sendEmptyMessage(-150);
                return "error";
            }
            // 构建Entity form
            urlConnection.setRequestProperty("Connection", "Keep-Alive");
            urlConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
            urlConnection.setRequestProperty("Cache-Control", "no-cache");
            fileInput = new FileInputStream(files[0]);
            requestStream = new DataOutputStream(urlConnection.getOutputStream());
            String nikeName = "myfile";
            requestStream = new DataOutputStream(urlConnection.getOutputStream());
            requestStream.writeBytes("--" + boundary + CRLF);
            requestStream.writeBytes("Content-Disposition: form-data; name=\"" + nikeName + "\"; filename=\"" + files[0].getName() + "\""+ CRLF);
            requestStream.writeBytes("Content-Type: " + getMIMEType(files[0]) + CRLF);
            requestStream.writeBytes(CRLF);
            // 写图像字节内容
            int bytesRead;
            byte[] buffer = new byte[8192];
//            handler.sendEmptyMessage(50);
            while((bytesRead = fileInput.read(buffer)) != -1) {
                requestStream.write(buffer, 0, bytesRead);
            }
            requestStream.flush();
            requestStream.writeBytes(CRLF);
            requestStream.flush();
            requestStream.writeBytes("--" + boundary + "--" + CRLF);
            requestStream.flush();
            fileInput.close();

            // try to get response
            int statusCode = urlConnection.getResponseCode();
            if (statusCode == 200) {
                inputStream = new BufferedInputStream(urlConnection.getInputStream());
                String imageuuId = inputStream.toString();
                Log.i("image-uuid", "uploaded image uuid : " + imageuuId);
//                handler.sendEmptyMessage(50);
                return imageuuId;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(requestStream != null) {
                try {
                    requestStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
//        handler.sendEmptyMessage(50);
        return null;
    }

    private String getMIMEType(File file) {
        String fileName = file.getName();
        if(fileName.endsWith("png") || fileName.endsWith("PNG")) {
            return "image/png";
        }
        else {
            return "image/jpg";
        }
    }

}
