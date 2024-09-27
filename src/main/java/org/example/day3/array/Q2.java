package org.example.day3.array;

public class Q2 {
    public static void main(String[] args) {
        double[] numbers = {11.1,22.2,33.3};

        double hap1= numbers[0]+ numbers[1];
        double hap2= numbers[0]+ numbers[numbers.length-1];

        System.out.println(hap1);
        System.out.println(hap2);
        System.out.println(numbers.length);
        for(double y:numbers){
            System.out.print(y + "   ");
        }
    }//main
}//class
