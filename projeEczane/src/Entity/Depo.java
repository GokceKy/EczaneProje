/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Modal.Entity.IlacList;
import Controller.IlacCategory_Controller;
import GUI.IlacPanel;

/**
 *
 * @author Aybala
 */
public class Depo {

    public int adet;
    public int fiyat;
    public IlacPanel Panel = new IlacPanel();
    public IlacList DepoIlaclarList = new IlacList();
    IlacCategory_Controller IC = new IlacCategory_Controller(Panel, DepoIlaclarList);

    public Depo() {
    }

    public Depo(int adet, int fiyat) {
        this.adet = adet;
        this.fiyat = fiyat;
    }

    public int getAdet() {
        DepoIlaclarList.getList().size();
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public IlacPanel getPanel() {
        return Panel;
    }

    public void setPanel(IlacPanel Panel) {
        this.Panel = Panel;
    }

    public IlacList getDepoIlaclarList() {
        return DepoIlaclarList;
    }

    public void setDepoIlaclarList(IlacList DepoIlaclarList) {
        this.DepoIlaclarList = DepoIlaclarList;
    }

    public IlacCategory_Controller getIC() {
        return IC;
    }

    public void setIC(IlacCategory_Controller IC) {
        this.IC = IC;
    }

}
