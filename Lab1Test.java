
import org.junit.Test;

import java.io.FileNotFoundException;

public class Lab1Test {
    @Test
    public void test1() {
        Lab1 lab1 = new Lab1();
        try {
            lab1.buildGraphFromFile("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input_w1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String ret = lab1.queryBridgeWords("notexist", "b");
        assert(ret == null);
    }
    @Test
    public void test2() {
        Lab1 lab1 = new Lab1();
        try {
            lab1.buildGraphFromFile("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input_w1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String ret = lab1.queryBridgeWords("a", "notexist");
        assert(ret == null);
    }
    @Test
    public void test3() {
        Lab1 lab1 = new Lab1();
        try {
            lab1.buildGraphFromFile("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input_w1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String ret = lab1.queryBridgeWords("e", "b");
        assert(ret == null);
    }

    @Test
    public void test4() {
        Lab1 lab1 = new Lab1();
        try {
            lab1.buildGraphFromFile("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input_w1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String ret = lab1.queryBridgeWords("c", "d");
        assert(ret != null);
    }
    @Test
    public void test5() {
        Lab1 lab1 = new Lab1();
        try {
            lab1.buildGraphFromFile("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input_w1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String ret = lab1.queryBridgeWords("a", "c");
        assert(ret != null);
    }
}
