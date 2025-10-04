package com.hotelmanagement;

public class Reservasi {
    private Tamu[] daftarTamu;
    private Kamar[] daftarKamar;
    private int jumlahReservasi;

    public Reservasi(int kapasitas) {
        daftarTamu = new Tamu[kapasitas];
        daftarKamar = new Kamar[kapasitas];
        jumlahReservasi = 0;
    }

    public void pesanKamar(Tamu tamu, Kamar kamar, int malam) {
        if (kamar.isTersedia()) {
            daftarTamu[jumlahReservasi] = tamu;
            daftarKamar[jumlahReservasi] = kamar;
            kamar.setTersedia(false);
            double total = kamar.getHargaPerMalam() * malam;

            System.out.println("\n✅ Reservasi berhasil!");
            System.out.println("Tamu: " + tamu.getNama());
            System.out.println("Kamar: " + kamar.getNomorKamar() + " (" + kamar.getTipe() + ")");
            System.out.println("Lama Menginap: " + malam + " malam");
            System.out.println("Total Biaya: Rp" + total);

            jumlahReservasi++;
        } else {
            System.out.println("❌ Kamar tidak tersedia!");
        }
    }

    public void tampilkanReservasi() {
        System.out.println("\n=== Daftar Reservasi ===");
        if (jumlahReservasi == 0) {
            System.out.println("Belum ada reservasi.");
        } else {
            for (int i = 0; i < jumlahReservasi; i++) {
                System.out.println((i + 1) + ". " + daftarTamu[i].getNama() +
                        " memesan kamar " + daftarKamar[i].getNomorKamar() + " (" + daftarKamar[i].getTipe() + ")");
            }
        }
    }
}
