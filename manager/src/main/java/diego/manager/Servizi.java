package diego.manager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servizi")
public class Servizi {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getServizio() {
		return servizio;
	}
	public void setServizio(String servizio) {
		this.servizio = servizio;
	}
	public String getLivello() {
		return livello;
	}
	public void setLivello(String livello) {
		this.livello = livello;
	}
	private String servizio;
	private String livello;

}
