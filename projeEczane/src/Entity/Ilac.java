/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Aybala
 */
public class Ilac {

    private int id;
    private IlacType type;
    private String name;
    private String barkod;
    private int fiyat;

    public Ilac() {
    }

    public Ilac(int id, IlacType type, String name, String barkod, int fiyat) {
        this.id = id;
        this.fiyat = fiyat;
        this.type = type;
        this.name = name;
        this.barkod = barkod;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IlacType getType() {
        return type;
    }

    public void setType(IlacType type) {
        this.type = type;
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

}
