package io.demo;

public class MyTestedClass {

    public String op(String a, String b) {
        return ((a == null) ? "" : a) + ":" + ((b == null) ? "" : b);
    }
}