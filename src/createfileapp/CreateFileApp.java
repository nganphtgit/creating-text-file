/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createfileapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author julie
 */
public class CreateFileApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        String[] myStringArray = new String[]{"a","b","c", "d", "e", "f", "g","h","i", "j", "k", "l", "m","n","o", "p", "q", "r","s","t", "u", "v", "w", "x", "y", "z"};
        Random rd = new Random();
        int n = 0;
        String content = "";
        try {
            fw = new FileWriter("abc2.txt", true);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < 20000000; i++) {
            String word = "";
            for (int j = 0; j < 5; j++) {
                n = rd.nextInt(myStringArray.length - 1);
                word += myStringArray[n];
            }
                content = word + "\n";
                bw.write(content);
                System.out.println(i);
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
