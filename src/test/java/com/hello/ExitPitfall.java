package com.hello;

/**
 * Created by GanShu on 2016/7/16 0016.
 */
public class ExitPitfall {

    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec("javac");
            int exitcode = proc.waitFor();
//            int exitcode = proc.exitValue();
            System.out.println("exit code: " + exitcode);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
