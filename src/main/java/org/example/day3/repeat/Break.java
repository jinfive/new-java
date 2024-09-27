package org.example.day3.repeat;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;//실무에서는 continue자주 사용 x
            }
            if (i == 8) break;
            System.out.println(i);

        }
    }
}
