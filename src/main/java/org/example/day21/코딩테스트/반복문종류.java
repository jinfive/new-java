package org.example.day21.코딩테스트;

public class 반복문종류 {
    //무한반복 >> while(true)
    //유한반복 >> while , for
    public static void main(String[] args) {
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("오늘은 화요일");
        }

        int j = 0;
        while (j < 3){
            System.out.println("3번 남았다ㅠ");
            j++;
        }
    }
}
