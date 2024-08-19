package javaObiectOriented;

public class FolderRunner {

	public static void main(String[] args) {

		Folder facultate = new Folder();
		Folder munca = new Folder(22);
		Folder java = new Folder(23);

		facultate.getFisiere();
		munca.getFisiere();
		java.getFisiere();


		System.out.println("Folderul are " + facultate.getFisiere() + " fisiere");
		System.out.println("Folderul are " + munca.getFisiere() + " fisiere");
		System.out.println("Folderul are " + java.getFisiere() + " fisiere");
		System.out.println(" ");

		facultate.deschide();
		munca.deschide();
		java.deschide();
		System.out.println(" ");


		facultate.adaugaFisiere(66);
		munca.adaugaFisiere(44);
		java.adaugaFisiere(112);

		System.out.println("Folderul are acum " + facultate.getFisiere() + " de fisiere");
		System.out.println("Folderul are acum " + munca.getFisiere() + " de fisiere");
		System.out.println("Folderul are acum " + java.getFisiere() + " de fisiere");
		System.out.println(" ");

		facultate.inchide();
		munca.inchide();
		java.inchide();
	}

}
