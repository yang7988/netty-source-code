package org.example;

/**
 * Hello world!
 */
public class AppServer {
    public static void main(String[] args) throws Exception{
        new TimeServer().bind(9000);
    }
}
