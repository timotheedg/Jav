import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Artiste a = new Artiste("Hope", "Hoppy", 1000);
		Festival f = new Festival();
		f.ajoutArtiste(a);
		Menu men = new Menu();
	//	tb.ajoutArtisteDB("Ah","Ok",150);
		//System.out.println(tb.affichageArtisteDB());
		
		men.menuGeneral();
		
				
		}
	}
		
		
		
		


