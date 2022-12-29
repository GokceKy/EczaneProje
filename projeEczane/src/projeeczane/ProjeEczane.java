/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeeczane;

import Controller.Ciro_Controller;
import Entity.Hesap;
import GUI.Actions.Action_CiroPanel;
import GUI.Actions.Action_DepoPanel;
import GUI.Actions.Action_IlacPanel;
import GUI.Actions.Action_Login;
import GUI.Ana;
import GUI.CiroPanel;
import GUI.DepoPanel;
import GUI.IlacPanel;
import GUI.Login;
import Modal.Entity.DataAccess;
import Modal.Entity.DepoCounter;
import Modal.Entity.DepoThread;

/**
 *
 * @author Aybala
 */
public class ProjeEczane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login = new Login();
        IlacPanel Panel = new IlacPanel();
        DepoPanel depo = new DepoPanel();
        CiroPanel ciro=new CiroPanel();
        DataAccess data=new DataAccess();
        

        Ana ana = new Ana(login, Panel);
        Action_Login log = new Action_Login(login, Panel, ana);
        //login.getWindow().setVisible(true);
        IlacPanel panel = new IlacPanel();
        Action_IlacPanel ac = new Action_IlacPanel(Panel, depo);
        Action_DepoPanel ad=new Action_DepoPanel(depo,ciro);
        
           Hesap hesapla=new Hesap();
           
        Action_CiroPanel cirA=new Action_CiroPanel(ciro,hesapla);
        
        
    //    DepoCounter depocount=new DepoCounter();
     //   DepoThread t1=new DepoThread(depocount, "Aeczane", 2);
     //   DepoThread t2=new DepoThread(depocount, "Beczane", 1);
        
     //   t1.start();
      //  t2.start();
        
     

    }

}
