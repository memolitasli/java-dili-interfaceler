package interfaceler;

public class Student implements Idatabase {
/*
 * student classim Idatabase classim� implemente etti�i i�in yukar�da
 * public class Student yazmak yerine public class Student implements Idatabase yazmam gerekli
 * ve interfacemin i�erisine ben void log(); �eklinde bir imza att���m i�in eclipse bana bir hata veriyor
 * the type Student must implment the inherited abstract method Idatabase.log() �eklinde bir hata
 * k�saca �zeti eclipse bana diyor ki aga sen interfacen i�erisinde void log(); ad�nda bir imza att�ysan
 * ve senin student classin Idatabase adl� interfaceden inplemente edildiyse bu log ad�ndaki metodu class�n�n i�erisinde
 * yazman gerekiyor
 * */

 public	void log() {
		System.out.println("ogrenci eklendi...");
	}
	
}
