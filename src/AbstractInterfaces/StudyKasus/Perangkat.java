package AbstractInterfaces.StudyKasus;

public abstract class Perangkat {
    protected String nama; 
    protected int baterai;
//    String nama, int bateraivariabel yang hanya bia diakses oleh kelasnya atau kelas inheritance

    public Perangkat(String nama, int baterai) {
        this.nama = nama;
        this.baterai = baterai;
    }
    
    
//fungsi untuk aktivitas perangkat (perangkat terhubung, lagu yang sedang diputar, baterai) info
    public void sambungkan(String perangkatTujuan) {
        System.out.println("Perangkat terhubung: " + perangkatTujuan);
    }

    public void mainkanMusik(String lagu) {
        System.out.println("Memutar lagu: " + lagu);
    }

    public void statusBaterai() {
    	   System.out.println("Baterai: " + baterai + "%");
    }

    public abstract void info();
}
