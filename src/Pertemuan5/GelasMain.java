package Pertemuan5;

public class GelasMain {
	public static void main(String[] args)
	{
		Gelas g1 = new Gelas("Hitam");
		Gelas g2 = new Gelas("Biru");
		
		tukarWarnaGelas(g1, g2);
		System.out.println("Warna g1:" + g1.getWarna());
		System.out.println("Warna g2:" + g2.getWarna());
	}
	
	 static void tukarWarnaGelas (Gelas g1, Gelas g2) {
		Gelas gtemp = new Gelas ("Temp");
		gtemp.setWarna(g1.getWarna());
		g1.setWarna(g2.getWarna());
		//g1 value hitam g2 biru
		g2.setWarna(gtemp.getWarna());
		//ambil w g2, kasi k g1
	}
	
}
