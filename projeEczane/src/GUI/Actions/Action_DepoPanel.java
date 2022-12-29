/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Actions;

import GUI.CiroPanel;
import GUI.DepoPanel;
import GUI.IlacPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Aybala
 */
public class Action_DepoPanel implements ActionListener {

    public DepoPanel DepoPanel = new DepoPanel();
    public CiroPanel CiroPanel = new CiroPanel();
    File file2 = new File("C:\\Users\\Aybala\\Desktop/listele.txt");
    FileWriter fileWriter2;

    public Action_DepoPanel(DepoPanel DepoPanel, CiroPanel CiroPanel) {
        this.CiroPanel = CiroPanel;
        this.DepoPanel = DepoPanel;
        DepoPanel.getGuncelle().addActionListener(this);
        DepoPanel.getCiro().addActionListener(this);
        DepoPanel.getListelee().addActionListener(this);

    }

    public Action_DepoPanel() {
        DepoPanel.getGuncelle().addActionListener(this);
        DepoPanel.getCiro().addActionListener(this);
        DepoPanel.getListelee().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == DepoPanel.getCiro().getActionCommand()) {
            System.out.println("ciro acıldı)");
            CiroPanel.getCirowindow().setVisible(true);
        }
        if (e.getActionCommand() == DepoPanel.getListelee().getActionCommand()) {
            System.out.println("Listelendi");

            ArrayList<String> listOfStrings;
            listOfStrings = new ArrayList();

            try {

                BufferedReader bf = new BufferedReader(
                        new FileReader("C:\\Users\\Aybala\\Desktop/dosya.txt"));

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

                for (int i = 0; i < array.length; i++) {

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
        if (e.getActionCommand() == DepoPanel.getGuncelle().getActionCommand()) {
            System.out.println("Guncellendi");
        }
    }
}
