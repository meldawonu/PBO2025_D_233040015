package Pertemuan6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek mata kuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("Semester 1");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);
        khs.hitungIPS(); // Hitung IPS untuk KHS

        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK(); // Hitung IPK berdasarkan semua KHS
        transkrip.display(); // Tampilkan transkrip nilai
    }
}
