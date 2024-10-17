package org.example.day13.Question;

public class Q2_error {
    String[] names = {"홍길동","김길동"};
    public void callname() throws Exception {
        System.out.println(names[10]);}


    int[] ages = null;
    public void callage() throws Exception{
        System.out.println(ages.length);
    }


}
