package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception{
        new TimeClient().connect("127.0.0.1",9000);
    }
}
