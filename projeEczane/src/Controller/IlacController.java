/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import GUI.DepoPanel;
import GUI.IlacPanel;
import Modal.Entity.IlacList;

/**
 *
 * @author Aybala
 */
public class IlacController {

    private IlacPanel ılacpanel;
    private IlacList model;
    private DepoPanel depoPanel;

    public IlacController(IlacPanel ılacpanel, IlacList model, DepoPanel depoPanel) {
        this.ılacpanel = ılacpanel;
        this.model = model;
        this.depoPanel = depoPanel;
    }

}
