package org.example.day3.array;

public class Q3 {
    public static void main(String[] args) {
            /*
            3. 개수가 4개인
             문자(char) 배열을 만들어(처음에는 값을 모르고 있는 경우)
            3-1. 첫 번째 위치에 '남'을 넣어, 첫 번째 값 프린트
            3-2. 두 번째 위치에 '여'를 넣어, 첫 번째 값 프린트
            3-3. 전체 개수와 전체 배열의 값을 프린트
                 */


        char[] sex = new char[4];
        sex[0] = '남';
        sex[1] = '여';

        System.out.println(sex[0]);
        System.out.println(sex[0]);  // 문제에서 요구한 대로 첫 번째 값을 두 번 출력

        System.out.println("배열의 길이: " + sex.length);
        System.out.print("전체 배열: ");
        for (char s : sex) {
            System.out.print(s + " ");
        }
        System.out.println();  // 줄바꿈 추가
    }
}


