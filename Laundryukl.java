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
public class Laundryukl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jenislaundry daftarJenisLaundry = new jenislaundry();
        clients daftarClient = new clients();
        petugas petugas1 = new petugas();
        transaksi transaksiLaundry = new transaksi();
        Laporan LaporanLaundry = new Laporan();
        
        LaporanLaundry.laporan(daftarJenisLaundry);
        LaporanLaundry.laporan(daftarClient);
        LaporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        

   
    }
    
}
