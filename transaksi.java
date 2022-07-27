/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryukl;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class transaksi {
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    
    public void prosesTransaksi(clients client, transaksi transaksi, jenislaundry jenisLaundry){
        Scanner myObj = new Scanner(System.in);
        System.out.println("");
        System.out.println("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient));
        
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode jenis laundry (masukkan kode 99 untuk berhenti): ");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenisLaundry.add(temp);
                System.out.println(jenisLaundry.getjenislaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);
        
        System.out.println("");
        System.out.println("Transaksi Laundry " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("");
        System.out.println("Jenis Laundry \tBanyak(kg) \tHarga \tJumlah \t");
        
        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getharga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getjenislaundry(idJenisLaundry.get(j)) + "\t"
                    + banyak.get(j) + "\t" + "\t" 
                    + jenisLaundry.getharga(idJenisLaundry.get(j)) + "/kg" + "\t"
                    + jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),
                    banyak.get(j));
        }
        
        System.out.println("");
        System.out.println("Total Laundry = " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        System.out.println("Sisa Saldo " +  client.getNama(idClient) + " = "+  client.getSaldo(idClient));
        System.out.println("");
    }
    
    public void setTransaksi(jenislaundry jenislaundry, int idClient, int idjenislaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idjenislaundry);
        this.banyak.add(banyaknya);
        jenislaundry.editDurasi(idjenislaundry, jenislaundry.getdurasi(idjenislaundry));
    }
    
    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdClient(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
    



}
