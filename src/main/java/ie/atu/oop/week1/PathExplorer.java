package ie.atu.oop.week1;

import java.nio.file.Path;

public class PathExplorer
{
    public static void main(String[] args)
    {
        Path file = Path.of("data", "books.csv");

        System.out.println("Path: " + file);
        System.out.println("File name: " + file.getFileName());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Absolute path: " + file.toAbsolutePath());
        System.out.println("Exists: " + file.toFile().exists()); // file does not exist, its fake
    }
}
