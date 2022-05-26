package com.solvd;

import jdk.jshell.execution.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    private static final Logger LOG = LogManager.getLogger(Util.class);

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter("C:\\Portishead.txt");
            printWriter = new PrintWriter(fileWriter);

            printWriter.println("Portishead is an English band formed in 1991 in Bristol. They are often considered one of the pioneers of trip hop music, although the band themselves have always fiercely disliked the term when used to describe their sound.");
            printWriter.print("\nThe band is named after the nearby town of the same name, eight miles west of Bristol, along the coast");
            printWriter.print("\n Portishead consists of Beth Gibbons, Geoff Barrow, Adrian Utley, and Jim Barr while sometimes citing a fourth member, Dave McDonald, an engineer on their first records.");


        } catch (Exception e) {
            LOG.debug("Error"+e.getMessage());
        } finally {
            printWriter.close();
        }
    }
}