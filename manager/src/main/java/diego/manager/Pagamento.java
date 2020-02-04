package diego.manager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pagamento")

public class Pagamento {
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
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Integer getId_persona() {
		return id_persona;
	}
	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}
	public Integer getId_servizio() {
		return id_servizio;
	}
	public void setId_servizio(Integer id_servizio) {
		this.id_servizio = id_servizio;
	}
	private String stato;    
	private Integer id_persona;
	private Integer	id_servizio;
	

}
