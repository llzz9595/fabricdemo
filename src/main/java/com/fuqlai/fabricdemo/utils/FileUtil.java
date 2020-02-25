package com.fuqlai.fabricdemo.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

/**
 * @title: FileUtil
 * @projectName fabricdemo
 * @description: 文件工具类
 * @author lps
 * @date 2020/2/2218:46
 */
public class FileUtil {

    /**
     * 读取文件内容
     * @param filePath
     * @return
     */
    public static String readFileContent(String filePath) throws Exception{
        File file = new File(filePath);
        if (!file.exists()) {
            throw new Exception("文件不存在！");
        }

        try {
            StringBuffer sb = new StringBuffer();
            LineIterator iterator = FileUtils.lineIterator(file, "UTf-8");
            while (iterator.hasNext()) {
                String line = iterator.nextLine();
                sb.append(line+"\n");
           }
            return  sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
