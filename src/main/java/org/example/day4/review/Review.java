package org.example.day4.review;

public class Review {
    public static void main(String[] args) {
        //배열을 생성할떄
        //1,처음부터 값을 알고있을떄
        int[] days ={1,3,4,5,6};

        //2.처음에는 값을 모를때
        String[] doing =new String[5];
        doing[0] = "쉬기";//String " ", char ' '
        doing[1] ="서울숲";

        System.out.println(days);
        System.out.println(doing);

        double[] temp ={22 ,20 ,15 ,17 , 20 };
        //System.out.println(days[0] + " "+ doing[0] + " " + temp[0]);
        //System.out.println(days[1] + " "+ doing[1] + " " + temp[1]);

        for(int i=0;i<temp.length;i++){
            System.out.println(days[i] + " "+ doing[i] + " " + temp[i]);
        }

        for(double t:temp){ //temp라는 배열을 앞에서 부터 순서대로 있는지 체크해서 하나씩 꺼내서 t라는 변수에 넣어주는 for문
            System.out.println(t);
        }
    }//main
}//class
