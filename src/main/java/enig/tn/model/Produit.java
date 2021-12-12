package enig.tn.model;

import java.util.Date;

import javax.persistence.*;


@Entity
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String desc ;
	private float pa;
	private float pv;
	private Date d; 
	private int q;
	@ManyToOne
	@JoinColumn(name="m_id")
	private Magasin m;
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(int num, String desc, float pa, float pv, Date d, int q, Magasin m) {
		super();
		this.num = num;
		this.desc = desc;
		this.pa = pa;
		this.pv = pv;
		this.d = d;
		this.q = q;
		this.m = m;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPa() {
		return pa;
	}
	public void setPa(float pa) {
		this.pa = pa;
	}
	public float getPv() {
		return pv;
	}
	public void setPv(float pv) {
		this.pv = pv;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	public Magasin getM() {
		return m;
	}
	public void setM(Magasin m) {
		this.m = m;
	}
	
	

}
