package org.example.dbcp;

public class DBCP {
    static  DBCP instance;
    private DBCP() {}
    public static DBCP getInstance() {
        if (instance == null) {
            instance = new DBCP(); //싱글톤 객체
        }
        return instance;
    }

}
