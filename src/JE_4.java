
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class JE_4 {
    public static void main (String[] args) throws IOException {
            File file1 = new File("file1.txt"); 
            char CharCounter = 0;       
            BufferedReader in = (new BufferedReader(newFileReader(file1)));

            int ch;
            while ((ch = in.read()) != -1){

                if (Character.isLowerCase(ch)){
                    Character.toUpperCase(ch);

                }
                System.out.print(ch);


            }
            in.close();
        }       
    }