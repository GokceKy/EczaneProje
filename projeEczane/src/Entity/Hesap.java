/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Modal.Entity.Islem_Interface;

/**
 *
 * @author Aybala
 */
public class Hesap implements Islem_Interface {

    IlacAdet Ilacadet = new IlacAdet();
    Ilac ilac = new Ilac();
    Gelir gelir = new Gelir();
    Gider gider = new Gider();
    private int fiyat;
    private int adet;
    private int toplam;
    private int ciro;
    private int val;

    public Hesap() {
        fiyat = ilac.getFiyat();
        adet = Ilacadet.Adet();

    }

    @Override
    public int add(int fiyat, int adet) {
        toplam = fiyat * adet;
        return toplam;
    }

    @Override
    public int subtract(int gelir, int gider) {
        ciro = gelir - gider;
        return ciro;
    }

    public void top(int first, int second) {
        val = first - second;
    }

    public int getVal() {
        return val;
    }

}
