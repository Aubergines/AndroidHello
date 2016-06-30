package com.zsq.service;

import android.content.Context;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.Toast;

import com.allin.http.callback.ResultCallback;
import com.allin.http.request.OkHttpRequest;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * desc:ok-http 网络请求
 * author： LiangYuanQi
 * date：2015/12/5.
 */
public class OkHttpUtil {

    private static final String TAG="OkHttpUtil";
    /**
     * 无参get请求
     *
     * @param url
     * @param callback
     */
    public static void get(String url, ResultCallback callback) {
        LogUtil.i("get url---:", url);
        new OkHttpRequest.Builder().url(url).get(callback);
    }

    /**
     * 含有上下文，无参get请求
     *
     * @param url
     * @param callback
     */
    public static void get(Context context, String url, ResultCallback callback) {

        LogUtil.i(TAG, "url-----"+url);
        get(url,callback);
    }

    /**
     * 不传上下文参数为map的get请求
     *
     * @param url
     * @param params
     * @param callback
     * @param- isCache 是否需要缓存数据，如果需要缓存，下次优先取缓存的数据
     * @param- cacheKey 缓存数据的key
     * @param- cacheTime 缓存时间
     * @param- afterCode 返回码  900-自动刷新
     * @param- cacheUpdate 是否强制更新
     */


    /**
     * put请求(一般用于更新)
     *
     * @param url
     * @param params
     * @param callback 不关心返回值的时,该参数传入null即可
     */
    public static void put(String url, Map params, ResultCallback callback) {
        LogUtil.i("put url---:", url);
        LogUtil.i("put param---:", params);
        callback = callback != null ? callback : ResultCallback.DEFAULT_RESULT_CALLBACK;
        new OkHttpRequest.Builder().url(url).params(params).put(callback);
    }


    /**
     * put请求(一般用于更新)
     *
     * @param context
     * @param url
     * @param params
     * @param callback 不关心返回值的时,该参数传入null即可
     */
    public static void put(Context context, String url, Map params, ResultCallback callback) {
        LogUtil.i("put url---:", url);
        LogUtil.i("put param---:", params);
        callback = callback != null ? callback : ResultCallback.DEFAULT_RESULT_CALLBACK;
        new OkHttpRequest.Builder().url(url).params(params).put(callback);
    }


    /**
     * post请求(一般用于创建create)
     *
     * @param url
     * @param params
     * @param callback 不关心返回值的时,该参数传入null即可
     */
    public static void post(String url, Map params, ResultCallback callback) {
        LogUtil.i("post url---:", url);
        LogUtil.i("post param", params);
        callback = callback != null ? callback : ResultCallback.DEFAULT_RESULT_CALLBACK;
        new OkHttpRequest.Builder().url(url).params(params).post(callback);
    }

    /**
     * post请求(一般用于创建create)
     *
     * @param context
     * @param url
     * @param params
     * @param callback 不关心返回值的时,该参数传入null即可
     */
    public static void post(Context context, String url, Map params, ResultCallback callback) {
        LogUtil.i("post url---:", url);
        LogUtil.i("post param", params);
        callback = callback != null ? callback : ResultCallback.DEFAULT_RESULT_CALLBACK;
        new OkHttpRequest.Builder().url(url).params(params).post(callback);
    }


    /**
     * 加载图片
     *
     * @param url
     * @param view
     */
    public static void loadImage(String url, ImageView view) {
        new OkHttpRequest.Builder().url(url).imageView(view).displayImage(null);
    }

    /**
     * 单个文件下载
     *
     * @param url
     * @param destFileDir  存储路径
     * @param destFileName 本地存储的文件名称
     * @param callback     回调中new ResultCallback<T>()必须指明具体类型
     */
    public static void downloadFile(String url, String destFileDir, String destFileName, ResultCallback callback) {
        new OkHttpRequest.Builder().url(url).destFileDir(destFileDir).destFileName(destFileName).download(callback);
    }

    /**
     * 单文件上传(该方法暂时不用)
     *
     * @param context
     * @param uploadUrl
     * @param file
     * @param params
     * @param callback
     */
    public static void uploadFile(Context context, String uploadUrl, File file, Map<String, Object> params, ResultCallback callback) {
        if (!file.exists()) {
            Toast.makeText(context, "文件不存在，请修改文件路径", Toast.LENGTH_SHORT).show();
            return;
        }
        Map<String, String> headers = new HashMap<>();
        headers.put("APP-Key", "APP-Secret222");
        headers.put("APP-Secret", "APP-Secret111");
        new OkHttpRequest.Builder().url(uploadUrl).params(params).headers(headers).files(new Pair<String, File>("mFile", file)).upload(callback);
    }

    /**
     * 上传多个文件
     *
     * @param context
     * @param uploadUrl
     * @param params
     * @param files
     * @param callback
     */
    public static void multiFileUpload(Context context, String uploadUrl, File[] files, Map<String, Object> params, ResultCallback callback) {
        int len = files.length;
        Pair<String, File>[] filePairs = new Pair[len];
        for (int i = 0; i < files.length; i++) {
            if (!files[i].exists()) {
                Toast.makeText(context, "文件不存在，请修改文件路径", Toast.LENGTH_SHORT).show();
                return;
            }
            filePairs[i] = new Pair<String, File>("mFile", files[i]);  //new Pair<String, File>("mFile", file2)
        }

        new OkHttpRequest.Builder().url(uploadUrl).params(params).files(filePairs).upload(callback);
    }

    /**
     * 上传图片
     * @param context
     * @param url
     * @param params
     * @param callback
     */
    public static void postContent(Context context, String url, Map params, ResultCallback callback) {
        LogUtil.i("post param", params);
        callback = callback != null ? callback : ResultCallback.DEFAULT_RESULT_CALLBACK;
        String jsonParam = new GsonBuilder().create().toJson(params);
        new OkHttpRequest.Builder().url(url).params(params).bytes(jsonParam.getBytes()).post(callback);
    }
    /**
     * 上传图片
     * @param context
     * @param url
     * @param params
     * @param callback
     */
    public static void postContent(Context context, String url, Map params, String tag,ResultCallback callback) {
        LogUtil.i("post param", params);
        callback = callback != null ? callback : ResultCallback.DEFAULT_RESULT_CALLBACK;
        String jsonParam = new GsonBuilder().create().toJson(params);
        new OkHttpRequest.Builder().url(url).tag(tag).params(params).bytes(jsonParam.getBytes()).post(callback);
    }
}
