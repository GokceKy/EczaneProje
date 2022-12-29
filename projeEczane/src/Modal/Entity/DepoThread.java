/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal.Entity;

/**
 *
 * @author Aybala
 */
public class DepoThread extends Thread{
    private DepoCounter depocount;
    private String eczanename;
    private int sayi;

    public DepoThread(DepoCounter depocount, String eczanename, int sayi) {
        this.depocount = depocount;
        this.eczanename = eczanename;
        this.sayi = sayi;
    }
    
    public void run(){
        depocount.DepoCount(eczanename, sayi);
    }
    
}
