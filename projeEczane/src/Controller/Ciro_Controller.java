/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Hesap;
import GUI.Actions.Action_CiroPanel;
import GUI.CiroPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

/**
 *
 * @author Aybala
 */
public class Ciro_Controller {

    private CiroPanel thview = new CiroPanel();
    private Action_CiroPanel thaction = new Action_CiroPanel();
    private Hesap hesapla = new Hesap();

    public Ciro_Controller(CiroPanel thview, Hesap hesapla) {
        this.thview = thview;
        this.thaction = thaction;
        this.hesapla = hesapla;

    }

}
