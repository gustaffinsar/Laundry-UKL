/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryukl;

import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class jenislaundry {
    private ArrayList<String> jenislaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    public jenislaundry(){
        this.jenislaundry.add("cuci setrika");
        this.harga.add(12000);
        this.durasi.add(60);
        
        this.jenislaundry.add("cuci kering");
        this.harga.add(8000);
        this.durasi.add(40);
        
        this.jenislaundry.add("cuci basah");
        this.harga.add(6000);
        this.durasi.add(20);
    }
    public int getjmlbarang(){
        return this.jenislaundry.size();
    }
    public void setjenislaundry(String jenislaundry){
        this.jenislaundry.add(jenislaundry);
    }
    public String getjenislaundry(int idjenislaundry){
        return this.jenislaundry.get(idjenislaundry);
    }
    public void setharga(int harga){
        this.harga.add(harga);
    }
    public int getharga(int idjenislaundry){
        return this.harga.get(idjenislaundry);
    }
    public void setdurasi(int durasi){
        this.durasi.add(durasi);
    }
    public int getdurasi(int idlaundry){
        return this.durasi.get(idlaundry);
    }
    public void editDurasi(int idlaundry, int durasi){
        this.durasi.set(idlaundry,durasi);
    }
    


}
