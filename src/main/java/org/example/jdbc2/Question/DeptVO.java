package org.example.jdbc2.Question;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeptVO {
    private int deptno;
    private String deptname;
    private String loc;
}
