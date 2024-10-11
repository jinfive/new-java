package org.example.day9.Question;

import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/jin-o/Downloads/kjo/newjava/day2/build.gradle");
            Reader os = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(os);
            while (true){
                String line =br.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
            br.close();
            os.close();
            is.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//main

}//class
