package javaObiectOriented;

public class Filip {

	private int filip;

	Filip() {
		this(4);
	}

	Filip(int filip) {
		this.filip = filip;

	}

	public int getFilip() {
		return filip;
	}

	public void setFilip(int filip) {
		this.filip = filip;
	}

	public void bateCampii() {
		System.out.println(" Bate campii ");
	}

	public void cresteCampii(int cuCat) {
		setFilip(this.filip + cuCat);

	}

	public void prajeala() {
		System.out.println("Prajeala");
	}
}
