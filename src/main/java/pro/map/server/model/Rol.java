package pro.map.server.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data @AllArgsConstructor
@Table(name="rol")
public class Rol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@JsonProperty(value = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="nombre", length = 25)
	@JsonProperty(value = "nombre")
	private String nombre;
	
	public Rol() {
		super();
	}
	
}
