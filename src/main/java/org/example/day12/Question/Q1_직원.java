package org.example.day12.Question;

public class Q1_직원 {
    //+public
    //-private
    //#protected
    public String name;
    String address;
    protected int salary;
    private int rm;

    public Q1_직원(String address, String name, int rm, int salary) {
        this.address = address;
        this.name = name;
        this.rm = rm;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Q1_직원{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", rm=" + rm +
                '}';
    }
}
