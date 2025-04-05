package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;
    // Constructor
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }
    // Method untuk menambahkan mata kuliah
    public void addMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }
    // Method untuk menampilkan daftar mata kuliah
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        sb.append("Daftar Mata Kuliah:\n");
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }
    
    // Method untuk menghitung IPS
    public void hitungIPS() {
        if (daftarMataKuliah.isEmpty()) {
            ips = 0.0;
            return;
        }

        double totalBobot = 0.0;
        double totalSks = 0.0;

        for (MataKuliah mk : daftarMataKuliah) {
            totalBobot += mk.getNilaiAngka() * mk.getSks();
            totalSks += mk.getSks();
        }

        ips = (totalSks > 0) ? (totalBobot / totalSks) : 0.0;
    }

    // Getter dan Setter
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }
}
