package T2_233040015_latihan;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println(x.getNrp()); // Output: 02

        Student z = new Student();
        z.setNrp("03");
        x = z;
        System.out.println(x.getNrp()); // Output: 03
        System.out.println(y.getNrp()); // Output: 02

        // Menyimpan objek Student menggunakan Persistence
        Persistence persistence = new Persistence();
        persistence.save(x); // Menyimpan Student dengan NRP 03
        persistence.save(y); // Menyimpan Student dengan NRP 02
    }
}
