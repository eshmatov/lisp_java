package org.emulator.lisp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File sourceFile = new File(ClassLoader.getSystemResource("sample.lisp").getFile());
        Scanner scanner = new Scanner(sourceFile);

        String source = "";
        while (scanner.hasNextLine()) {
            source += scanner.nextLine() + "\n";
        }
        System.out.println(source);
    }

}
