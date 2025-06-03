package pertemuan14.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("233040015", "Melda");
        Mahasiswa mhs2 = new Mahasiswa("233040170", "Wonwoo");
        Mahasiswa mhs3 = new Mahasiswa("233040171", "Mingyu");
        
        System.out.println("Informasi Mahasiswa");
        System.out.println();
        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
        System.out.println();
        mhs3.displayInfo();
        
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Batas Maksimum SKS untuk semua mahasiswa: " + Mahasiswa.MAX_SKS);
    }
}