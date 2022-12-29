/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal.Entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aybala
 */
public class DataAccess {

    File file = new File("C:\\Users\\Aybala\\Desktop/dosya.txt");
    FileWriter fileWriter;
    BufferedReader br;
     String[] array;

    public void yaz() {
        try {
            fileWriter = new FileWriter(file);

            fileWriter.close();

        } catch (Exception ev) {
            System.out.println("hata");

        }
    }

    public void oku() {
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("Modal.Entity.DataAccess.oku()+dosya bulunumadı");
        }
    }
    
    public void deneme(){
         ArrayList<String> listOfStrings;
            listOfStrings = new ArrayList();

            try {
              
                BufferedReader bf = new BufferedReader(
                        new FileReader("C:\\Users\\Aybala\\Desktop/dosya.txt"));

                String line = bf.readLine();

                while (line != null) {
                    listOfStrings.add(line);
                    line = bf.readLine();
                }

              
                bf.close();
                String[] array
                        = listOfStrings.toArray(new String[0]);

                for (String str : array) {

                    System.out.println(str);

                }
                
                
            } catch (Exception ev) {
                System.out.println("hata");
            }
    }

    
}
