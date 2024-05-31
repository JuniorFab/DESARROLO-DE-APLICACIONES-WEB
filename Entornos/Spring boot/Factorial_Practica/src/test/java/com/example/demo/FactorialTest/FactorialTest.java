package com.example.demo.FactorialTest;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.Factorial.Factorial;

public class FactorialTest {
	
    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialCon0() {
        assertEquals(1, Factorial.calculo(0));
    }

    @Test
    public void testFactorialCon1() {
        assertEquals(1, Factorial.calculo(1));
    }

   
 
    @Test
    public void testFactorialConNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculo(-1);
        });
    }
}

