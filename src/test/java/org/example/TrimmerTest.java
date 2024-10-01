package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrimmerTest {


    @Test
    void trim() {
        //given
        Trimmer trimmer1 = new Trimmer("abc2");
        Trimmer trimmer2 = new Trimmer("Hello!    ");
        Trimmer trimmer3 = new Trimmer("   x    ");

        //when
        String result1 = trimmer1.trimString();
        String result2 = trimmer2.trimString();
        String result3 = trimmer3.trimString();

        //then
        assertEquals("abc", result1);
        assertEquals("Hello!", result2);
        assertEquals("x", result3);
    }
}