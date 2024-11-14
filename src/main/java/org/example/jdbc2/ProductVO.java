package org.example.jdbc2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductVO {
    private int no;
    private String name;
    private int content;
    private int price;


}
