package enig.tn.model;

import javax.persistence.*;

@Entity 
public class Magasin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String lieu ;
	
	
	public Magasin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magasin(int id, String nom, String lieu) {
		super();
		this.id = id;
		this.nom = nom;
		this.lieu = lieu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	

}
