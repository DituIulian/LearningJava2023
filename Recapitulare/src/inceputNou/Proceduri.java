package inceputNou;

public class Proceduri {

	public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("		OBJECT ORIENTED PROGRAMING");
		System.out.println(" ");
		System.out.println(" Objects/Instances              - Planet");
		System.out.println(" Data (state/fields)            - name, location, distanceFromSun");
		System.out.println(" Actions (behaviour, method)    - revolve() , rotate()");
		System.out.println("      - Planet Venus = new Planet(); ");
		System.out.println("      - object.action  venus.revolve()");
		System.out.println(" ");
		System.out.println("		ENCAPSULATION");
		System.out.println(" ");
		System.out.println(" private int -Data/State-");
		System.out.println(" ");
		System.out.println(" void alegeData (int data)         {");
		System.out.println(" this.data = data;");
		System.out.println(" System.out.println(this.data);    }");
		System.out.println(" OR - RightClick -> Source -> Generate GETters and SETters  ");
		System.out.println(" ");
		System.out.println(" 		Excplicit conversion (casting)");
		System.out.println("i = (int) l  -  Large value (long) into smaller value (int)");
		System.out.println(" 		Implicit conversion (casting)");
		System.out.println("l = i  -  it works ");
		System.out.println(" ");
		System.out.println("		BIG DECIMAL");
		System.out.println(" BigDecimal number1 = new BigDecimal ('' 32.11223'') - string value");
		System.out.println(" BigDecimal number2 = new BigDecimal ('' 42.1233'') - string value");
		System.out.println(" number1.add(number2); => Exact result ");
		System.out.println(" ** jshell> ** number1. [tab] => Operatiuni ce se pot face in BigDecimal");
		System.out.println(" To create BigDecimal *Orice*; - Ctrl + 1 pe BigDecimal + Import");
		System.out.println(" ");
		System.out.println(" 	IF CONDITION");
		System.out.println(" int i = 26;");
		System.out.println(" if (i == 25) {");
		System.out.println(" System.out.println(\"I = 25\");");
		System.out.println(" } else if  (i == 24){");
		System.out.println(" 	System.out.println(\"I = 24\");");
		System.out.println(" } else {");
		System.out.println(" System.out.println(\"I != 25 or 24\");");
		System.out.println(" } } }");
		System.out.println(" ");
		System.out.println("	Scanner ");
		System.out.println(" Scanner scanner = new Scanner(System.in); in vine de la Input ");
		System.out.println("      CTRL + 1 pe Scanner pentru import Java.util.Scanner;");
		System.out.println(" System.out.print(\" Enter number1:  \");");
		System.out.println(" int number1 = scanner.nextInt();  poate fi si next.byte,short etc");
		System.out.println(" ");
		System.out.println(" 	Switch");
		System.out.println(" switch (choise){");
		System.out.println(" case 1 : sysout( \"case1\" ) break;");
		System.out.println(" case 2 : sysout( \"case2\" ) break;");
		System.out.println(" case 3 : sysout( \"case3\" ) break;");
		System.out.println(" default : sysout( \"default\" ) break;");
		System.out.println(" } ");
		System.out.println("		For LOOP");
		System.out.println(" for ( initialisation ; condition ; update){ /n statement }");
		System.out.println(" for ( int i = 1; i<=0 ; i++ ){ ");
		System.out.println(" Sysout.out.println (i); } ");
		System.out.println(" ");
		System.out.println("		CONSTRUCTER");
		System.out.println(" nameOfTheClass ( int Data) { ");
		System.out.println(" this.data = data;  } //return Data (if private)");
		System.out.println(" ");
		System.out.println(" 		Scanner");
		System.out.println(" Scanner scanner = new Scanner(System.in); ");
		System.out.println(" int number = scanner.nextInt();");
		System.out.println(" ");
		System.out.println(" 		STRINGS");
		System.out.println(" String stringName = \"What it contains\";");
		System.out.println(" ");
		System.out.println(" \"String name\".length();  => Numarul de caractere al string-ului");
		System.out.println(" ");
		System.out.println(" stringName.charAt(0-10-100) - Scoate caracterul corespunzator locatiei");
		System.out.println(" String copac = \"plop\"");
		System.out.println(" plop.charAt(2) = o (numararea caracterelor unei String incepe cu 0)");
		System.out.println(" ");
		System.out.println(" stringName.substring(0-10-100) - \"decupeaza\" de la locatia selectata ");
		System.out.println(" String copac = \"Plop dar mai lung\";");
		System.out.println(" copac.substring(5); - \"dar mai lung\"");
		System.out.println(" copac.substring(5,12); - \"dar mai\"; 5= inclusive 12=exclusive");
		System.out.println("  	 (incepe de la 5 dar se termina ininainte de 12)");
		System.out.println(" ");
		System.out.println(" copac.indexOf(\"dar\") = 5  ~  Locatia unde incepe cuvantul dar ");
		System.out.println(" copac.indexOf('l') = 1  ~ Locatia unde este caracterul cautat  #primul daca se repeta");
		System.out.println(" copac.lastIndexOf('l')  = 13   ~ Ultima pozitie a caracterului cautat daca se repeta");
		System.out.println(" copac.contains(\"mai\");      ==> true");
		System.out.println(" copac.startsWith(\"Plop\");   ==> true");
		System.out.println(" copac.endsWith(\"lung\");     ==> true");
		System.out.println(" copac.endsWith(\"ng\");       ==> true");
		System.out.println(" copac.isEmplty();           ==> false");
		System.out.println(" \"exemplu\".equales(\"exemplu\")              ==> true");
		System.out.println(" \"exemplu\".equales(\"ExeMplu\")              ==> false");
		System.out.println(" \"exemplu\".equalesIgnoreCase(\"ExeMplu\")    ==> true");
		System.out.println(" ");
		System.out.println("    Immutability - O data creata o valoare a String-ului nu poate fi modificata");
		System.out.println(" String str = \"Viata\";    ==> Viata ");
		System.out.println(" str.concat(\" e marfa\");   ==> Viata e marfa");
		System.out.println(" str   ==> Viata");
		System.out.println(" String strDiferit = str.concat(\" e marfa\")");
		System.out.println(" strDiferit ==> Viata e marfa");
		System.out.println(" strDiferit.toUpperCase()  ==> VIATA E MARFA");
		System.out.println(" strDiferit.toLowerCase()  ==> viata e marfa");
		System.out.println(" String x = \"    cuvant       \"");
		System.out.println(" x.trim()  ==> cuvant  (Elimina spatiile goale de la inceputul si sfarsitul String-ului");
		System.out.println(" String.join(\";\",\"2\",\"3\",\"4\");    ==> \"2;3;4\"");
		System.out.println("     Prima valoare ( aici ;) reprezinta caracterul dintre String-urile contcantinate");
		System.out.println("     Prima valoare poate avea mai multe caractere, ca orice alt string");
		System.out.println(" \"abcd\".replace(\"a\", \"MN\");    ==> \"MNbcd\"");
		System.out.println(" ");
		System.out.println(" StringBuffer - NOT immutable - Poate fi modificat String-ul");
		System.out.println(" StringBuffer sb = new StringBuffer (\"TEst\");    ==> TEst");
		System.out.println(" sb.append(\" 123\");   ==> TEst 123");
		System.out.println(" sb.setCharAt(1,'e');   ==> Test 123");
		System.out.println(" ");
		System.out.println(" StringBuilder - Synchronized Class - E folosita pentru multi-threading ");
		System.out.println(" StringBuilder sbd = new StringBuilder(\"Test\")  ==> Test");
		System.out.println(" sbd.reverse(); ==> 321 tseT");
		System.out.println(" ");
		System.out.println(" 		Wrapper Classes");
		System.out.println(" Wrapper: Boolean, Byte, Character, Double, Float, Intiger, Long, Shord");
		System.out.println(" Primitive: boolean, byte, char, double, float, int, long, short ");
		System.out.println(" ");
		System.out.println(" Integer integer1 = new Integer(5);         integer1 ==> 5");
		System.out.println(" Intiger integer2 = Integer.valueOf(5);     integer2 ==> 5(");
		System.out.println(" Integer integer3 = new Integer(\"522\");     integer3 ==> 521 (accepta si String) ");
		System.out.println(" Integer integer4 = Integer.valueOf(\"521\"); integer4 ==> 521 (accepta si String)");
		System.out.println(" *SE PREFERA* valueOf - Nu necesita creearea de obiecte noi ");
		System.out.println(" ");
		System.out.println(" 		Java Dates	");
		System.out.println(" ");
		System.out.println(" Trebuie importat de fiecare data cand deschidem java");
		System.out.println(" jshell> import java.time.LocalDate");
		System.out.println(" jshell> LocalDate now = LocalDate.now();\r\n" + "now ==> 2023-05-06");
		System.out.println(" jshell> import java.time.LocalTime");
		System.out.println(" jshell> LocalTime now = LocalTime.now();\r\n" + "now ==> 17:26:48.334852200");
		System.out.println(" jshell> import java.time.LocalDateTime");
		System.out.println(" jshell> LocalDateTime now = LocalDateTime.now();\r\n" + "now ==> 2023-05-06T17:29:02.67");
		System.out.println(" jshell> LocalDate yesterday = LocalDate.of(An,Luna,Zi);\r\n" + "yesterday ==> 2023-05-05");
		System.out.println(" ");
		System.out.println(" 		Array");
		System.out.println(" ");
		System.out.println(" jshell> int[] marks = { 75 , 60 ,55}\r\n" + "marks ==> int[3] { 75, 60, 55 }");
		System.out.println(" jshell> for (int mark:marks){\r\n" + "   ...>     sum = sum + mark;\r\n" + "   ...> }");
		System.out.println(" sum ==> 190");
		System.out.println(" ");
		System.out.println(" jshell> String[] cuvinte = { \"ceapa\" , \"ciupeala\" , \"logoped\"}");
		System.out.println(" jshell> System.out.println(cuvinte);\r\n" + "[Ljava.lang.String;@555590 - GRESIT ");
		System.out.println(" jshell> System.out.println(Arrays.toString(cuvinte));\r\n" + "[ceapa, ciupeala, logoped]");
		System.out.println(" ");
		System.out.println(" 		Multiple arguments = putem adauga N elemente in Array-ul nostru\r\n"
				+ "Argumentul variabil trebuie sa fie ultimul (int...)\r\n");
		System.out.println(" jshell> void print (int... values){\r\n"
				+ "   ...>     System.out.println(Arrays.toString(values));\r\n" + "   ...> }\r\n");
		System.out.println("  int sum (int... values){\r\n" + "   ...>     int sum = 0;\r\n"
				+ "   ...>     for ( int value : values){\r\n" + "   ...>     sum += value;\r\n" + "   ...>     }\r\n"
				+ "   ...>     return sum;\r\n" + "   ...> } ");
		System.out.println(" ");
		System.out.println(" getMaxMark = Integer.MIN_VALUE;");
		System.out.println(" getMinMark = Integer.MAX_VALUE");
		System.out.println(" return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);");
		System.out.println(" ");
		System.out.println(" 		ARRAY LIST");
		System.out.println(" ");
		System.out.println(" jshell> ArrayList arrayList = new ArrayList()");
		System.out.println("  arrayList.add(\"Apple\");");
		System.out.println("  arrayList.add(\"Cat\");");
		System.out.println("  arrayList.add(\"Bat\");");
		System.out.println(" arrayList ==> [Apple, Cat, Bat]");
		System.out.println("  arrayList.remove(\"Cat\");");
		System.out.println(" arrayList ==> [Apple, Bat]");
		System.out.println("  arrayList.add(47);");
		System.out.println(" arrayList ==> [Apple, Bat, 47]");
		System.out.println(" ");
		System.out.println(" ArrayList<String> items = new ArrayList<String>();");
		System.out.println(" items.add(\"Apple\")");
		System.out.println(" items.add(12)       incompatible types: int cannot be converted to java.lang.String");
		System.out.println(" items.add(\"12\")");
		System.out.println(" items ==> [Apple, 12]");
		System.out.println(" ");
		System.out.println(" 		Inheritance");
		System.out.println(" public class Person {\r\n" + "\r\n" + "	private String name;\r\n"
				+ "	private String email;\r\n" + "	private String phoneNumber;");
		System.out.println(" In alta clasa adaugam comanda  extends\r\n");
		System.out.println(" public class Student extends Person{\r\n" + "\r\n" + "}");
		System.out.println(" Student = Subclass");
		System.out.println(" Person  = Superclass");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

	}

}
