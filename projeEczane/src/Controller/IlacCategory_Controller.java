/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.IlacCategory;
import Modal.Entity.IlacList;
import Entity.IlacType;
import GUI.IlacPanel;
import java.util.List;

/**
 *
 * @author Aybala
 */
public class IlacCategory_Controller {

    private IlacPanel ılacpanel;
    private IlacList model;

    public IlacCategory_Controller(IlacPanel ılacpanel, IlacList model) {
        this.ılacpanel = ılacpanel;
        this.model = model;
    }

    public void create(int id, String name, String barkod, int fiyat) {
        IlacCategory c = new IlacCategory(id, name, barkod, fiyat);
        this.getModel().insert(c);
    }

    public void sil(int n) {
        IlacCategory c = new IlacCategory();
        this.getModel().delete(c, n);
    }

    public List<IlacCategory> getList() {
        return this.getModel().getList();
    }

    public IlacPanel getIlacpanel() {
        return ılacpanel;
    }

    public void setIlacpanel(IlacPanel ılacpanel) {
        this.ılacpanel = ılacpanel;
    }

    public IlacList getModel() {
        return model;
    }

    public void setModel(IlacList model) {
        this.model = model;
    }

}
