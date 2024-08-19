package javaObiectOriented;

public class ScurtaturiRunner {

	public static void main(String[] args) {

		Scurtaturi ctrlShiftL = new Scurtaturi();
		Scurtaturi ctrlSpace = new Scurtaturi(12);
		Scurtaturi ctrlShiftR = new Scurtaturi(22);
		System.out.println(" ");

		ctrlShiftL.suntUtile();
		ctrlSpace.suntUtile();
		ctrlShiftL.suntUtile();
		System.out.println(" ");

		System.out.println(ctrlShiftL.getDeschid() + " %");
		System.out.println(ctrlSpace.getDeschid() + " %");
		System.out.println(ctrlShiftR.getDeschid() + " %");
		System.out.println(" ");

		ctrlShiftL.maiUtile(55);
		ctrlSpace.maiUtile(33);
		ctrlShiftR.maiUtile(66);
		System.out.println(" ");

		ctrlShiftL.aCrescut();
		ctrlSpace.aCrescut();
		ctrlShiftR.aCrescut();
		System.out.println(" ");

		System.out.println(ctrlShiftL.getDeschid() + " %");
		System.out.println(ctrlSpace.getDeschid() + " %");
		System.out.println(ctrlShiftR.getDeschid() + " %");
	}

}
