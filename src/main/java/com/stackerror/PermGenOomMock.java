package com.stackerror;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by GanShu on 2018/4/12 0012.
 */
public class PermGenOomMock {

    public static void main(String[] args) {
        URL url;
        List<ClassLoader> classLoaderList = new ArrayList<ClassLoader>();
        try {
            url = new File("/tmp").toURI().toURL();
            URL[] urls = {url};
            while (true){
                ClassLoader loader = new URLClassLoader(urls);
                classLoaderList.add(loader);
                loader.loadClass("com.paddx.test.memory.Test");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
