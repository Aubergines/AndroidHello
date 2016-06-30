package com.zsq.androidhello;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zsq.service.UploadImageTask;

import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.DefaultBHttpClientConnection;

import java.io.File;
import java.io.IOException;

/**
 * Created by Aubergine on 2016/6/30.
 */
public class PhotoUpload extends Activity {

    private String newName = "image.jpg";
    private String uploadFile = "Lighthouse.jpg";
    private String actionUrl = "http://127.0.0.1:18080/allin_api/services/customer/review/attachment/v2/upload/";
    private TextView mText1;
    private TextView mText2;
    private Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_upload);
        mText1 = (TextView) findViewById(R.id.myText2);
        //"文件路径：\n"+
        mText1.setText(uploadFile);
        mText2 = (TextView) findViewById(R.id.myText3);
        //"上传网址：\n"+
        mText2.setText(actionUrl);
        /* 设置mButton的onClick事件处理 */
        mButton = (Button) findViewById(R.id.myButton);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                uploadFile();
            }
        });
    }

    /* 上传文件至Server的方法 */
    private void uploadFile() {

        UploadImageTask uploadImageTask = new UploadImageTask();
        File file = new File(uploadFile);
        uploadImageTask.execute();
    }

    /* 显示Dialog的method */
    private void showDialog(String mess) {
        new AlertDialog.Builder(PhotoUpload.this).setTitle("Message")
                .setMessage(mess)
                .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }
}
