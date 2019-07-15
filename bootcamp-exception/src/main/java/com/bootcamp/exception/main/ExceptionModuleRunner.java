package com.bootcamp.exception.main;

import com.bootcamp.exception.io.FileReader;
import com.bootcamp.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Zonk");
        }
    }
}
