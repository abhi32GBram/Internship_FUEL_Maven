package com.sports;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Demo1 {
    @BeforeClass
    public static void demo1(){
        System.out.println("this is a before class method - dmo 1 ");
    }
    @AfterClass
    public static void demo2(){
        System.out.println("this is a after class method - dmo 2 ");
    }

}
