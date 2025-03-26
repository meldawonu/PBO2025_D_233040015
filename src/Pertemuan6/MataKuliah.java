package Pertemuan6;

import java.util.*;

// Kelas MataKuliah
class MataKuliah {
    private String kode, nama, nilaiHuruf;
    private int sks;
    private double nilaiAngka;

    public MataKuliah(String kode, String nama, String nilaiHuruf, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilaiHuruf = nilaiHuruf;
        this.sks = sks;
        this.nilaiAngka = konversiNilai(nilaiHuruf);
    }

    private double konversiNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }

    public int getSks() { return sks; }
    public double getNilaiAngka() { return nilaiAngka; }
    public String display() {
        return kode + " - " + nama + " (" + sks + " SKS) - Nilai: " + nilaiHuruf;
    }
}