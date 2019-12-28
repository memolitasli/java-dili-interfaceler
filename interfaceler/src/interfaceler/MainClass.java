package interfaceler;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * interfaceler asl�nda bir �e�it classt�r ancak
		 * olusturdu�um interfaceden ben bir nesne olusturamam 
		 * aralar�nda kal�t�m ile b�yle bir fark bulunmakta
		 * asl�nda interfaceler i�erisinde belli k�s�tlamlar do�rultusunda
		 * tan�mlamalar yapabilirim ancak interfacelerden nesne t�retemedigim i�in bunu yapman�n pek
		 * bir espirisi yok
		 * interfaceler de kesinlikle g�vdeli bir metod bulunamaz!!!!
		 * metodlar�m� interfacelerde sadece imza olarak yazar�m ve bu interfaceleri implemente eden
		 * t�m s�n�flar b yazd���m metodlar� kendi i�lerisinde bulundurmak zorunda kal�yor
		 * buradan sonra l�tfen Student classinin i�erisine giriniz ve oradaki yorum sat�rlar�n�
		 * okuyunuz...anlat�m�n devam� orada
		 * 
		 * 
		 * */
		Customer customer = new Customer();
		Student student = new Student();
		customer.log();
		student.log();

		/*
		 * polimorfizm konusunda �st classin imzas�n� alt classa atayabilecegimizi anlatm��t�k
		 * ayn� i�lemi burada da yapabilirim
		 * */
		Idatabase database1 = new Customer();
		Idatabase database2 = new Student();
		
		database1.log();
		database2.log(); 
	}

}
