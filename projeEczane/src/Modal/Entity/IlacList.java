/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal.Entity;

import Entity.IlacCategory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aybala
 */
public class IlacList {

    private List<IlacCategory> IlacCategoryList = new ArrayList<>();

    //IlacCategory list e bağımlı haldedir .
    public void insert(IlacCategory c) {
        this.IlacCategoryList.add(c);
    }
    public void delete(IlacCategory c,int n){
        this.IlacCategoryList.remove(n);
    }
    public void delete(IlacCategory c){
        this.IlacCategoryList.remove(c);
    }

    public List<IlacCategory> getList() {
        return this.IlacCategoryList;
    }

    public int size() {
        return IlacCategoryList.size();
    }

}
