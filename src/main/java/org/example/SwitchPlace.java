package org.example;

public class SwitchPlace {

    private int[] intArray = new int[2];

    public SwitchPlace(int[] intArray) {
        this.intArray = intArray;
    }

    public void swap(int[] array, int index1, int index2) {
        if(index1 <= array.length && index2 <= array.length && index1 >= 0 && index2 >= 0 ) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}
