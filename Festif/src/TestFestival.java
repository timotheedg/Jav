import java.util.Objects;
import java.util.Scanner;


public class TestFestival {

	/*Pour l'utilisation du menu, partir d'un festival existant ou non ? 
	 * 
	 * Sinon le cr�er et faire jouer les variables avec et de fait cr�er un festival � 
	 * l'ouverture, y incorporer tout ce qui existe et traiter de mani�re non visible les
	 * demandes de l'utilisateurs, en sauvegardant dans la BDD avant qu'ils quittent et/ou
	 * r�guli�rement
	 * 
	 * Ouverture du menu, cr�ation d'un festival, � partir duquel sont stock�s toutes les 
	 * cr�ations de l'utilisateur. Si r�ouverture du programme, quid de l'utilisation?
	 * 
	 * Fonctions OK
	 * DB � voir
	 * Menu � terminer / avancer d'ici jeudi 
	 * 
	 * 
	 */
	
	/* 
	 * 
	 * 
	 * 
	 * séparer interface et objet
	 * 
	 * pour retrouver l'objet, recherche dans l'arraylist
	 * 
	 * modification BDD si update ou suppr, par classe et add dans le constructeur
	 * 
	 * class connexion avec objets statement
	 * une connexion pour le prog, référencée dans chaque objet 
	 * deux pistes :
	 * new artiste puis objet connexion en attribut
	 * attribut de class commun à tous les artistes, réf connexion, variable commune
	 * 
	 * class héritage / donc interface enregistrable, les 3 méthodes BDD (add/up/del)
	 * 
	 * cf javadoc
	 * notice ut
	 * 
	 * plusieurs constructeurs par class, un qui enregistre un qui construit sur la base
	 * Pour artiste, via saisie, enregistrement 
	 * Sinon, depuis chargement par la bDD, 
	 * 
	 */


	public String h = "whuuut";
	
	public static void MenuGeneral(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("=============================================");
			System.out.println("|	Menu Général							|");
			System.out.println("=============================================");
			System.out.println("|	Veuillez effectuer un choix  			|");
			System.out.println("|	-1- Gestion du personnel    			|");
			System.out.println("|	-2- Finances et comptabilité 			|");
			System.out.println("|	-3- Affichage de la  programmation  	|");
			System.out.println("|	-0- Quitter								|");
			System.out.println("=============================================");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Vous allez être redirigé vers le menu de Gestion du personnel");	
						MenuGestion();
						break;
				case 2 : System.out.println("2 bis ");
					break;
				case 3 : System.out.println("3 bis");
					break;
				case 0 : System.out.println("Au revoir.");
					break;
				default : System.out.println("Erreur de saisiebis");
				}
				
		}
	}

	private static void MenuGestion() {
	int choix = 8;
	Scanner sc = new Scanner(System.in);
	while (choix != 0){
		System.out.println("=============================================");
		System.out.println("|	Menu Gestion					|");
		System.out.println("=============================================");
		System.out.println("|	Veuillez effectuer un choix  			|");
		System.out.println("|	-1- Ajouter personnel   				|");
		System.out.println("|	-2- Modifier Personnel 					|");
		System.out.println("|	-3- Supprimer Personnel					|");
		System.out.println("|	-0- Retour au menu g�n�ral				|");
		System.out.println("=============================================");
		System.out.print("Choix :");
		choix = sc.nextInt();
	
			switch (choix){
			case 1 : System.out.println("Veuillez s�lectionner le personnel � ajouter");
					ChoixPersonnel();
				break;
			case 2 : System.out.println("Veuillez s�lectionner le personnel � modifier");
					ChoixPersonnel();
				break;
			case 3 : System.out.println("Veuillez s�lectionner le personnel � supprimer");
					ChoixPersonnel();
				break;
			case 0 : System.out.println("Vous allez �tre redirigez vers le menu g�n�ral");
				break;
			default : System.out.println("Erreur de saisie");
			}
			
	}
}

	private static void AjoutPersonnel(){
		
	}
	
	private static void ChoixPersonnel(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("=============================================");
			System.out.println("=============================================");
			System.out.println("|	Veuillez effectuer un choix  			|");
			System.out.println("|	-1- Artiste				    			|");
			System.out.println("|	-2- Securité				 			|");
			System.out.println("|	-3- Staff							  	|");
			System.out.println("|	-3- Technicien						  	|");
			System.out.println("|	-0- Retour au menu précédent			|");
			System.out.println("=============================================");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				
				case 1 : System.out.println("Artiste ");
				genArtiste();
						/*
						System.out.println(a);
						Artiste.nouvArtiste();
						System.out.print(a);
						Artiste.nouvArtiste();
						System.out.print(a);*/
						break;
				case 2 : System.out.println("2 bis ");
					break;
				case 3 : System.out.println("3 bis");
					break;
				case 0 : System.out.println("Au revoir.bis");
					break;
				default : System.out.println("Erreur de saisiebis");
				}
				
		}
	}
		
	public static void genArtiste(){
		
		
		String nom ="";
		String prenom;
		int cachet;
		Festival fev = new Festival();
		Scanner sca = new Scanner(System.in);
		boolean cond = false;
		while (!cond) {
		System.out.print("Nom : ");
		nom = sca.next();
		cond = nom.equalsIgnoreCase("fin");
		System.out.println("la");
			if (!(nom.equalsIgnoreCase("fin"))){
			System.out.print("Prenom : ");
			prenom = sca.next();
			System.out.print("Cachet : ");
			cachet = sca.nextInt();	
			Artiste a = new Artiste(nom,prenom,cachet);
			fev.ajoutArtiste(a);			
					}
			}	
		System.out.println(fev.arttoString());
		//f = fev;
		sca.close();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		/*Scene s=new Scene("ETE", 250);
		
		Concert c =new Concert("01/01/2016", "80H08", s);
		Concert conc =new Concert("01/01/2016", "56H98", s);
		
		
		Spectateur spec=new Spectateur("Maitre", "Bims", 60, 235);
		Spectateur spect=new Spectateur("Guibert", "Guibouch", 90, 10000);
		Festival f=new Festival();
		
		f.ajoutSpect(spec);
		f.ajoutSpect(spect);
		System.out.println(c.CalcTechnicien());
		System.out.println(c.CalcSecu());
		System.out.println(c.CalcStaff());
		System.out.println(c.CalculPersonnel());
		System.out.println(f.CalcPlaceVendues());
		
		f.ajoutConcert(conc);
		f.ajoutConcert(c);
		System.out.println(f.toString());
		
		Securite secu=new Securite("Loulou", "Loulouuu", 1200);
		f.ajoutPerso(secu);
		Securite securite=new Securite("Faf", "Le Faf", 8000);
		f.ajoutPerso(securite);
		Staff staff=new Staff("Virgile", "Peypey", 3000);
		f.ajoutPerso(staff);
		System.out.println(f.TotalPersonnel());
		System.out.println(f.CalculsFrais());
		
		Commerce coco= new Commerce("Bulle","Sdabilezz", 4367);
		Commerce blu = new Commerce("EFE", "Dwich",10000);
		f.ajoutCommerce(coco);
		f.ajoutCommerce(blu);
		
		
		System.out.println(f.CalculBenefice());
		System.out.println(f.CalculMarge());
		
		System.out.print();
	*/
		TestFestival Te = new TestFestival();
		Festival f=new Festival();
		Artiste a = new Artiste("bi","ba", 2);
		System.out.println("what");
		MenuGeneral();		
	}
	

	
}
		
	

	

