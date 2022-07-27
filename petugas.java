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
public class petugas implements user{
    private ArrayList<String> namapetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public petugas(){
        
        this.namapetugas.add("angel");
        this.alamat.add("nganjuk");
        this.telepon.add("08xx");
        this.jabatan.add(0);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
   
    public int getJmlpetugas(){
        return this.namapetugas.size();
    }
    
     @Override
     public void setNama(String namapetugas){
         this.namapetugas.add(namapetugas);
     }
      public void setAlamat(String alamat){
         this.namapetugas.add(alamat);
     }
     @Override
      public void setTelepon(String telepon){
         this.namapetugas.add(telepon);   
     }
      
      
     @Override
      public String getNama(int idpetugas){
         return this.namapetugas.get(idpetugas);
     }
     @Override
       public String getAlamat(int idpetugas){
         return this.alamat.get(idpetugas);
     }
     @Override
        public String getTelepon(int idpetugas){
         return this.telepon.get(idpetugas);
     }
        
}
