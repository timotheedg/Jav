

	import java.util.ArrayList;

	public class festemp {
/*	 private ArrayList<Concert> concert=new ArrayList<Concert>();
	 private ArrayList<Spectateur> spectateur=new ArrayList<Spectateur>();
	 private ArrayList<Personnel> personnel=new ArrayList<Personnel>();
	 private ArrayList<Commerce> commerce=new ArrayList<Commerce>();
	 
	 // M�thode pour ajouter concert � l'arraylist Concert
	 public void ajoutConcert(Concert c){
	  concert.add(c);
	 }
	 
	//M�thode pour supprimer concert � l'arraylist Concert
	public void SuppConcert(Concert c){
	concert.remove(c);
	}

	 
	 /* M�thode pour supprimer concert � l'arraylist Concert (plus efficace quand on aura un menu) 
	 public void suppConcert(String date, String heure_debut, Scene scene){
	  Concert c = new Concert(date, heure_debut, scene);
	  if(concert.indexOf(c) != -1){
	   concert.remove(c);
	  }
	 }*/

/*
	 // M�thode pour ajouter spectateur � l'arraylist Spectateur
	 public void ajoutSpect(Spectateur s){
	  spectateur.add(s);
	 }
	 
	 
	//M�thode pour supprimer spectateur � l'arraylist Spectateur
	public void SuppSpect(Spectateur s){
	spectateur.remove(s);
	}

	 
	 
	 
	 
	 /*M�thode pour supprimer spectateur � l'arraylist Spectacteur(plus efficace quand on aura un menu) 
	 public void suppSpect(String nom, String prenom, int age, float tarif){
	  Spectateur s = new Spectateur(nom, prenom, age, tarif);
	  if(spectateur.indexOf(s) != -1){
	   spectateur.remove(s);
	  }
	 }*/
	/* 
	 
	 // M�thode pour ajouter personnel � l'arraylist Personnel
	 public void ajoutPerso(Personnel p){
	  personnel.add(p);
	 }
	 
	 
	//M�thode pour supprimer personnel � l'arraylist Personnel
	public void SuppPerso(Personnel p){
	personnel.remove(p);
	}
*/
	 
	 /* M�thode pour supprimer personnel � l'arraylist personnel (plus efficace quand on aura un menu) 
	 public void suppPerso(String nom, String prenom, int salaire){
	  Personnel s = new Personnel(nom, prenom, salaire);
	  if(personnel.indexOf(s) != -1){
	   personnel.remove(s);
	  }
	 }*/
	 
/*	 
	 // M�thode pour ajouter commerce � l'arraylist Commerce
	  public void ajoutCommerce(Commerce c){
	   commerce.add(c);
	  }
	  
	//M�thode pour supprimer commerce � l'arraylist commerce
	public void SuppCommerce(Commerce c){
	commerce.remove(c);
	}

	  
	*/  
	  
	  /*M�thode pour supprimer commerce � l'arraylist commerce (plus efficace quand on aura un menu) 
	 public void suppCommerce(String nom, String type, int frais_entree){
	  Commerce s = new Commerce(nom, type, frais_entree);
	  if(commerce.indexOf(s) != -1){
	   commerce.remove(s);
	  }
	 }*/
	 
/*	 
	 // M�thode Afficher le programme
	 public String toString(){
	  String s = new String();
	  for(Concert c : concert ){
	    s= s+"\n"+c;
	  }
	  return s;
	 }
	 
	 // M�thode Total Personnel
	 public int TotalPersonnel(){
	  return personnel.size();
	 } 
	  
	 // M�thode calcul Frais    somme (calcul technicien*salaire, calcul S�curit�*salaire, calcul Staff*salaire, cachet)
	 public int CalculsFrais(){
	  int t =0;
	  for (Personnel p : personnel){
	   t+= p.salaire;
	  }
	  return t;
	 }
	 
	 // M�thode calcul Places vendues
	 public int CalcPlaceVendues(){
	  return spectateur.size();
	 }
	  
	 // M�thode calcul Benefice
	 public int CalculBenefice(){
	  int t =0,v= 0;
	  for (Spectateur s : spectateur){
	   t+= s.tarif;
	  }
	  for (Commerce c : commerce){
	   v+= c.frais_entree;
	  }
	  return t+v;
	 }
	  
	 public int CalculMarge(){
	  return CalculBenefice()-CalculsFrais();
	 }
	}
*/

}
