package org.example;

public class Trimmer {
    private String stringToTrim;

    public Trimmer(String stringToTrim) {
        this.stringToTrim = stringToTrim;
    }

    public String trimString(){
        stringToTrim = stringToTrim.trim();
        return stringToTrim;
    }



}
