package com.hotelmanagement;

public class Tamu {
    private String nama;
    private String nomorIdentitas;

    public Tamu(String nama, String nomorIdentitas) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Tamu: " + nama + " | ID: " + nomorIdentitas);
    }
}
