/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author User
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MerchantShip {

    Scanner Masukkan = new Scanner(System.in);
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(input);

    public void tambahData(ArrayList<KapalPenumpang> passenger) throws IOException {
        clearScreen();

        int no_kapal;
        String nama_kapal;
        String warna_kapal;
        int harga_kapal;
        String asal_kapal;
        int jumlah_kapal;
        KapalPenumpang.label();
        System.out.print("No.Kapal          : ");
        no_kapal = Integer.parseInt(br.readLine());
        System.out.print("Nama Kapal        : ");
        nama_kapal = br.readLine();
        System.out.print("Warna Kapal       : ");
        warna_kapal = br.readLine();
        System.out.print("Harga Kapal       : ");
        harga_kapal = Masukkan.nextInt();
        System.out.print("Asal Kapal        : ");
        asal_kapal = br.readLine();
        System.out.print("Jumlah Kapal      : ");
        jumlah_kapal = Masukkan.nextInt();

        KapalPenumpang kapalpenumpang = new KapalPenumpang();
        kapalpenumpang.setQuantity(jumlah_kapal);
        kapalpenumpang.setNo(no_kapal);
        kapalpenumpang.setNama_Kapal(nama_kapal);
        kapalpenumpang.setWarna_Kapal(warna_kapal);
        kapalpenumpang.setHarga(harga_kapal);
        kapalpenumpang.setAsal_Kapal(asal_kapal);
        kapalpenumpang.penghitungTotalHarga(kapalpenumpang.getprice(),kapalpenumpang.getQuantity());
        kapalpenumpang.tanggal();

        passenger.add(kapalpenumpang);
        kapalpenumpang.Sukses();
    }

    public void tambahData2(ArrayList<KapalBarang> cargo) throws IOException {
        clearScreen();

        int no_kapal;
        String nama_kapal;
        String warna_kapal;
        int harga_kapal;
        String asal_kapal;
        int jumlah_kapal;
        KapalBarang.label();
        System.out.print("No.Kapal          : ");
        no_kapal = Integer.parseInt(br.readLine());
        System.out.print("Nama Kapal        : ");
        nama_kapal = br.readLine();
        System.out.print("Warna Kapal       : ");
        warna_kapal = br.readLine();
        System.out.print("Harga Kapal       : ");
        harga_kapal = Masukkan.nextInt();
        System.out.print("Asal Kapal        : ");
        asal_kapal = br.readLine();
        System.out.print("Jumlah Kapal      : ");
        jumlah_kapal = Masukkan.nextInt();

        KapalBarang kapalbarang = new KapalBarang();
        kapalbarang.setQuantity(jumlah_kapal);
        kapalbarang.setNo(no_kapal);
        kapalbarang.setNama_Kapal(nama_kapal);
        kapalbarang.setWarna_Kapal(warna_kapal);
        kapalbarang.setHarga(harga_kapal);
        kapalbarang.setAsal_Kapal(asal_kapal);
        kapalbarang.penghitungTotalHarga(kapalbarang.getprice(),kapalbarang.getQuantity());
        kapalbarang.tanggal();

        cargo.add(kapalbarang);
        kapalbarang.Sukses();
    }

    public void ubahData(ArrayList<KapalPenumpang> passenger) throws IOException {
        clearScreen();

        int no_kapal;
        String nama_kapal;
        String warna_kapal;
        int harga_kapal;
        String asal_kapal;
        int jumlah_kapal;  
        KapalPenumpang.label();
        System.out.print("Pilih Indeks Kapal yang ingin diubah : ");
        int pilihan = Masukkan.nextInt();
        System.out.println("====Data Sebelumnya====");
        System.out.println("No.Kapal     : " + passenger.get(pilihan).getno());
        System.out.println("Nama Kapal   : " + passenger.get(pilihan).getnama());
        System.out.println("Warna Kapal  : " + passenger.get(pilihan).getwarna());
        System.out.println("Harga Kapal  : " + passenger.get(pilihan).getprice());
        System.out.println("Asal Kapa    : " + passenger.get(pilihan).getasal());
        System.out.println("Jumlah Kapal : " + passenger.get(pilihan).getQuantity());
        System.out.println("");
        System.out.println("====Data Baru====");
        System.out.print("No.Kapal          : ");
        no_kapal = Integer.parseInt(br.readLine());
        System.out.print("Nama Kapal        : ");
        nama_kapal = br.readLine();
        System.out.print("Warna Kapal       : ");
        warna_kapal = br.readLine();
        System.out.print("Harga Kapal       : ");
        harga_kapal = Masukkan.nextInt();
        System.out.print("Asal Kapal        : ");
        asal_kapal = br.readLine();
        System.out.print("Jumlah Kapal      : ");
        jumlah_kapal = Masukkan.nextInt();

        passenger.get(pilihan).setNo(no_kapal);
        passenger.get(pilihan).setNama_Kapal(nama_kapal);
        passenger.get(pilihan).setWarna_Kapal(warna_kapal);
        passenger.get(pilihan).setHarga(harga_kapal);
        passenger.get(pilihan).setAsal_Kapal(asal_kapal);
        passenger.get(pilihan).setQuantity(jumlah_kapal);
        passenger.get(pilihan).penghitungTotalHarga(passenger.get(pilihan).getprice(),passenger.get(pilihan).getQuantity());
        
        KapalPenumpang kapalpenumpang = new KapalPenumpang();
        kapalpenumpang.Diubah();
    }

    public void ubahData2(ArrayList<KapalBarang> cargo) throws IOException {
        clearScreen();

        int no_kapal;
        String nama_kapal;
        String warna_kapal;
        int harga_kapal;
        String asal_kapal;
        int jumlah_kapal;
        KapalBarang.label();
        System.out.print("Pilih Indeks Kapal yang ingin diubah : ");
        int pilihan = Masukkan.nextInt();
        System.out.println("====Data Sebelumnya====");
        System.out.println("No.Kapal     : " + cargo.get(pilihan).getno());
        System.out.println("Nama Kapal   : " + cargo.get(pilihan).getnama());
        System.out.println("Warna Kapal  : " + cargo.get(pilihan).getwarna());
        System.out.println("Harga Kapal  : " + cargo.get(pilihan).getprice());
        System.out.println("Asal Kapa    : " + cargo.get(pilihan).getasal());
        System.out.println("Jumlah Kapal : " + cargo.get(pilihan).getQuantity());
        System.out.println("");
        System.out.println("====Data Baru====");
        System.out.print("No.Kapal          : ");
        no_kapal = Integer.parseInt(br.readLine());
        System.out.print("Nama Kapal        : ");
        nama_kapal = br.readLine();
        System.out.print("Warna Kapal       : ");
        warna_kapal = br.readLine();
        System.out.print("Harga Kapal       : ");
        harga_kapal = Masukkan.nextInt();
        System.out.print("Asal Kapal        : ");
        asal_kapal = br.readLine();
        System.out.print("Jumlah Kapal      : ");
        jumlah_kapal = Masukkan.nextInt();

        cargo.get(pilihan).setNo(no_kapal);
        cargo.get(pilihan).setNama_Kapal(nama_kapal);
        cargo.get(pilihan).setWarna_Kapal(warna_kapal);
        cargo.get(pilihan).setHarga(harga_kapal);
        cargo.get(pilihan).setAsal_Kapal(asal_kapal);
        cargo.get(pilihan).setQuantity(jumlah_kapal);
        cargo.get(pilihan).penghitungTotalHarga(cargo.get(pilihan).getprice(),cargo.get(pilihan).getQuantity());
        
        KapalBarang kapalbarang = new KapalBarang();
        kapalbarang.Diubah();
    }

    public void hapusData(ArrayList<KapalPenumpang> passenger) {
        clearScreen();
        
        String hapus;
        System.out.print("Masukkan Indeks Kapal yang ingin dihapus : ");
        hapus = Masukkan.next();
        passenger.remove((int) Integer.valueOf(hapus));
        KapalPenumpang kapalpenumpang = new KapalPenumpang();
        kapalpenumpang.Gagal();
    }

    public void hapusData2(ArrayList<KapalBarang> cargo) {
        clearScreen();
        
        String hapus;
        System.out.print("Masukkan Indeks Kapal yang ingin dihapus : ");
        hapus = Masukkan.next();
        cargo.remove((int) Integer.valueOf(hapus));
        KapalBarang kapalbarang = new KapalBarang();
        kapalbarang.Gagal();
    }

    public void showData(ArrayList<KapalPenumpang> passenger) {
        clearScreen();
        final String jenis = "Penumpang";
        for (int i = 0; i < passenger.size(); i++) {
            System.out.println("|==================================|");
            System.out.println("Kapal "+ jenis);
            System.out.println("Indeks Kapal = " + i);
            System.out.println("No.Kapal     = " + passenger.get(i).getno());
            System.out.println("Nama Kapal   = " + passenger.get(i).getnama());
            System.out.println("Warna Kapal  = " + passenger.get(i).getwarna());
            System.out.println("Harga        = " + passenger.get(i).getprice());
            System.out.println("Asal Kapal   = " + passenger.get(i).getasal());
            System.out.println("Jumlah Kapal = " + passenger.get(i).getQuantity());
            passenger.get(i).penghitungTotalHarga2(passenger.get(i).getprice(), passenger.get(i).getQuantity());
            System.out.println("|==================================|");
        }
    }

    public void showData2(ArrayList<KapalBarang> cargo) {
        clearScreen();
        final String jenis = "Barang";
        for (int i = 0; i < cargo.size(); i++) {
            System.out.println("|==================================|");
            System.out.println("Kapal "+ jenis);
            System.out.println("Indeks Kapal = " + i);
            System.out.println("No.Kapal     = " + cargo.get(i).getno());
            System.out.println("Nama Kapal   = " + cargo.get(i).getnama());
            System.out.println("Warna Kapal  = " + cargo.get(i).getwarna());
            System.out.println("Harga        = " + cargo.get(i).getprice());
            System.out.println("Asal Kapal   = " + cargo.get(i).getasal());
            System.out.println("Jumlah Kapal = " + cargo.get(i).getQuantity());
            cargo.get(i).penghitungTotalHarga2(cargo.get(i).getprice(), cargo.get(i).getQuantity());
            System.out.println("|==================================|");
        }
    }

    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
        
    }
}