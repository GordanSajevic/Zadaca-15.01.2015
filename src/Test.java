
public class Test {

	public static void main(String[] args) {
		Skloniste skloniste = new Skloniste();
		Zivotinja gordan = new Zivotinja("pas", "Gordan");
		Zivotinja edib = new Zivotinja("ma�ka", "Edib");
		Zivotinja jesenko = new Zivotinja("pas", "Jesenko");
		Zivotinja necko = new Zivotinja("ma�ka", "Ne�ko");
		Zivotinja bezimeni = new Zivotinja("pas");
		skloniste.enqueue(gordan);
		skloniste.enqueue(edib);
		skloniste.enqueue(jesenko);
		skloniste.enqueue(necko);
		skloniste.enqueue(bezimeni);
		System.out.println(skloniste.toString());
		skloniste.dequeueCat();
		System.out.println(skloniste.toString());
		skloniste.dequeueDog();
		System.out.println(skloniste.toString());
	}

}
