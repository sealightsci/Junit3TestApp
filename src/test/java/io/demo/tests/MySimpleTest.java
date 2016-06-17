package io.demo.tests;

import io.demo.MyTestedClass;
import junit.framework.TestCase;

import static junit.framework.TestCase.assertEquals;

public class MySimpleTest extends TestCase {

    private MyTestedClass obj = new MyTestedClass();

    public void test1() {
        assertEquals("a:b", obj.op("a", "b"));
    }

    public void test2() {
        throw new IllegalArgumentException();
        //assertEquals(":b", obj.op(null, "b"));
    }

    public void test3() {
        assertEquals("a:", obj.op("a", null));
    }

    public void test4() {
        assertEquals(":", obj.op(null, null));
    }

    public void test5() {
        // this will fail
        assertEquals(" : ", obj.op(null, null));
    }
}