package org.example.jdbc4.Question;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductVO {
    private int ProductID;
    private String ProductName;
    private double Price;
    private int Quantity;
}
