package P9.L4;

public class Mahasiswa extends orang{
	private String nrp;
	
	public Mahasiswa (String nrp, String nama, String alamat) {
		super(nama, alamat);
		setNrp(nrp);
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
}
