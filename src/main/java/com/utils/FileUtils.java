package com.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 胡煜家 on 2019/1/22.
 */
public class FileUtils {
    /**
     * 响应输出图片文件
     *
     * @param response
     * @param imgFile
     */
    public static void responseFile(HttpServletResponse response, File imgFile) {
        try (InputStream is = new FileInputStream(imgFile);
             OutputStream os = response.getOutputStream();) {
            byte[] buffer = new byte[1024]; // 图片文件流缓存池
            while (is.read(buffer) != -1) {
                os.write(buffer);
            }
            os.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
