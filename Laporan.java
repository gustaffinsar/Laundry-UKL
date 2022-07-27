/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryukl;

/**
 *
 * @author asus
 */
public class Laporan {
    public void laporan (jenislaundry jenisLaundry){
        
        int x = jenisLaundry.getjmlbarang();
        
        System.out.println("============ BURSA LAUNDRY ============"
                + "");
        System.out.println("");
        System.out.println("Jenis Laundry");
        System.out.println("");
        System.out.println("ID \tJenis Laundry \tDurasi(menit) \tHarga/kg");
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" + jenisLaundry.getjenislaundry(i) + "\t" +
            jenisLaundry.getdurasi(i) + "hr" + "\t" + "\t" + jenisLaundry.getharga(i) + "/kg");
        }
    }
    
    public void laporan(clients client){
        
        int x = client.getJmlclients();
        
        System.out.println("");
        System.out.println("Nama Client");
        System.out.println("");
        System.out.println("ID \tNama \tTelepon \t\tSaldo");
        
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" + client.getNama(i) + "\t"
            + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
    }
    
    public void laporan(transaksi transaksi, jenislaundry jenisLaundry){
        
        int x = transaksi.getJmlTransaksi();
        
        System.out.println("");
        System.out.println("Laporan Transaksi");
        System.out.println("");
        System.out.println("ID \tJenis Laundry \tJumlah(kg) \tHarga(kg) \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getharga(transaksi.getIdJenisLaundry(i));
            total += jumlah;
            
            System.out.println(i + "\t" + jenisLaundry.getjenislaundry(transaksi.getIdJenisLaundry(i)) + "\t" +
            transaksi.getBanyaknya(i) + "kg" + "\t" + "\t" + jenisLaundry.getharga(transaksi.getIdJenisLaundry(i)) + "/kg" + "\t" + "\t"
            + jumlah);
        }
        System.out.println("Total = " + total);
    }

}
