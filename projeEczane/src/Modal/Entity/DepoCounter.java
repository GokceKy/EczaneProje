/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal.Entity;

import Entity.IlacAdet;

/**
 *
 * @author Aybala
 */
public class DepoCounter {

    private int deposayisi;
    private IlacAdet IlacAdet;
    private int adet = 19;//IlacAdet.getAdet()

    public void DepoCount(String deponame, int sayi) {
        if (adet == sayi) {
            System.out.println(deponame + " depo dolu");
        } else if (adet > sayi) {
            System.out.println(deponame + " depoda bos yer vardır");
        }
    }

}
