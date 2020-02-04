package diego.manager;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persone")


public class Persone {
	private Integer id;
	private String nome;
	private String cognome;
	private Date data_di_nascita;
	private String luogo_di_nascita;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	

	public String getLuogo_di_nascita() {
		return luogo_di_nascita;
	}

	public void setLuogo_di_nascita(String luogo_di_nascita) {
		this.luogo_di_nascita = luogo_di_nascita;
	}
	
	public Date getData_di_nascita() {
		return data_di_nascita;
	}

	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;



}
}
