/*import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//int duplicata = 0;
	       	   	while(rs.next()){
	       	   		String nom = rs.getString("nom");
	       	   		if (nomt.equals(nom)){
	       	   			bulle = true;
	       	   		//	duplicata +=1;
	       	   		}      	   		
	       	   	}
	    	} catch (SQLException e){
	    		System.out.println(e.getMessage());
	    	}
	    	return bulle;
	    }
	    	
	    	
	    
	    
	    
	    // méthode suppresion artiste
	    public static void artisteSupprimer (String nomt){
	    	
	    	try{
	    		String query = "SELECT id, nom, prenom, cachet FROM artiste";
	    		Connection cnx = ConnecterDB();
	    		Statement st = cnx.createStatement();
	    		ResultSet  rs = st.executeQuery(query);
	    		boolean bulle = false;
	    		bulle = verifsup(nomt, "artiste");
	       	   	if (bulle == true){
    	   			String sql = "DELETE FROM `artiste` WHERE `nom`='"+nomt+"'";
    	   			Statement sts = cnx.createStatement();
    	   			sts.executeUpdate(sql);
    	   			nomt = convertString(nomt);
    	   			System.out.println("artiste "+nomt+" supprimé");
    	   		}
    	   		else{
    	   			nomt = convertString(nomt);
    	   			System.out.println("L'entrée "+nomt+" n'existe pas dans la base");
    	   		}
	    	//fermeture de la connection
	    	st.close();
	    	cnx.close();
	    	
	    	} catch (SQLException e){
	    		System.out.println(e.getMessage());
	    	}
	    }
	    
public class draft {

}*/
