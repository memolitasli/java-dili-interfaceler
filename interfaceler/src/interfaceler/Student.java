package interfaceler;

public class Student implements Idatabase {
/*
 * student classim Idatabase classimý implemente ettiði için yukarýda
 * public class Student yazmak yerine public class Student implements Idatabase yazmam gerekli
 * ve interfacemin içerisine ben void log(); þeklinde bir imza attýðým için eclipse bana bir hata veriyor
 * the type Student must implment the inherited abstract method Idatabase.log() þeklinde bir hata
 * kýsaca özeti eclipse bana diyor ki aga sen interfacen içerisinde void log(); adýnda bir imza attýysan
 * ve senin student classin Idatabase adlý interfaceden inplemente edildiyse bu log adýndaki metodu classýnýn içerisinde
 * yazman gerekiyor
 * */

 public	void log() {
		System.out.println("ogrenci eklendi...");
	}
	
}
