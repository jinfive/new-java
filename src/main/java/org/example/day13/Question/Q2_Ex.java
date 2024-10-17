package org.example.day13.Question;

public class Q2_Ex {
    public static void main(String[] args) {
        String[] names = {"홍길동","김길동"};
        try {
            System.out.println(names[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//try-catch
        int[] ages = null;
        try {
            System.out.println(ages.length);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//main
}
