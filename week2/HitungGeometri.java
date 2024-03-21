package week2;

public class HitungGeometri 
{
	public static void main(String[] args) 
    {
		//Keliling lingkaran
		double diameter = 10;
		double jariJari = diameter / 2;
		double kelilingLingkaran = Math.PI * diameter;
		
		//Luas Segitiga Siku-Siku
		double alasSegitiga = 6;
		double tinggiSegitiga = 8;
		double luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
		
		//Volume Tabung
		double tinggiTabung = 10;
		double volumeTabung = Math.PI * Math.pow(jariJari, 2) * tinggiTabung;
		
		System.out.println("a. Keliling lingkaran dengan diameter 10: " + kelilingLingkaran);
		System.out.println("b. Luas Segitiga siku-siku dengan diketahui alas 6 dan tinggi 8: " + luasSegitiga);
		System.out.println("c. Volume tabung dengan diketahui diameter 5 dan tinggi 10: " + volumeTabung);
	}

}