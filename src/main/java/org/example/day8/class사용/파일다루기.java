package org.example.day8.class사용;

import java.io.File;

public class 파일다루기 {
    public static void main(String[] args) {
        File file = new File("/opt/homebrew/Cellar/openjdk/22.0.2/libexec/openjdk.jdk/Contents/Home/bin");
        // / -->슬러시
        // \ -->역슬러시
        System.out.println(file.exists());
        System.out.println(file.isFile());
        //디렉토리 == 폴더 == 패키지
        System.out.println(file.isDirectory());
        System.out.println(file.listFiles());
        File[] list = file.listFiles();
        System.out.println(list.length);
        for (File f : list) {
            //확장자가 exe인경우 프린트
            if (f.getName().endsWith(".exe")) {
                System.out.println(f.getName());
            }//if

        }//for
        System.out.println(file.getPath());
        System.out.println(file.getParentFile());//상위
        System.out.println(file.getAbsolutePath());



    }//mian
}//class
