package org.example.day5.array2;

public class StringBasic {
    public static void main(String[] args) {
        String s = "나는! 프로그래머야";
        String s2 = "진짜!!!";
        System.out.println(s + s2);

        String sum = s.concat(s2);
        System.out.println(sum);

        char c = s.charAt(0);//s스트링에 있는 것들중 0번을 추출!
        System.out.println(c);
        System.out.println(s2.charAt(2));//한문자 추출
        System.out.println(s.endsWith("!")); //괄호 안에 있는 문자로 끝났냐??
        System.out.println(s2.endsWith("!"));
        System.out.println(s.contains("!"));//포함을 하냐?
        System.out.println(s2.contains("!"));
        System.out.println(s.substring(4));//시작점 부터 쭉~~. 출력
        System.out.println(s.substring(4, 9));//끝에는 나 뺴고
        System.out.println(s2.indexOf("!"));//인덱스번호 출력 웹프로그램할때는 LastIndex많이 사용
        String s3 = "krt8599@naver.com";
        //1-1.@ 위치를 는다
        //1-2 앞에서 부터 @ 앞까지 추출
        System.out.println(s3.indexOf("@"));//@위치를 찾기
        System.out.println(s3.substring(0, 7));//@ 앞까지 출력
        System.out.println(s3.startsWith("krt")); //입력한 문자로 시작하느냐?
        //s3에 들어있는것중 대문자로
        System.out.println(s3.toUpperCase());
        //s3에 있는것중 com을 net으로 변경
        System.out.println(s3.replace("com", "net"));//비파괴 함수 ram에 있는 데이터를 가져다가 cpu가 변경
        //ram은 변경 안된다.
        System.out.println(s3);
        //s3의 전체글자수 프린트
        System.out.println(s3.length());

        String s4 = " root ";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";

        String s44 = s4.trim();
        System.out.println(s4.length() + "\t" + s44.length());

        //String을 분리해서 배열에 넣어주기
        String[] food = s5.split(",");//split함수를 이용해서 배열에 저장❄❄❄❄❄❄
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }//for

        char[] data = s6.toCharArray();
        for(char v:data){
            System.out.print(v);
        }

        System.out.println(s44.length());
        System.out.println(s44.equals("root"));//String는 equals로 비교
        System.out.println(s4.equals("root"));//String는 equals로 비교

    }
}
