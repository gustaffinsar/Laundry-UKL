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
public class clients implements user{
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public clients(){
        this.namaClient.add("andi");
        this.alamat.add("malang");
        this.telepon.add("08xx");
        this.saldo.add(1000000);
        
        this.namaClient.add("edo");
        this.alamat.add("sawojajar");
        this.telepon.add("08xx");
        this.saldo.add(200000);
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idclients){
        return this.saldo.get(idclients);
    }
    public void editSaldo(int idclients, int saldo){
        this.saldo.add(idclients,saldo);
    }
    public int getJmlclients(){
        return this.saldo.size();
    }
    
    @Override
     public void setNama(String namaclient){
         this.namaClient.add(namaclient);
     }
      public void setAlamat(String alamat){
         this.alamat.add(alamat);
     }
    @Override
      public void setTelepon(String telepon){
         this.namaClient.add(telepon);   
     }
      
      
    @Override
      public String getNama(int idclient){
         return this.namaClient.get(idclient);
     }
    @Override
       public String getAlamat(int idclient){
         return this.alamat.get(idclient);
     }
    @Override
        public String getTelepon(int idclient){
         return this.telepon.get(idclient);
     }
      


}
