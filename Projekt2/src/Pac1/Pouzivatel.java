package Pac1;

public class Pouzivatel {
	private String meno;
	private String heslo;
	private String email;
	
	Pouzivatel(String x, String y, String z){
		this.meno = x;
		this.heslo = y;
		this.email = z;
	}
	
	public String getMeno() {
		return this.meno;
	}
	
	public String getHeslo() {
		return this.heslo;
	}
	
	public String getEmail() {
		return this.email;
	}
	
}
