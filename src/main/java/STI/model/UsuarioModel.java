package STI.model;

import org.springframework.data.annotation.Id;
import org.springframework.web.servlet.tags.form.PasswordInputTag;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" )
	private Integer id;
	@Column(name = "username", length = 200, nullable = true)
	private String username;
	@Column(name = "email", length = 60, nullable = true )
	private String email;
	@Column(name = "senha", columnDefinition = "Text", nullable = true )
	private PasswordInputTag senha;
	
	
	
	public UsuarioModel() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PasswordInputTag getSenha() {
		return senha;
	}

	public void setSenha(PasswordInputTag senha) {
		this.senha = senha;
	}

}
