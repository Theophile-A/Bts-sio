package aeronautique;

import java.util.GregorianCalendar;
/**
 * étape 0 : les classes métier : le vol
 * on regarde les types de la table VOL
 * @author abi
 *
 */

public class Vol {
	
	private int numVol = 0;
	private Pilote numPil;
	private Avion numAv;
	private String villeDep = "";
	private String villeArr = "";
	private GregorianCalendar heureDep;
	private GregorianCalendar heureArr;
	

	// Constructeur sur les champs.
	
	public Vol(int numVol, Pilote numPil, Avion numAv, String villeDep, String villeArr, GregorianCalendar heureDep,
			GregorianCalendar heureArr) {
		super();
		this.numVol = numVol;
		this.numPil = numPil;
		this.numAv = numAv;
		this.villeDep = villeDep;
		this.villeArr = villeArr;
		this.heureDep = heureDep;
		this.heureArr = heureArr;
	}

	public int getNumVol() {
		return numVol;
	}



	public void setNumVol(int numVol) {
		this.numVol = numVol;
	}



	public Pilote getNumPil() {
		return numPil;
	}



	public void setNumPil(Pilote numPil) {
		this.numPil = numPil;
	}




	public Avion getNumAv() {
		return numAv;
	}




	public void setNumAv(Avion numAv) {
		this.numAv = numAv;
	}




	public String getVilleDep() {
		return villeDep;
	}




	public void setVilleDep(String villeDep) {
		this.villeDep = villeDep;
	}




	public String getVilleArr() {
		return villeArr;
	}




	public void setVilleArr(String villeArr) {
		this.villeArr = villeArr;
	}




	public GregorianCalendar getHeureDep() {
		return heureDep;
	}




	public void setHeureDep(GregorianCalendar heureDep) {
		this.heureDep = heureDep;
	}




	public GregorianCalendar getHeureArr() {
		return heureArr;
	}




	public void setHeureArr(GregorianCalendar heureArr) {
		this.heureArr = heureArr;
	}




	/**
	 * éventuellement utiliser java.sql.Timestamp et getTimeInMillis pour afficher les dates 
	 */
	@Override
	public String toString() {
		// TODO TimeStamp de java.sql se rapproche du dateTime de sql Server
		return null;
	}
	

}
