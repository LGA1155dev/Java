package  now.exception.understand.test;
import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) throws  IOException {
            createFile();
    }

    private static void createFile() throws IOException {
        File file = new File("file/test.txt");

            if (file.exists())
                throw  new RuntimeException("Already exists file with this name!");
            boolean isCreate = file.createNewFile();
            System.out.println("This file, was created with successful");
        }
    }