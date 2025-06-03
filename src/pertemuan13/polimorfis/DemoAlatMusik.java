package pertemuan13.polimorfis;


public class DemoAlatMusik {
public static void main(String[] args) {
   AlatMusik a1 = new Gitar();   // Polymorphism
   AlatMusik a2 = new Piano();   // Polymorphism
   AlatMusik a3 = new Drum();    // Polymorphism

   a1.mainkan(); // Output: Memetik gitar
   a2.mainkan(); // Output: Menekan tuts piano
   a3.mainkan(); // Output: Memukul drum
}
}
