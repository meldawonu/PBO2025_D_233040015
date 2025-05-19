package P9.L4;

public class InheritanceMain {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("1004", "Ade Sukendar", "Bandung");
		System.out.println(mhs.getNrp()+ 
				"-"+ mhs.getAlamat()+
				"-"+ mhs.getNama());
	}
}

