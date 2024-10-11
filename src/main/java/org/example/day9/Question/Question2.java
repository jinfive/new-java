package org.example.day9.Question;

import java.io.*;

public class Question2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        int year =2024;
        book1.author="김난도";
        book1.title ="트렌드코리아2025";

        book2.author="백희성";
        book2.title ="빛이이끄는곳으로";

        System.out.println("저자>>"+book1.getAuthor()+"제목>>"+book1.getTitle());
        System.out.println("저자>>"+book2.getAuthor()+"제목>>"+book2.getTitle());
    }//main

}//class
