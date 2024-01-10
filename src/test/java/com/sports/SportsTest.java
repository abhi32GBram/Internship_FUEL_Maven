package com.sports;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SportsTest {

    @BeforeEach
    public void beforeFunc(){
        System.out.println("this shit is happening before the test begins");
    }

    @AfterEach
    public void afterFunc(){
        System.out.println("this shit is happening after the test fininshed");
        System.out.println("\n--------------------------------------------\n");

    }


    @Test
    public void testSportName() {
        Sports football = new Sports("Football");
        assertEquals("Football", football.getSportName());
    }

    @Ignore
    @Test
    public void testSportNameFailure() {
        Sports basketball = new Sports("Basketball");
        assertEquals("Basketball", basketball.getSportName());

    }


}
