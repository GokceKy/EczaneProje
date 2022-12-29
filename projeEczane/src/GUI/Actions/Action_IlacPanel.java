
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Actions;

import Controller.IlacCategory_Controller;
import Controller.IlacController;
import Modal.Entity.IlacList;
import GUI.DepoPanel;
import GUI.IlacPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aybala
 */
public class Action_IlacPanel implements ActionListener {

    public IlacPanel Panel = new IlacPanel();
    int i = 0;
    File file = new File("C:\\Users\\Aybala\\Desktop/dosya.txt");
    File file2 = new File("C:\\Users\\Aybala\\Desktop/guncel.txt");
    FileWriter fileWriter;
    FileWriter fileWriter2;
    public DepoPanel depo = new DepoPanel();
    String[] array;

    //   fileWriter =new FileWriter("C:\\Users\\Aybala\\Desktop/dosya.txt");
    public IlacList model = new IlacList();
    IlacCategory_Controller cc = new IlacCategory_Controller(Panel, model);

    public Action_IlacPanel(IlacPanel Panel, DepoPanel depo) {
        this.depo = depo;

        this.Panel = Panel;
        Panel.getEkle().addActionListener(this);
        Panel.getListele().addActionListener(this);
        Panel.getDepo().addActionListener(this);
        Panel.getSil().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == Panel.getEkle().getActionCommand()) {
            try {
                String isim = Panel.getIsim().getText();
                String barkod = Panel.getBarkod().getText();
                System.out.println("eklendi mi");
                fileWriter = new FileWriter(file, true);
                fileWriter.write(isim + " ");
                fileWriter.write(barkod + " \n");

                fileWriter.close();
                //   BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Aybala\\Desktop/dosya.txt"));
                //    String line = bf.readLine();
                //     bf.close();

                int id = 1;

                cc.create(id, isim, barkod, 10);
                System.out.println(cc.getList());

            } catch (Exception ev) {
                System.out.println("hata");

            }

        }

        if (e.getActionCommand() == Panel.getDepo().getActionCommand()) {

            depo.getDepowindow().setVisible(true);
        }
        if (e.getActionCommand() == Panel.getSil().getActionCommand()) {
            System.out.println("silindi");
            int id = Integer.parseInt(Panel.getId().getText());

            ArrayList<String> listOfStrings;
            listOfStrings = new ArrayList();

            try {

                BufferedReader bf = new BufferedReader(
                        new FileReader("C:\\Users\\Aybala\\Desktop/dosya.txt"));
                file2.delete();
                file2 = new File("C:\\Users\\Aybala\\Desktop/guncel.txt");
                fileWriter2 = new FileWriter(file2, true);

                String line = bf.readLine();

                while (line != null) {
                    listOfStrings.add(line);
                    line = bf.readLine();
                }

                bf.close();
                String[] array
                        = listOfStrings.toArray(new String[0]);

                //array[1]=listOfStrings.get(1).substring(10);
                for (int i = 0; i < array.length; i++) {
                    array[id] = " ";
                    String str = array[i];

                    // if(array[0]==str){
                    // } else {
                    fileWriter2.write(str + "\n");
                    System.out.println(str);
                    //}

                }

                fileWriter2.close();

            } catch (Exception ev) {
                System.out.println("hata");
            }

        }
        if (e.getActionCommand() == Panel.getListele().getActionCommand()) {
            Panel.getpane1();

            System.out.println("listelendi");
            cc.getList();

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

}
