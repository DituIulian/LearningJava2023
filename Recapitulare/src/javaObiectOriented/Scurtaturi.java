package javaObiectOriented;

public class Scurtaturi {

	private int deschid;

	public int getDeschid() {
		return deschid;
	}

	public void setDeschid(int deschid) {
		this.deschid = deschid;
	}

	Scurtaturi() {
		this(5);
	}

	Scurtaturi(int deschid) {
		this.deschid = deschid;
	}

	public void suntUtile() {
		System.out.println(" Sunt utile");
	}

	public void maiUtile(int cuCat) {
		setDeschid(this.deschid + cuCat);
	}

	public void aCrescut() {
		System.out.println("A crescut");
	}
}

