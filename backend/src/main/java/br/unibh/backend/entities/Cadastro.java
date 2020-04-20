package br.unibh.backend.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cadastro")
public class Cadastro {
	

	public Cadastro(String nome, String endereco,String cpf, String email, String telefone, String password ) {
		
	}
	
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)	
	private Long id;
	
	@Column(nullable = false, length = 255)
	private String nome;
		
	@Column(nullable = false)
	private String cpf;	

	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	private String password;
	
	//@ManyToOne
	//private CadastroOng cadastroOng;	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
