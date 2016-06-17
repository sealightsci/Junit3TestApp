package io.demo;

public class MyTestedClass2 {

    public String op(String a, String b) {
        return ((a == null) ? "" : a) + ":" + ((b == null) ? "" : b);
    }
}