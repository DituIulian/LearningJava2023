package javaObiectOriented;

public class Muzica {

	private int volum;

	Muzica() {
		this(5);
	}
	Muzica(int volum) {
		this.volum = volum;
	}

	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		if (volum > 0) {
		this.volum = volum;
	}
}

public void cresteVolum(int cuCat) {
	setVolum(this.volum + cuCat);
}

public void scadeVoulum(int cuCat) {
	setVolum(this.volum - cuCat);
}
	void ascultata() {
		System.out.println("		Muzica a inceput");
	}
}
