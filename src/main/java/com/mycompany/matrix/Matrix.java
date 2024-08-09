package com.mycompany.matrix;

import java.util.*;
public class Matrix {

    public static void main(String[] args) {
        
        kilotomile obj = new kilotomile();
        
        obj.setKilometer(20.0);
        
        
        System.out.print(obj.toString()+" Km");
        System.out.print("= "+obj.getMile()+" Miles");
       
    }
}
