package Pertemuan6;

public class Mahasiswa {
    private String NRP;
    private String nama;

  

    // Constructor dengan parameter
    public Mahasiswa(String nRP, String nama) {
        super();
        this.NRP = nRP;
        this.nama = nama;
    }

    // Method untuk menampilkan data mahasiswa
    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    // Setter dan Getter
    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
