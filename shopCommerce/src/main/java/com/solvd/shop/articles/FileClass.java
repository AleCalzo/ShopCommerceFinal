package com.solvd.shop.articles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.solvd.shop.generics.DataPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileClass {
    private static final Logger LOG = LogManager.getLogger("");

    public static void show() {

        try {
            Scanner scanner = new Scanner(System.in);
            LOG.debug("Hi, what is the name of your file?");
            String fileName = scanner.next();
            var reader = new FileReader("file.txt");
            LOG.debug("File Opened");
        } catch (FileNotFoundException e) {
            LOG.debug("Sorry the file does not exist.");
        }

        DataPrint<String> c= new DataPrint<String>("");
        c.print();


    }
}
