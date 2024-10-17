package org.example.day13.Question;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("내용을 입력하세요>>>>");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            FileWriter f = new FileWriter("/Users/jin-o/Downloads/kjo/newjava/data/20241017.txt");
            f.write(str);
            f.flush();
            f.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
