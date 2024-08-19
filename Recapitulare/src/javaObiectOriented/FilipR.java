package javaObiectOriented;

public class FilipR {

	public static void main(String[] args) {

		Filip munca = new Filip();
		Filip alcool = new Filip();
		Filip altele = new Filip(0x10);

		munca.bateCampii();
		alcool.bateCampii();
		altele.bateCampii();

		System.out.println(munca.getFilip());
		System.out.println(alcool.getFilip());
		System.out.println(altele.getFilip());

		munca.prajeala();
		alcool.prajeala();
		altele.prajeala();

		munca.cresteCampii(44);
		alcool.cresteCampii(123);
		altele.cresteCampii(41);

		System.out.println(munca.getFilip());
		System.out.println(alcool.getFilip());
		System.out.println(altele.getFilip());

	}

}
