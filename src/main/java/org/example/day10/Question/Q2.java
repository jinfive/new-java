package org.example.day10.Question;

public class Q2 {
   String doing;
   int hour;
   String location;

   static int totalHour = 0;

    public Q2(String doing, int hour, String location) {
        this.doing = doing;
        this.hour = hour;
        this.location = location;
        totalHour += hour;
    }

    @Override
    public String toString() {
        return "Q2{" +
                "doing='" + doing + '\'' +
                ", hour=" + hour +
                ", location='" + location + '\'' +
                '}';
    }
}
