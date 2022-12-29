/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Aybala
 */
public class IlacType {

    private Ilac ilac = new Ilac();
    private int id;
    private String description;
    private String typ;

    public IlacType() {
    }

    public IlacType(int id, String description, String typ) {
        this.id = id;
        this.description = description;
        this.typ = typ;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

}
