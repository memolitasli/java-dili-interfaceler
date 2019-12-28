package interfaceler;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * interfaceler aslýnda bir çeþit classtýr ancak
		 * olusturduðum interfaceden ben bir nesne olusturamam 
		 * aralarýnda kalýtým ile böyle bir fark bulunmakta
		 * aslýnda interfaceler içerisinde belli kýsýtlamlar doðrultusunda
		 * tanýmlamalar yapabilirim ancak interfacelerden nesne türetemedigim için bunu yapmanýn pek
		 * bir espirisi yok
		 * interfaceler de kesinlikle gövdeli bir metod bulunamaz!!!!
		 * metodlarýmý interfacelerde sadece imza olarak yazarým ve bu interfaceleri implemente eden
		 * tüm sýnýflar b yazdýðým metodlarý kendi içlerisinde bulundurmak zorunda kalýyor
		 * buradan sonra lütfen Student classinin içerisine giriniz ve oradaki yorum satýrlarýný
		 * okuyunuz...anlatýmýn devamý orada
		 * 
		 * 
		 * */
		Customer customer = new Customer();
		Student student = new Student();
		customer.log();
		student.log();

		/*
		 * polimorfizm konusunda üst classin imzasýný alt classa atayabilecegimizi anlatmýþtýk
		 * ayný iþlemi burada da yapabilirim
		 * */
		Idatabase database1 = new Customer();
		Idatabase database2 = new Student();
		
		database1.log();
		database2.log(); 
	}

}
