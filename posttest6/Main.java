/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest6;

/**
 *
 * @author User
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        MerchantShip merchantship = new MerchantShip();
        ArrayList<KapalPenumpang> passenger =  new ArrayList<>();
        ArrayList<KapalBarang> cargo =  new ArrayList<>();
        Scanner Masukkan = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        
        while (true){
            System.out.println("\n/==========================\\");
            System.out.println("| No| Menu Pendataan Kapal |");
            System.out.println("|==========================|");
            System.out.println("| 1.| Tambah Data          |");
            System.out.println("| 2.| Lihat Data           |");
            System.out.println("| 3.| Ubah Data            |");
            System.out.println("| 4.| Hapus Data           |");
            System.out.println("| 5.| Keluar               |");
            System.out.println("\\==========================/");
            System.out.print("Masukkan Pilihanmu [1-5] : ");
            int pilihan = Masukkan.nextInt();
            if (pilihan == 1){
                System.out.println("/================================\\");
                System.out.println("| No| Menu Pendataan Kapal        |");
                System.out.println("|=================================|");
                System.out.println("| 1.| Tambah Data Kapal Penumpang |");
                System.out.println("| 2.| Tambah Data Kapal Barang    |");
                System.out.println("\\================================/");
                System.out.print("Masukkan Pilihanmu [1-2] : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    merchantship.tambahData(passenger);
                } else if (pilih == 2) {
                    merchantship.tambahData2(cargo);
                }
            }else if(pilihan == 2){
                System.out.println("/================================\\");
                System.out.println("| No| Menu Pendataan Kapal        |");
                System.out.println("|=================================|");
                System.out.println("| 1.| Lihat Data Kapal Penumpang  |");
                System.out.println("| 2.| Lihat Data Kapal Barang     |");
                System.out.println("\\================================/");
                System.out.print("Masukkan Pilihanmu [1-2] : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    merchantship.showData(passenger);
                } else if (pilih == 2) {
                    merchantship.showData2(cargo);
                }
            }else if(pilihan == 3){
                System.out.println("/================================\\");
                System.out.println("| No| Menu Pendataan Kapal        |");
                System.out.println("|=================================|");
                System.out.println("| 1.| Ubah Data Kapal Penumpang   |");
                System.out.println("| 2.| Ubah Data Kapal Barang      |");
                System.out.println("\\================================/");
                System.out.print("Masukkan Pilihanmu [1-2] : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    merchantship.ubahData(passenger);
                } else if (pilih == 2) {
                    merchantship.ubahData2(cargo);
                }
            }else if(pilihan == 4){
                System.out.println("/================================\\");
                System.out.println("| No| Menu Pendataan Kapal        |");
                System.out.println("|=================================|");
                System.out.println("| 1.| Hapus Data Kapal Penumpang  |");
                System.out.println("| 2.| Hapus Data Kapal Barang     |");
                System.out.println("\\================================/");
                System.out.print("Masukkan Pilihanmu [1-2] : ");
                int pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    merchantship.hapusData(passenger);
                } else if (pilih == 2) {
                    merchantship.hapusData2(cargo);
                }
            }else if(pilihan == 5){
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                System.exit(0);
            } else {
                System.out.println("Kamu salah memasukkan pilihan menu!");
            }
        }
    }  
}
