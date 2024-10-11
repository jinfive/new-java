package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 출력1 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/jin-o/Downloads/kjo/newjava/data/imsi1.txt");
          byte[] array = {10,20,30};

          os.write(array);
          os.flush();
          os.close();

        } //try
        catch (IOException e) {
            throw new RuntimeException(e);
        }//catch
    }
}
