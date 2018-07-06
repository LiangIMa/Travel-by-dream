package com.example.demo.utils;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

public class QiNiuUtils {
    static String ACCESS_KEY = "aeidKSDWbTDamHU5lY7bBB4pfmpNvcHrjYrkDtDl";
    static String SECRET_KEY = "Lv2OLsM0iW-snTUXu-8UArIUdw_x8LIiu7CEV3gI";
    static String bucketname = "travelshop";
    static String  key = "test.jpg";
    static String FilePath = "E:\\testproject\\test.jpg";
    static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    static UploadManager uploadManager = new UploadManager();

    public static void getUserById() {
        try {
            //调用put方法上传
            Response res = uploadManager.put(FilePath, key, getUpToken());
            //打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                //响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }
    }
    public static String getUpToken(){
        return auth.uploadToken(bucketname);
    }

}
