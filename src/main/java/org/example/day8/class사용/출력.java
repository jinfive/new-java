package org.example.day8.class사용;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 출력 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/jin-o/Downloads/kjo/newjava/data/imsi.txt");
            byte a= 10;
            byte b= 20;
            byte c= 30;

            os.write(a);
            os.write(b);
            os.write(c);
            os.flush();
            os.close();


        } //try
        catch (IOException e) {
            throw new RuntimeException(e);
        }//catch
    }
}
