package org.example.day22.문풀;

public class Q11 {
    //숫자찾기
    public static void main(String[] args) {
        char c = '1';
        char c2 = '2';
        //System.out.println(c + c2);//99출력

        int ic = c -'0';//49-48
        int ic2 = c2 - '0';//50- 48
        //System.out.println(ic + ic2);

        String s = "1234";
        //char배열로 변경해서
        char[] cl = s.toCharArray();
        //각 값들을 다 더하세요.!
        int sum=0;
        for(char x:cl){
            sum = sum + (x - '0');
        }
        System.out.println(sum);


    }
}
