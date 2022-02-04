package com.tsi.orestas.testing;

import com.tsi.orestas.Planets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanetsTest {

    @Test
    public void test_IsEmpty(){
        Planets testIsEmpty = new Planets();
        testIsEmpty.isEmpty();
        assertEquals(false, testIsEmpty.isEmpty(),"wrong");
    }

}
