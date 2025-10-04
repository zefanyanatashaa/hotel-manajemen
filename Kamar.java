package com.hotelmanagement;

public class Kamar {
    private int nomorKamar;
    private String tipe;
    private double hargaPerMalam;
    private boolean tersedia;

    public Kamar(int nomorKamar, String tipe, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.tipe = tipe;
        this.hargaPerMalam = hargaPerMalam;
        this.tersedia = true;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void tampilkanInfo() {
        System.out.printf("Kamar %d (%s) - Rp%.2f/malam - %s%n",
                nomorKamar, tipe, hargaPerMalam, (tersedia ? "Tersedia" : "Terisi"));
    }
}
