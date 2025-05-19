package P9.T4;

public class InheritanceMain {
	public static void main(String[] args) {
		Mobil mbl = new Mobil ("Volvo XC90", "Bensin", "1969cc");
		System.out.println(mbl.getNama()+ 
				"-"+ mbl.getBBM()+
				"-"+ mbl.getCC());
	}
}

