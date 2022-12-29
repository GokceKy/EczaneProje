/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Aybala
 */
public class IlacCategory {

    Ilac ilac = new Ilac();
    private int id;
    private IlacType type;
    private String name;
    private String barkod;
    private int fiyat;

    public IlacCategory() {
    }

    public IlacCategory(int id, String name, String barkod, int fiyat) {
        this.id = id;

        this.name = name;
        this.barkod = barkod;
        this.fiyat = fiyat;
    }

    public Ilac getIlac() {
        return ilac;
    }

    public void setIlac(Ilac ilac) {
        this.ilac = ilac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "IlacCategory{" + "ilac=" + ilac + ", id=" + id + ", name=" + name + ", barkod=" + barkod + ", fiyat=" + fiyat + '}';
    }

}
