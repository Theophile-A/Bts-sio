package aeronautique;

import controleur.Controleur; 
import dao.Connexion;


/**
 * - Il faut commencer par faire le métier, puis regarder la classe Connexion,
 * puis le Design Pattern DAO sur la table VOL
 * - Ensuite on étend aux autres tables AVION et PILOTE
 * - faire quelques vérifications de base sur la table vol :
 * lors du create, est-ce que les clés étrangères sont dans la table.
 * Il faut lever une exception précise dans le cas contraire.
 * - Essayer des requêtes plus complexes et les proposer dès le menu.
 * - Algorithmique : soigner l'affichage des réponses pour avoir un titre
 * aux colonnes et qu'elles soient de largeur fixe.
 * 
 * Si vous utilisez le type Money sous SQL Server Express, il faut utiliser
 * DECIMAL	avec JDBC et java.math.BigDecimal pour java.
 * 
 * @author abi
 *
 */
public class Principale {

	public static void main(String[] args) {

		//Connexion.getInstance();
		//initialisation();
		//		new Controleur();		
		//		Connexion.fermer();
		testerAfficheEtoile();
		System.out.println("-----------");
		testerAfficheEtoile1();
		System.out.println("-----------");
		testerAfficheEtoile2();
		Connexion.fermer();
	}

	private static void testerAfficheEtoile() {
		Connexion.afficheSelectEtoile("Avion", "nomAv='Boeing'");
	}
	private static void testerAfficheEtoile1() {
		Connexion.afficheSelectEtoile("Vol", "numAv=1");
	}
	private static void testerAfficheEtoile2() {
		Connexion.afficheSelectEtoile("Pilote", "salaire>=2700.0000");
	}

	public static void initialisation() {
		Connexion.executeUpdate("drop table VOL;");
		Connexion.executeUpdate("drop table PILOTE;");
		Connexion.executeUpdate("drop table AVION;");
		
		String pilote ="Create table PILOTE (numPil integer primary key not NULL identity (1,1), "
				+ "nomPil varchar(40) not NULL, "
				+ "adresse varchar(100) not NULL, "
				+ "salaire money not NULL); ";

		String avion ="Create table AVION (numAv integer primary key not NULL identity (1,1), "
				+ "nomAv varchar(50) not NULL, "
				+ "capacite integer not NULL, "
				+ "loc varchar(30) not NULL); ";

		String vol ="Create table VOL (numVol integer primary key not NULL identity (1,1), "
				+ "numPil integer foreign key references PILOTE(numPil) not NULL, "
				+ "numAv integer foreign key references AVION(numAv) not NULL, "
				+ "villeDep varchar(50) not NULL, "
				+ "villeArr varchar(50) not NULL, "
				+ "heureDep datetime, "
				+ "heureArr datetime); ";
		Connexion.executeUpdate(pilote);
		Connexion.executeUpdate(avion);
		Connexion.executeUpdate(vol);

		
		
		Connexion.executeUpdate("Insert into PILOTE (nomPil, adresse, salaire)"
				+ " VALUES ('Durand','Paris',3350.00), "
				+ " ('Dupont','Nice',3000.00), "
				+ " ('Michel','Rennes',2700.00), "
				+ " ('Martin','Marseille',2300.00), "
				+ " ('Pourquoi','Paris',16000.00), "
				+ " ('Jibzz','Utrecht',400000.00); ");
		
		Connexion.executeUpdate("Insert into AVION (nomAv, capacite, loc)"
				+ " VALUES ('Boeing',400,'Nice'), "
				+ " ('Boeing',490,'Nice'), "
				+ " ('VirginAirlines',360,'Rennes'), "
				+ " ('AvionBob',350,'Nice'), "
				+ " ('EmiratesAirlines',156,'Rennes'); ");
		
		Connexion.executeUpdate("Insert into VOL (numPil, numAv, villeDep, villeArr, heureDep, heureArr)"
				+ " VALUES ('1','1','Rennes','Paris','03/10/2017 13:30:00','03/10/2017 14:30:00'), "
				+ " ('2','2','Nice','Paris','03/10/2017 13:00:00','03/10/2017 15:00:00'), "
				+ " ('3','3','Nice','Rennes','03/10/2017 12:00:00','03/10/2017 14:45:00'), "
				+ " ('2','1','Paris','Rennes','03/10/2017 16:30:00','03/10/2017 17:30:00'), "
				+ " ('3','4','Brest','Bamako','03/10/2017 06:00:00','03/10/2017 16:00:00'), "
				+ " ('4','5','Rennes','Strasbourg','03/10/2017 06:55:00','03/10/2017 16:00:00'), "
				+ " ('2','1','Nice','Paris','03/10/2017 18:00:00','03/10/2017 19:00:00'), "
				+ " ('3','4','Rennes','Nice','03/10/2017 18:00:00','03/10/2017 20:45:00'); ");
		
		

	}
}
