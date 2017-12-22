package dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import aeronautique.Pilote;

public class PiloteDAO extends DAO<Pilote> {
	
	private static final String TABLE = "Pilote";
	private static final String CLE_PRIMAIRE = "numPil";

	@Override
	public boolean create(Pilote pilote) {
		boolean succes = true;
		try {
			String sql = "INSERT INTO " + TABLE + " (nomPil, adresse, salaire) VALUES (?,?,?)";
			PreparedStatement creaPil = Connexion.getInstance().prepareStatement(sql);
			creaPil.setString(1, pilote.getNomPil());
			creaPil.setString(2, pilote.getAdresse());
			creaPil.setBigDecimal(3, pilote.getSalaire());
			creaPil.executeUpdate();
			
		}  catch (SQLException e) {
			
			succes=false;
			e.printStackTrace();
		}
		return succes;
	}

	@Override
	public boolean delete(Pilote pilote) {
		boolean succes=true;
		try {
			String sql = "delete from "+ TABLE +" where "+CLE_PRIMAIRE+" = ?;";
			PreparedStatement delPil = Connexion.getInstance().prepareStatement(sql);
			delPil.setInt(1, pilote.getNumPil());
			delPil.executeUpdate();
			
		} catch (SQLException e) {
			
			succes=false;
			e.printStackTrace();
		}
		return succes;
	}

	@Override
	public boolean update(Pilote pilote) {
		boolean succes=true;
		try {
			String sql = "update from "+ TABLE +" where "+CLE_PRIMAIRE+" =?;";
			PreparedStatement upPil = Connexion.getInstance().prepareStatement(sql);
			upPil.setInt(1, pilote.getNumPil());
			upPil.executeUpdate();
			
		} catch (SQLException e) {
			
			succes=false;
			e.printStackTrace();
		}
		return succes;
	}

	@Override
	public Pilote find(int id) {
		Pilote Pilote = null;
		try {
			ResultSet rs = 
			
		} catch (SQLException e) {
			
			succes=false;
			e.printStackTrace();
		}
		return succes;
	}

}
