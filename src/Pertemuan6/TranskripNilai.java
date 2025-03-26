package Pertemuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    // Constructor
    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date(); // Set tanggal cetak saat objek dibuat
    }

    // Method untuk menghitung IPK
    public void hitungIPK() {
        if (kartuHasilStudi.isEmpty()) {
            ipk = 0.0;
            return;
        }

        double totalNilai = 0.0;
        double totalSKS = 0.0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS(); // Hitung IPS untuk setiap KHS
            double ips = khs.getIps();
            int sks = khs.getDaftarMataKuliah().size() * 3; // Asumsi setiap mata kuliah 3 SKS

            totalNilai += ips * sks;
            totalSKS += sks;
        }

        ipk = (totalSKS > 0) ? (totalNilai / totalSKS) : 0.0;
    }

    // Method untuk menambahkan KHS
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    // Method untuk menampilkan transkrip nilai
    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);

        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    // Getter dan Setter
    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
