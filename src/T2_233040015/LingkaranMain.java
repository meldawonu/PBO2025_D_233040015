package T2_233040015;
public class LingkaranMain {
    public static void main(String[] args) {
        // Referensi objek dengan lebih dari satu variabel
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1; // l2 juga merujuk ke objek yang sama

        System.out.println("Sebelum perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2()); 
        System.out.println("l2 jari-jari: " + l2.getJari2()); 

      //ubah jari2
        ubahJari2(l2);

        System.out.println("Setelah perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2()); 
        System.out.println("l2 jari-jari: " + l2.getJari2()); 

        // Contoh objek = null
        l2 = null;
        System.out.println("Setelah l2 di-null-kan:");
        System.out.println("l1 jari-jari: " + l1.getJari2()); //  bisa diakses

        if (l2 != null) {
            System.out.println("l2 jari-jari: " + l2.getJari2());
        } else {
            System.out.println("l2 tidak mereferensi objek!");
        }
    }
    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(10);
    }
}
