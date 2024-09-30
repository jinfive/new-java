package org.example.day4.review;

public class ArrayQ1 {
    public static void main(String[] args) {
        /*3일의 휴가기간동안 매일 다른곳을 여행 가려함.
        1.여행가고싶은 지역 3가지 배열에 넣기(처음부터 알고있는경우)
        2.여행지역마다 경비(처음부터 알고 있는 경우)
        3.함께 가고싶은 사람 이름(처음에는 모름.)
        다음과 같이 출력 )제주도 50000 친구
        울릉도 40000 null
        송도 100000 동생
         */
        String[] trip ={"양양","여수","영종도"};
        int[] money = {100000,150000,2400};

        String[] people = new String[3];
        people[0] ="대학 동기";
        people[1 ] = "고등학교 친구들";
        people[2] = "가족들";
        //int i변수의 역 : 반복횟수 체크용, 배열의 인덱스용,계산대상 데이터 용
        for(int i = 0 ; i<people.length ; i++){
            System.out.println(trip[0] + "\t" + money[i] + "원\t " + people[i]);// \t 는 tab만킁 떨어짐 들여쓰기 출력
        }



    }//main
}//class
