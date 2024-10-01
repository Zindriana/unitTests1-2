package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchPlaceTest {

    @Test
    void testSwitchPlace() {
        //given
        int[] intArray1 = {5, 10};
        int[] intArray2 = {9, 8, 7, 6, 5};
        int[] intArray3 = {3, 6, 4, 5, 99, 23};
        int[] intArray4 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        SwitchPlace switchPlace = new SwitchPlace(intArray1);
        SwitchPlace switchPlace2 = new SwitchPlace(intArray2);
        SwitchPlace switchPlace3 = new SwitchPlace(intArray3);
        SwitchPlace switchPlace4 = new SwitchPlace(intArray4);

        //when
        switchPlace.swap(intArray1, 0, 1);
        switchPlace2.swap(intArray2, 2, 4);
        switchPlace3.swap(intArray3, 0, 5);
        switchPlace4.swap(intArray4, -1, 5);

        //then
        assertArrayEquals(new int[]{10, 5}, intArray1);
        assertArrayEquals(new int[]{9, 8, 5, 6, 7}, intArray2);
        assertArrayEquals(new int[]{23, 6, 4, 5, 99, 3}, intArray3);
        assertArrayEquals(intArray4, intArray4);

    }
}