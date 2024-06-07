import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Map;

import static org.junit.Assert.*;
public class TestCreate {
    @Test
    public void Test1() {
        Lab1 lab1 = new Lab1();
        try {
            lab1.createDirectedGraph("an invalid file path");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
    @Test
    public void Test2() throws FileNotFoundException {
        Lab1 lab1 = new Lab1();
        Map<String, Map<String, Integer>> graph = null;
        try {
            graph = lab1.createDirectedGraph("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertTrue(graph.containsKey("a"));
        assertTrue(graph.get("a").containsKey("b"));
        assertTrue(graph.get("a").get("b")==1);
        assertTrue(graph.containsKey("b"));
        assertTrue(graph.get("b").containsKey("c"));
        assertTrue(graph.get("b").get("c")==1);
        assertTrue(graph.containsKey("c"));
        assertTrue(graph.get("c").containsKey("d"));
        assertTrue(graph.get("c").get("d")==1);
        assertTrue(graph.containsKey("d"));
        assertTrue(graph.get("d").containsKey("e"));
        assertTrue(graph.get("d").get("e")==1);
        assertTrue(graph.containsKey("e"));
        assertTrue(graph.get("e").containsKey("f"));
        assertTrue(graph.get("e").get("f")==1);
        assertTrue(graph.containsKey("f"));
        assertTrue(graph.get("f").containsKey("g"));
        assertTrue(graph.get("f").get("g")==1);
    }
    @Test
    public void Test3() throws FileNotFoundException {
        Lab1 lab1 = new Lab1();
        Map<String, Map<String, Integer>> graph = null;
        try {
            graph = lab1.createDirectedGraph("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input2");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertTrue(graph.containsKey("a"));
        assertTrue(graph.get("a").containsKey("b"));
        assertTrue(graph.get("a").get("b")==1);
        assertTrue(graph.containsKey("b"));
        assertTrue(graph.get("b").containsKey("c"));
        assertTrue(graph.get("b").get("c")==1);
        assertTrue(graph.containsKey("c"));
        assertTrue(graph.get("c").containsKey("d"));
        assertTrue(graph.get("c").get("d")==1);
        assertTrue(graph.containsKey("d"));
        assertTrue(graph.get("d").containsKey("e"));
        assertTrue(graph.get("d").get("e")==1);
        assertTrue(graph.containsKey("e"));
        assertTrue(graph.get("e").containsKey("f"));
        assertTrue(graph.get("e").get("f")==1);
        assertTrue(graph.containsKey("f"));
        assertTrue(graph.get("f").containsKey("g"));
        assertTrue(graph.get("f").get("g")==1);
    }
    @Test
    public void Test4() {
        Lab1 lab1 = new Lab1();
        Map<String, Map<String, Integer>> graph = null;
        try {
            graph = lab1.createDirectedGraph("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input3");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertTrue(graph.containsKey("a"));
        assertTrue(graph.get("a").containsKey("b"));
        assertTrue(graph.get("a").get("b")==1);
        assertTrue(graph.containsKey("b"));
        assertTrue(graph.get("b").containsKey("c"));
        assertTrue(graph.get("b").get("c")==1);
        assertTrue(graph.containsKey("c"));
        assertTrue(graph.get("c").containsKey("d"));
        assertTrue(graph.get("c").get("d")==1);
        assertTrue(graph.containsKey("d"));
        assertTrue(graph.get("d").containsKey("e"));
        assertTrue(graph.get("d").get("e")==1);
        assertTrue(graph.containsKey("e"));
        assertTrue(graph.get("e").containsKey("f"));
        assertTrue(graph.get("e").get("f")==1);
        assertTrue(graph.containsKey("f"));
        assertTrue(graph.get("f").containsKey("g"));
        assertTrue(graph.get("f").get("g")==1);
    }
    @Test
    public void Test5() {
        Lab1 lab1 = new Lab1();
        Map<String, Map<String, Integer>> graph = null;
        try {
            graph = lab1.createDirectedGraph("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input4");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertTrue(graph.containsKey("a"));
        assertTrue(graph.get("a").containsKey("b"));
        assertTrue(graph.get("a").get("b")==4);
        assertTrue(graph.containsKey("b"));
        assertTrue(graph.get("b").containsKey("a"));
        assertTrue(graph.get("b").get("a")==4);
    }
    @Test
    public void Test6() {
        Lab1 lab1 = new Lab1();
        Map<String, Map<String, Integer>> graph = null;
        try {
            graph = lab1.createDirectedGraph("E:\\大学学习\\软件工程\\lab3\\Lab3\\src\\input5");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
