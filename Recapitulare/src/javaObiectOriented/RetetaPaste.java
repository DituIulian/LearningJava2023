package javaObiectOriented;

public class RetetaPaste {

	private int paste;

	RetetaPaste() {
		this(12);

	}
	RetetaPaste(int paste) {
		this.paste = paste;
	}

	public int getPaste() {
		return paste;
	}

	public void setPaste(int paste) {
		if (paste > 0 & paste < 100) {
			this.paste = paste;
		}
	}

	public void cresteSare(int cuCat) {
		setPaste(this.paste + cuCat);
	}

	public void suntGata() {
		System.out.println(" Sunt gata!");
	}

	public void nuSuntGata() {
		System.out.println(" Nu sunt gata");
	}
}
