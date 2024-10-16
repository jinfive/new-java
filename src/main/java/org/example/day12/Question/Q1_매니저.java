package org.example.day12.Question;

public class Q1_매니저 extends Q1_직원{
    //+public
    //-private
    //#protected

    private int bonus;

    public Q1_매니저(String address, String name, int rm, int salary, int bonus) {
        super(address, name, rm, salary);
        this.bonus = bonus;
    }

    public void test(){
    }

    @Override
    public String toString() {
        return "Q1_매니저{" +
                "bonus=" + bonus +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
