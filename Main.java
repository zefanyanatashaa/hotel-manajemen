package com.hotelmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data kamar awal
        Kamar[] kamarList = {
            new Kamar(101, "Standard", 350000),
            new Kamar(102, "Deluxe", 500000),
            new Kamar(103, "Suite", 750000)
        };

        Reservasi reservasi = new Reservasi(10);

        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN HOTEL ===");
            System.out.println("1. Lihat Daftar Kamar");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Lihat Reservasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            // Validasi input agar tidak error
            while (!input.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan angka 1-4.");
                System.out.print("Pilih menu: ");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1 -> {
                    System.out.println("\n=== Daftar Kamar ===");
                    for (Kamar k : kamarList) {
                        k.tampilkanInfo();
                    }
                }

                case 2 -> {
                    System.out.print("Masukkan nama tamu: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan nomor identitas: ");
                    String id = input.nextLine();
                    Tamu tamu = new Tamu(nama, id);

                    System.out.println("\nPilih nomor kamar yang ingin dipesan:");
                    for (Kamar k : kamarList) {
                        k.tampilkanInfo();
                    }

                    System.out.print("Masukkan nomor kamar: ");
                    int nomor = input.nextInt();
                    System.out.print("Berapa malam akan menginap? ");
                    int malam = input.nextInt();

                    // Cari kamar berdasarkan nomor
                    Kamar kamarDipilih = null;
                    for (Kamar k : kamarList) {
                        if (k.getNomorKamar() == nomor) {
                            kamarDipilih = k;
                            break;
                        }
                    }

                    if (kamarDipilih != null) {
                        reservasi.pesanKamar(tamu, kamarDipilih, malam);
                    } else {
                        System.out.println("Kamar tidak ditemukan!");
                    }
                }

                case 3 -> {
                    System.out.println("\n=== Daftar Reservasi ===");
                    reservasi.tampilkanReservasi();
                }

                case 4 -> System.out.println("Terima kasih telah menggunakan Sistem Manajemen Hotel!");

                default -> System.out.println("Pilihan tidak valid. Coba lagi!");
            }

        } while (pilihan != 4);

        input.close();
    }
}
