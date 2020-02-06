package Core2;

import java.io.*;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("file-demo2.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }

    }
}
