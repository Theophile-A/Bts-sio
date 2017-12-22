package aeronautique;

import java.math.BigDecimal;

public class Pilote {

	private int numPil;
	private String nomPil;
	private String adresse;
	private BigDecimal salaire;

	public Pilote(int numPil, String nomPil, String adresse, BigDecimal salaire) {
		super();
		this.numPil = numPil;
		this.nomPil = nomPil;
		this.adresse = adresse;
		this.salaire = salaire;
	}

	public int getNumPil() {
		return numPil;
	}

	public void setNumPil(int numPil) {
		this.numPil = numPil;
	}

	public String getNomPil() {
		return nomPil;
	}

	public void setNomPil(String nomPil) {
		this.nomPil = nomPil;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public BigDecimal getSalaire() {
		return salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}
}

