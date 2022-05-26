package com.solvd.shop.read;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;


public class TextFile {
    private static final Logger LOG = LogManager.getLogger("");
    public void write (String name){

        File file= null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {

        file= new File("Portishead");
        fileWriter = new FileWriter(file);
        bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);


        }catch (Exception e){
            LOG.debug(e.getMessage());
        }


        }
    }



