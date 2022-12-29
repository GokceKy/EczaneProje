/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Modal.Entity.IlacList;

/**
 *
 * @author Aybala
 */
public class IlacAdet extends IlacType {

    private Ilac ilac = new Ilac();
    private IlacList list = new IlacList();
    private int adet;

    public IlacAdet() {

    }

    public IlacAdet(int adet) {
        this.adet = adet;
    }

    public IlacAdet(int adet, int id, String description, String typ) {
        super(id, description, typ);
        this.adet = adet;
    }

    public Ilac getIlac() {
        return ilac;
    }

    public void setIlac(Ilac ilac) {
        this.ilac = ilac;
    }

    public IlacList getList() {
        return list;
    }

    public void setList(IlacList list) {
        this.list = list;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int Adet() {
        adet = list.size();
        return adet;
    }

}
