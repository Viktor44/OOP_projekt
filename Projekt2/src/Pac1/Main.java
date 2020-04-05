package Pac1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pouzivatel P1 = new Pouzivatel("Viktor","heslo1","email1");
		Pouzivatel P2 = new Pouzivatel("Tomas","heslo2","email2");
		Pouzivatel P3 = new Pouzivatel("Martin","heslo3","email3");
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		String meno;
		String heslo;
		String email;
		
		// login
		
		while(1 > 0) {
			System.out.println("Zadajte vase meno: ");
			
			meno = scan1.nextLine();
			
			System.out.println("Zadajte heslo: ");
			
			heslo = scan2.nextLine();
			
			System.out.println("Zadajte vas e-mail: ");
			 
			email = scan3.nextLine();
			
			if (meno == P1.getMeno() && heslo == P1.getHeslo() && email == P1.getEmail()) {
				System.out.println("Vase prihlasovacie udaje su spravne");
				System.out.println("Zdravime vas " + P1.getMeno());
				break;
			}
			 if (meno == P2.getMeno() && heslo == P2.getHeslo() && email == P2.getEmail()) {
				System.out.println("Vase prihlasovacie udaje su spravne");
				System.out.println("Zdravime vas " + P2.getMeno());
				break;
			}
			if (meno == P3.getMeno() && heslo == P3.getHeslo() && email == P3.getEmail()) {
				System.out.println("Vase prihlasovacie udaje su spravne");
				System.out.println("Zdravime vas " + P3.getMeno());
				break;
			}
			
			else {
				System.out.println("Zle udaje, skuskte znova");
				continue;
			}
			
			
			
		}
		
		// aplikacia
		
		
		
	}

}
