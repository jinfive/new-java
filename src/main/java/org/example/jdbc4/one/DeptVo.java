package org.example.jdbc4.one;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//ORM규칙
public class DeptVo {
    private Integer deptno;
    private String dname;
    private String loc;

    //넣을 때
    //꺼낼 때
    //들어있는 변수 들 값 문자열로 확인 toString
}
