package com.java8.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class NIOFeaturesExample {

    public static void main(String[] args) throws IOException {
        Files.list(new File(".").toPath())
        .filter(f->!f.getFileName().toString().startsWith("."))
        .limit(1)
        .forEach(System.out::println);
        
        Files.walk(new File("C:/Users/jaydip.kamani/workspace/Java8").toPath())
       // .filter(f->!f.getFileName().toString().startsWith("."))
        .filter(f->!f.toString().contains(File.separator+ "."))
        .forEach(System.out::println);
        
        Files.lines(new File("C:/Users/jaydip.kamani/workspace/Java8/junit5-samples/pom.xml").toPath())
        .map(s -> s.trim())
        .filter(s -> !s.isEmpty())
        .forEach(System.out::println);;
    }

}
