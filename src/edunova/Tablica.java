package edunova;

public class Tablica {
	//edunova zadatak ispisi tablicu mnozenja
	
	
	public static void ispisiTablicu() {
		//ispisuje tablicu mnozenja 15x15
		
		
		int a = 1;
		
		boolean prvi = true;
		
		for(int i = 1; i < 16; i++) {
			a=i;
			prvi = true;
			for(int i2 = 1; i2 < 16; i2++) {
				
				//uvijet za prvi red ako ispisuje
				if(prvi) {
					System.out.print(i + "\t");
					prvi=false;
				}else
				{
					a=a+i;
					System.out.print(a + "\t");
				}
			}
			System.out.println();
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		ispisiTablicu();
	}

}


