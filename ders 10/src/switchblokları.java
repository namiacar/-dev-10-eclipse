
public class switchblokları {

	public static void main(String[] args) {
		
		// char modunda tek tırnakla çalış.	
		// case =durum demektir.
		//switch bloğundan sonra şartın öznesi yani-
		//charın öznesi =grade.
char grade='B';

switch(grade) {
case'A' :

System.out.println("mükemmel :geçtiniz");
  break;
  
  
case'B':
	System.out.println(" ÇOK GÜZEL:geçtiniz");
	break;
case 'c':
	System.out.println(" iyi :geçtiniz");
	break;
case'd'	:
	System.out.println(" koşullu  :geçtiniz");
	break;
	
case 'f':
	System.out.println(" maalesef :kaldın");
	break;
//default=yukarıdaki notların dışında bir not girerse
	//devreye girer
	
	default:
		System.out.println("geçersiz notgirdiniz");

		
	// KODUN DAĞILDIYSA =	ECLİPSE FORMAT CODE.DEMEN YETERLİ.
		
		
}
		
		
		
		
		
	}

}
