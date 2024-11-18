package org.example.jdbc4.Question;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Setter
@Getter
@ToString
public class ProudctVO {
    private int ProductID;
    private String ProductName;
    private double Price;
    private int Quantity;
}
