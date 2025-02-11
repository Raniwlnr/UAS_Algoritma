/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projekuas;

/**
 *
 * @author Rani Wulan
 */
// Mengimpor semua kelas dari package java.util
import java.util.*;
public class ProjekUAS {
    // Deklarasi variabel instance untuk menyimpan data dokter
    String nama;
    String spesialis;
    String jadwal;
    
    // Constructor untuk menginisialisasi objek dokter
    public ProjekUAS(String nama, String spesialis, String jadwal) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.jadwal = jadwal;
    }
    
    // Metode getter untuk mendapatkan nama dokter, Spesialis, Jadwal
    public String Nama() {
        return nama;
    }
     
    public String Spesialis() {
        return spesialis;
    }
    
    public String Jadwal() {
        return jadwal;
    }
    
    // Metode utama (main) untuk menjalankan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek scanner untuk input pengguna
        List<ProjekUAS> daftarDokter = new ArrayList<>(); // List untuk menyimpan daftar dokter
        
        while (true) { // Perulangan utama menu
             System.out.println("\n==== Sistem pengelolaan Jadwal Dokter ====");
             System.out.println("1. Tambah Dokter");
             System.out.println("2. Tampilkan Jadwal Dokter");
             System.out.println("3. Cari dokter Berdasarkan Spesialisasi");
             System.out.println("4. Hapus Dokter");
             System.out.println("5. Keluar");
             System.out.print("Pilih Menu: ");
             int menu = input.nextInt(); // Membaca pilihan menu dari pengguna
             System.out.println("==========================================\n");
             input.nextLine(); // Membersihkan buffer input
             
             // Menu Tambah Dokter
             if (menu == 1){
                System.out.print("Masukkan Nama Dokter       : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Spesialisasi dokter : ");
                String spesialis = input.nextLine();
                System.out.print("Masukkan Jadwal Dokter       : ");
                String jadwal = input.nextLine();
                
                // Menambahkan dokter baru ke daftar
                ProjekUAS dokter = new ProjekUAS(nama, spesialis, jadwal);
                daftarDokter.add(dokter);
                System.out.println("Dokter Berhasil ditambahkan!!");
             }
             
             // Menu Tampilkan Daftar Dokter
             else if (menu == 2){
                 if (daftarDokter.isEmpty()){
                      System.out.println("\nBelum Ada Dokter Terdaftar!!");
                 }else {
                      System.out.println("Daftar dokter dan Jadwal Prakteknya:");
                      int i = 1; // Menyiapkan nomor urut dokter
                        for (ProjekUAS dokter : daftarDokter) {
                            System.out.println(i + ". " + "Dr. " + dokter.Nama() + " - " + dokter.Spesialis() + " - " + dokter.Jadwal());
                            i++; // Increment nomor urut
                        }
                 }
             }
             
              // Menu Cari Dokter Berdasarkan Spesialisasi
             else if (menu == 3){
                System.out.print("Masukkan Spesialisasi yang dicari  : ");
                String cariSpesialis = input.nextLine();
                boolean ditemukan = false;
                for (ProjekUAS dokter : daftarDokter){
                    if (dokter.Spesialis().equalsIgnoreCase(cariSpesialis)) {
                        System.out.println("Dr. " + dokter.Nama() + "-" + dokter.Jadwal());
                        ditemukan = true;
                    
                    }
                }
                if(!ditemukan) {
                    System.out.println("DOKTER DENGAN SPESIALISASI " + "(" + cariSpesialis + ")" + " TIDAK DITEMUKAN!");
                }
             }
             
              // Menu Hapus Dokter
             else if (menu == 4){
                System.out.print("Masukkan nama dokter yang ingin dihapus: ");
                    String namaHapus = input.nextLine();
                    boolean dihapus = daftarDokter.removeIf(dokter -> dokter.Nama().equalsIgnoreCase(namaHapus));
                    if (dihapus) {
                        System.out.println("Dokter berhasil dihapus.");
                    } else {
                        System.out.println("Dokter tidak ditemukan.");
                    }
             }
             
              // Menu Keluar dari Program
             else if (menu == 5) {
                System.out.println("Terima kasih!");
                    break;  // Keluar dari perulangan utama
             }    
            
               // Jika Pilihan Tidak Valid
             else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
             }
        }
        input.close(); // Menutup scanner setelah selesai
    }
}
