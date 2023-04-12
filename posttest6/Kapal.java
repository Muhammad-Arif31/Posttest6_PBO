/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author User
 */
public abstract class Kapal implements Hitung {
    private int no;
    private String nama_kapal;
    private String warna_kapal;
    private int harga;
    private String asal_kapal;
    
    //overload
    Kapal(int no,String nama,String warna,int price,String negara){
        this.no = no;
        this.nama_kapal = nama;
        this.warna_kapal = warna;
        this.harga = price;
        this.asal_kapal = negara;
    }
    
    //overload
    Kapal(){
        this.no = 0;
        this.nama_kapal = "";
        this.warna_kapal = "";
        this.harga = 0;
        this.asal_kapal = "";
    }
    
    Kapal(int no, String nama_kapal){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getno(){
        return no;
    }
    
    public String getnama(){
        return nama_kapal;
    }

    public String getwarna(){
        return warna_kapal;
    }

    public int getprice(){
        return harga;
    }
    
    public String getasal(){
        return asal_kapal;
    }
    
    public void setNo(int no){
        this.no = no;
    }
    
    public void setNama_Kapal(String nama_kapal){
        this.nama_kapal = nama_kapal;
    }
    
    public void setWarna_Kapal(String warna_kapal){
        this.warna_kapal = warna_kapal;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void setAsal_Kapal(String asal_kapal){
        this.asal_kapal = asal_kapal;
    }
    
    public void penghitungTotalHarga(int harga){
        System.out.println("Total Harga = "+harga);
    }
    
    protected abstract void Sukses();
    
    protected abstract void Gagal();
    
    protected abstract void Diubah();
}