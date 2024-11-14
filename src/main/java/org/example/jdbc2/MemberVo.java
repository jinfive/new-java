package org.example.jdbc2;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class MemberVo {
    //가방에 들어갈 데이터 공간 할당(member테이블의 컬럼명과 동일)
    private String id;
    private String pw;
    private String name;
    private String tel;

//    @Override
//    public String toString() {
//        return "ProductVO{" +
//                "no=" + no +
//                ", name='" + name + '\'' +
//                ", content='" + content + '\'' +
//                ", price=" + price +
//                '}';
//    }
}











