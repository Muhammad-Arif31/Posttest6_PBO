/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author User
 */

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class KapalBarang extends Kapal implements Hitung {
    
    //sub-class kapal barang dari class kapal
    private int quantity;
    
    public KapalBarang(int no,String nama,String warna,int price,String negara){
        super(no, nama, warna, price, negara);
        this.quantity = quantity;
    }
    
    public KapalBarang(){
        this.quantity = 0;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void penghitungTotalHarga(int harga,int quantity){
        int total_harga = harga*quantity;
        System.out.println("Total Harga       : "+total_harga);
    }
    
    public void penghitungTotalHarga2(int harga,int quantity){
        int total_harga = harga*quantity;
        System.out.println("Total Harga  = "+total_harga);
    }
    
    public void tanggal(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatdatetime = now.format(formatter);
        System.out.println("Tanggal Penambahan "+formatdatetime);
    }
    
    static public void label(){
        System.out.println("\n====Form Kapal Barang====");
    }
    
    @Override
    public final void Sukses(){
        System.out.println("Data Kapal ditambahkan ke dalam Daftar");
    }
    
    @Override
    public final void Gagal(){
        System.out.println("Data Kapal dihapus dari Daftar");
    }
    
    @Override
    public final void Diubah(){
        System.out.println("Data Kapal dalam daftar telah diupdate ");
    }
}
