package P9.T4;

public class Mobil extends Kendaraan{
	private String cc;
	
	public Mobil (String nama, String bbm, String cc) {
		super(nama, bbm);
		setCC(cc);
	}
	public String getCC() {
		return cc;
	}
	public void setCC(String cc) {
		this.cc = cc;
	}
}

