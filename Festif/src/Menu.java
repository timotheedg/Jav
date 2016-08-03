import java.util.Scanner;

public class Menu {

	 public static void main(String[] args) {
		
		menuGeneral();
		 
	 }
	 
	 
	 
		public static void menuGeneral(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|--------------Menu Général-------------|");
			System.out.println("|  Veuillez effectuer un choix :        |");
			System.out.println("|-1-	Gestion du personnel            |");
			System.out.println("|-2-	Finances et comptabilité        |");
			System.out.println("|-3-	Affichage de la  programmation  |");
			System.out.println("|-4-	Gestion des spectateurs         |");
			System.out.println("|-5-	Gestion des commerces           |");
			System.out.println("|-6-	Gestion des concerts            |");			
			System.out.println("|-0-	Quitter                         |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Vous allez être redirigé vers Gestion du personnel\n");	
						menuGestionPersonnel();
					break;
				case 2 : System.out.println("Vous allez être redirigé vers Finances et comptabilité\n");
						menuFinance();
					break;
				case 3 : System.out.println("Vous allez être redirigé vers Affichage de la  programmation\n");
						menuAffichage();
					break;
				case 4 : System.out.println("Vous allez être redirigé vers Gestion des spectateurs\n");
						menuSpectateur();
					break;	
				case 5 : System.out.println("Vous allez être redirigé vers Gestion des commerces\n");
						menuCommerce();
					break;
				case 6 : System.out.println("Vous allez être redirigé vers Gestion des concerts\n");
						menuConcert();
					break;
				case 0 : quitter();
					break;
				default : System.out.println("Erreur de saisie");
				}			
		}
		}
		
	public static void menuConcert(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-------Menu Gestion des Concerts-------|");
			System.out.println("|  Veuillez effectuer un choix :        |");
			System.out.println("|-1-	Ajouter concert                 |");
			System.out.println("|-2-	Supprimer concert               |");
			System.out.println("|-0-	Retour au menu général          |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
				switch (choix){
				case 1: System.out.println("Ajout Concert\n");	
				String nom ="";
				String date ="";
				String heureDebut = "";
				String endroit ="";
				String scene = "";
				Scanner scaa = new Scanner(System.in);
				boolean conda = false;
				while (!conda) {
					System.out.print("Nom (fin pour terminer) : ");
					nom = scaa.next();
					conda = nom.equalsIgnoreCase("fin");
					if (!(nom.equalsIgnoreCase("fin"))){
						System.out.print("date : ");
						date = scaa.next();
						System.out.print("heure début : ");
						heureDebut = scaa.next();
						System.out.print("endroit : ");
						endroit = scaa.next();
						System.out.print("scene : ");
						scene = scaa.next();
						nom = nom.toUpperCase();
						endroit = endroit.toUpperCase();
						scene = scene.toUpperCase();
						ConnectionDB.concertSauvegarder(nom, date, heureDebut, endroit, scene);
						
					}
				}
					break;
				case 2 : System.out.println("Suppression Concert\n");
				String noma ="";
				Scanner sca = new Scanner(System.in);
				boolean cond = false;
				while (!cond) {
					System.out.print("Nom du concert à supprimer (fin pour terminer) : ");
					noma = sca.next();
					noma = noma.toUpperCase();
					cond = noma.equalsIgnoreCase("fin");
					String genre = "concert";
					if((!(noma.equalsIgnoreCase("fin")))){
						ConnectionDB.suppressoptim(noma, genre);
					}
				}		
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu général\n");
					break;
				default : System.out.println("Erreur de saisie");
				}	
		}
	}
		
		
		/*
		 * Gestion du personnel
		 * 
		 * */
		
	public static void menuGestionPersonnel(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-------Menu Gestion du Personnel-------|");
			System.out.println("|  Veuillez effectuer un choix :        |");
			System.out.println("|-1-	Ajouter personnel               |");
			System.out.println("|-2-	Supprimer Personnel             |");
			System.out.println("|-0-	Retour au menu général          |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
				switch (choix){
				case 1: System.out.println("Veuillez séléctionner le personnel à ajouter\n");	
						choixPersonnelAjout();
					break;
				case 2 : System.out.println("Veuillez séléctionner le personnel à  supprimer\n");
						choixPersonnelSuppression();
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu général\n");
					break;
				default : System.out.println("Erreur de saisie");
				}	
		}
	}
	

	
	
	//méthode ajout du personnel
	private static void choixPersonnelAjout(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|----------Menu Ajout Personnel---------|");
			System.out.println("|  Veuillez effectuer un choix :        |");
			System.out.println("|-1-	Artiste                         |");
			System.out.println("|-2-	Sécurité                        |");
			System.out.println("|-3-	Staff                           |");
			System.out.println("|-4-	Technicien                      |");
			System.out.println("|-0-	Retour au menu précédent        |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Artiste\n");
					String noma ="";
					String prenoma;
					int cachet;
					Scanner scaa = new Scanner(System.in);
					boolean conda = false;
					while (!conda) {
						System.out.print("Nom (fin pour terminer) : ");
						noma = scaa.next();
						conda = noma.equalsIgnoreCase("fin");
						if (!(noma.equalsIgnoreCase("fin"))){
							System.out.print("Prenom : ");
							prenoma = scaa.next();
							System.out.print("cachet : ");
							cachet = scaa.nextInt();
							noma = noma.toUpperCase();
							prenoma = prenoma.toUpperCase();
							ConnectionDB.artisteSauvegarder(noma, prenoma, cachet);
						}
					}
						break;
				case 2 : System.out.println("Sécurité\n");
					String nome ="";
					String prenome;
					int salairee;
					Scanner scae = new Scanner(System.in);
					boolean conde = false;
					while (!conde) {
						System.out.print("Nom (fin pour terminer) : ");
						nome = scae.next();
						conde = nome.equalsIgnoreCase("fin");
						if (!(nome.equalsIgnoreCase("fin"))){
							System.out.print("Prenom : ");
							prenome = scae.next();
							System.out.print("Salaire : ");
							salairee = scae.nextInt();
							nome = nome.toUpperCase();
							prenome = prenome.toUpperCase();
							ConnectionDB.securiteSauvegarder(nome, prenome, salairee);
						}
					}
					break;
				case 3 : System.out.println("Staff\n");
					String noms ="";
					String prenoms;
					int salaires;
					Scanner scas = new Scanner(System.in);
					boolean conds = false;
					while (!conds) {
						System.out.print("Nom (fin pour terminer) : ");
						noms = scas.next();
						conds = noms.equalsIgnoreCase("fin");
							if (!(noms.equalsIgnoreCase("fin"))){
								System.out.print("Prenom : ");
								prenoms = scas.next();
								System.out.print("Salaire : ");
								salaires = scas.nextInt();
								noms = noms.toUpperCase();
								prenoms = prenoms.toUpperCase();
								ConnectionDB.staffSauvegarder(noms, prenoms, salaires);
							}
					}
					break;
				case 4 : System.out.println("Technicien\n");					
					String nom ="";
					String prenom;
					int salaire;
					Scanner sca = new Scanner(System.in);
					boolean cond = false;
					while (!cond) {
						System.out.print("Nom (fin pour terminer) : ");
						nom = sca.next();
						cond = nom.equalsIgnoreCase("fin");
							if (!(nom.equalsIgnoreCase("fin"))){
								System.out.print("Prenom : ");
								prenom = sca.next();
								System.out.print("Salaire : ");
								salaire = sca.nextInt();	
								nom = nom.toUpperCase();
								prenom = prenom.toUpperCase();
								ConnectionDB.technicienSauvegarder(nom, prenom, salaire);
							}
						}
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu précédent\n");
					break;
				default : System.out.println("Erreur de saisie");
				}
				
		}
	}
	
	
	
	
	//méthode de Suppression du Personnel
	private static void choixPersonnelSuppression(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-------Menu Suppresion Personnel-------|");
			System.out.println("|-1-	Artiste                         |");
			System.out.println("|-2-	Sécurité                        |");
			System.out.println("|-3-	Staff                           |");
			System.out.println("|-4-	Technicien                      |");
			System.out.println("|-0-	Retour au menu précédent        |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
				switch (choix){
				
			
				
				case 1 : System.out.println("Artiste Suppression\n");
					String noma ="";
					Scanner scaa = new Scanner(System.in);
					boolean conda = false;
					while (!conda) {
						System.out.print("Nom de la personne à supprimer (fin pour terminer) : ");
						noma = scaa.next();
						noma = noma.toUpperCase();
						conda = noma.equalsIgnoreCase("fin");
						String genre = "artiste";
						if((!(noma.equalsIgnoreCase("fin")))){
							ConnectionDB.suppressoptim(noma, genre);
						}
					}
					break;
				case 2 : System.out.println("Sécurité Suppression\n");
					String nome ="";
					Scanner scae = new Scanner(System.in);
					boolean conde = false;
					while (!conde) {
						System.out.print("Nom de la personne à supprimer (fin pour terminer) : ");
						nome = scae.next();
						nome = nome.toUpperCase();
						conde = nome.equalsIgnoreCase("fin");
						String genre = "securite";
						if((!(nome.equalsIgnoreCase("fin")))){
							ConnectionDB.suppressoptim(nome, genre);
						}
					}
					break;
				case 3 : System.out.println("Staff Suppresion\n");
					String no ="";
					Scanner sco = new Scanner(System.in);
					boolean condo = false;
					while (!condo) {
						System.out.print("Nom de la personne à supprimer (fin pour terminer) : ");
						no = sco.next();
						no = no.toUpperCase();
						condo = no.equalsIgnoreCase("fin");
						String genre = "staff";
						if((!(no.equalsIgnoreCase("fin")))){
							ConnectionDB.suppressoptim(no, genre);
						}
					}
					break;
				case 4 : System.out.println("Technicien Suppresion\n");					
					String nt ="";
					Scanner st = new Scanner(System.in);
					boolean condt = false;
					while (!condt) {
						System.out.print("Nom de la personne à supprimer (fin pour terminer) : ");
						nt = st.next();
						nt = nt.toUpperCase();
						condt = nt.equalsIgnoreCase("fin");
						String genre = "technicien";
						if((!(nt.equalsIgnoreCase("fin")))){
							ConnectionDB.suppressoptim(nt, genre);
						}
					}	
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu précédent\n");
					break;
				default : System.out.println("Erreur de saisie");
			}
			
		}
				
	}
	
	
	/*
	 * 
	 * Finances
	 * */

	//Menu Finance
 	public static void menuFinance(){
 		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-------Finance-& Comptabilité----------|");
			System.out.println("|  Veuillez effectuer un choix :        |");
			System.out.println("|-1-	Calculer les frais              |");
			System.out.println("|-2-	Calculer les gains              |");
			System.out.println("|-3     Calculer la marge               |");
			System.out.println("|-0-	Quitter                         |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Calcul des frais\n");
					menuFinanceFrais();
					break;
				case 2 : System.out.println("Calcul des gains\n");
					menuFinanceGains();
					
					break;
				case 3 : System.out.println("Calcul de la marge\n");
					if (ConnectionDB.calculBenefices() == 0){
						if (ConnectionDB.calculGainsTotal() == 0){
							System.out.println("La table est vide");
						}
					}
					else{
						System.out.println("Le total des bénéfices s'élève à "+ConnectionDB.calculBenefices()+" euros.");
					}
					break;
				case 0 : System.out.println("Vous allez être redirigé vers  Gestion des spectateurs\n");
					break;
				default : System.out.println("Erreur de saisie.");
				}			
		}
 	}
	
 	
 	/** =============================================================================================
	 * menuFinanceFrais
	 * 
	 * Méthode de navigation pour le calcul des frais des artistes, sécurité, staff, technicines 
	 * et de la somme de l'ensemble dans la base de données
	 * 
	 * =============================================================================================
	 */
 	public static void menuFinanceFrais(){
 		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|------------Finance-& Comptabilité----------|");
			System.out.println("|  Veuillez effectuer un choix :             |");
			System.out.println("|-1-	Calculer les frais des artistes      |");
			System.out.println("|-2-	Calculer les frais de la securité    |");
			System.out.println("|-3-    Calculer les frais du staff          |");
			System.out.println("|-4-    Calculer les frais des techniciens   |");
			System.out.println("|-5-    Calculer le total des frais          |");
			System.out.println("|-0-	Quitter                              |");
			System.out.println("|--------------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Calcul des frais des artistes");
					if (ConnectionDB.calculFrais("artiste") == 0){
						System.out.println("La table est vide");
					}
					else{
						System.out.println(ConnectionDB.calculFrais("artiste")+" euros.");
					}
					break;
				case 2 : System.out.println("Calcul des frais de la sécurité");
					if (ConnectionDB.calculFrais("securite") == 0){
						System.out.println("La table est vide");
				}
				else{
					System.out.println(ConnectionDB.calculFrais("securite")+" euros.");
				}
					break;
				case 3 : System.out.println("Calcul des frais du staff");
				if (ConnectionDB.calculFrais("staff") == 0){
					System.out.println("La table est vide");
				}
				else{
					System.out.println(ConnectionDB.calculFrais("staff")+" euros.");
				}
					break;
				case 4 : System.out.println("Calcul des frais des techniciens");
					if (ConnectionDB.calculFrais("technicien") == 0){
					System.out.println("La table est vide");
					}
					else{
					System.out.println(ConnectionDB.calculFrais("technicien")+" euros.");
					}
					break;
				case 5 : System.out.println("Calcul des frais totaux");
					if (ConnectionDB.calculFraisTotal() == 0){
						System.out.println("La base de données est vide");
					}
					else{
						System.out.println("Le total des frais s'élève à "+ConnectionDB.calculFraisTotal()+" euros.");
					}
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu précédent");
					break;
				default : System.out.println("Erreur de saisie.");
				}			
		}
 	}
 	
 	
 	
 	
 	
 	/** =============================================================================================
	 * menuFinanceFrais
	 * 
	 * Méthode de navigation pour le calcul des frais des artistes, sécurité, staff, technicines 
	 * et de la somme de l'ensemble dans la base de données
	 * 
	 * =============================================================================================
	 */
 	public static void menuFinanceGains(){
 		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-----------------Finance-& Comptabilité-------------Gains------------|");
			System.out.println("|  Veuillez effectuer un choix :                                      |");
			System.out.println("|-1-	Calculer les gains par la vente de places au spectateurs      |");
			System.out.println("|-2-	Calculer les gains par les commerces                          |");
			System.out.println("|-0-	Quitter                                                       |");
			System.out.println("|--------------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Calcul des gains spectateurs");
					if (ConnectionDB.calculGains("spectateur") == 0){
						System.out.println("La table est vide");
					}
					else{
						System.out.println(ConnectionDB.calculGains("spectateur")+" euros.");
					}
					break;
				case 2 : System.out.println("Calcul des gains commerce");
					if (ConnectionDB.calculGains("commerce") == 0){
						System.out.println("La table est vide");
				}
				else{
					System.out.println(ConnectionDB.calculGains("commerce")+" euros.");
				}
					break;
				case 3 : System.out.println("Calcul des gains totayx");
				if (ConnectionDB.calculGainsTotal() == 0){
					System.out.println("La table est vide");
				}
				else{
					System.out.println("Le total des gains s'élève à "+ConnectionDB.calculGainsTotal()+" euros.");
				}
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu précédent");
					break;
				default : System.out.println("Erreur de saisie.");
				}			
		}
 	}
 	
 	/** =============================================================================================
	 * menuCommerce
	 * 
	 * Méthode de navigation pour l'affichage, l'ajout et la suppression des commerces
	 * dans la base de donnée
	 * 
	 * =============================================================================================
	 */
 	public static void menuCommerce(){
 		int choix = 5;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-----------Menu Affichage----------------|");
			System.out.println("|  Veuillez effectuer un choix :          |");
			System.out.println("|-1-	Afficher tous les commerces       |");
			System.out.println("|-2-	Ajouter un commerce               |");
			System.out.println("|-3-	Supprimer un commerce             |");
			System.out.println("|-0-	Retour au menu général            |");
			System.out.println("|-----------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
				switch (choix){
				case 1 : System.out.println("Commerce");
					ConnectionDB.lectureCommerce();
					break;
				case 2 : System.out.println("Ajouter Commerce");
				String noma ="";
				String type;
				int frais;
				Scanner scaa = new Scanner(System.in);
				boolean conda = false;
				while (!conda) {
					System.out.print("Nom (fin pour terminer) : ");
					noma = scaa.next();
					conda = noma.equalsIgnoreCase("fin");
					if (!(noma.equalsIgnoreCase("fin"))){
						System.out.print("Type : ");
						type = scaa.next();
						System.out.print("frais : ");
						frais = scaa.nextInt();
						noma = noma.toUpperCase();
						type = type.toUpperCase();
						ConnectionDB.CommerceSauvegarder(noma, type, frais);
					}
				}
					break;
				case 3 : System.out.println("Supprimer Commerce");
				String nom ="";
				Scanner sca = new Scanner(System.in);
				boolean cond = false;
				while (!cond) {
					System.out.print("Nom du commerce à supprimer (fin pour terminer) : ");
					noma = sca.next();
					noma = noma.toUpperCase();
					cond = noma.equalsIgnoreCase("fin");
					String genre = "commerce";
					if((!(noma.equalsIgnoreCase("fin")))){
						ConnectionDB.suppressoptim(noma, genre);
					}
				}
					break;
				case 0 : System.out.println("Vous allez être redirigés vers le menu précédent");
					break;
				default : System.out.println("Erreur de saisie.");
					break;
				}
		}
 	}
 	
 	
 	//Affichage
 	//MenuAffichage
 	public static void menuAffichage(){
 		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-----------Menu Affichage----------------|");
			System.out.println("|  Veuillez effectuer un choix :          |");
			System.out.println("|-1-	Afficher toute la programmation   |");
			System.out.println("|-2-	Afficher les artistes             |");
			System.out.println("|-3-	Afficher les commerces            |");
			System.out.println("|-4-	Afficher la sécurité              |");
			System.out.println("|-5-	Afficher le staff                 |");
			System.out.println("|-6-	Afficher les techniciens          |");
			System.out.println("|-0-	Retour au menu général            |");
			System.out.println("|-----------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
				switch (choix){
				case 1 : System.out.println("Tout");
					ConnectionDB.lectureGlobale();
					break;
				case 2 : System.out.println("Artiste");
					System.out.println("Nous récupérons vos données.");
					ConnectionDB.lectureArtiste();
					break;
				case 3 : System.out.println("Commerce");
					System.out.println("Nous récupérons vos données.");
					ConnectionDB.lectureCommerce();
					break;
				case 4 : System.out.println("Sécurité");
					System.out.println("Nous récupérons vos données.");
					ConnectionDB.lectureSecurite();
					break;	
				case 5 : System.out.println("Staff");
					System.out.println("Nous récupérons vos données.");
					ConnectionDB.lectureStaff();
					break;
				case 6 : System.out.println("Technicien");
					System.out.println("Nous récupérons vos données.");
					ConnectionDB.lectureTechnicien();
					break;
				case 0 : System.out.println("Vous allez être redirigés vers le menu précédent");
					break;
				default : System.out.println("Erreur de saisie.");
					break;
				}
		}
 	}
	
 	
 	/** =============================================================================================
	 * menuSpectateur
	 * 
	 * Méthode de navigation pour l'affichage, l'ajout et la suppression des spectateurs
	 * dans la base de donnée
	 * 
	 * =============================================================================================
	 */
 	public static void menuSpectateur(){
		int choix = 8;
		Scanner sc = new Scanner(System.in);
		while (choix != 0){
			System.out.println("|-----------Menu Spectateur-------------|");
			System.out.println("|  Veuillez effectuer un choix :        |");
			System.out.println("|-1-	Afficher spectateur             |");
			System.out.println("|-2-	Ajouter spectateur            |");
			System.out.println("|-3-	Supprimer spectateur            |");
			System.out.println("|-0-	Retour au menu général          |");
			System.out.println("|---------------------------------------|");
			System.out.print("Choix :");
			choix = sc.nextInt();
		
				switch (choix){
				case 1 : System.out.println("Vous allez être redirigé vers Afficher spectateur");	
					ConnectionDB.lectureSpectateur();
					break;
				case 2 : System.out.println("Vous allez être redirigé vers Ajouter spectateur");
				String noma ="";
				String prenoma;
				float tarif;
				int age;
				Scanner scaa = new Scanner(System.in);
				boolean conda = false;
				while (!conda) {
				System.out.print("Nom : ");
				noma = scaa.next();
				conda = noma.equalsIgnoreCase("fin");
					if (!(noma.equalsIgnoreCase("fin"))){
					System.out.print("Prenom : ");
					prenoma = scaa.next();
					System.out.print("age : ");
					age = scaa.nextInt();	
					System.out.println("tarif : ");
					tarif = scaa.nextFloat();
					noma = noma.toUpperCase();
					prenoma = prenoma.toUpperCase();
				ConnectionDB.SpectateurSauvegarder(noma, prenoma, age,  tarif);
					}
				}
					break;
				case 3 : System.out.println("");
				String nom ="";
				Scanner sca = new Scanner(System.in);
				boolean cond = false;
				while (!cond) {
					System.out.print("Nom de la personne à supprimer (fin pour terminer) : ");
					nom = sca.next();
					nom = nom.toUpperCase();
					cond = nom.equalsIgnoreCase("fin");
					String genre = "artiste";
					if((!(nom.equalsIgnoreCase("fin")))){
						ConnectionDB.suppressoptim(nom, genre);
					}
				}
					break;
				case 0 : System.out.println("Vous allez être redirigé vers le menu précédent");
					break;
				default : System.out.println("Erreur de saisie");
				}
				
		}
	}
	
	
 	
 	
	public static void quitter(){
		System.out.println("Au revoir.");
	}

}
			
					
		
					
					
		
	
	
