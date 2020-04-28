package br.unibh.backend.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class Evento {
	

	public Evento(Long id_envento, String nome, Date data_hora, String descricao, String local, int quant_participante,
			int espaco) {
		this.nome = nome;
		this.data_hora = data_hora;
		this.descricao = descricao;
		this.local = local;
		this.quant_participante = quant_participante;
		this.espaco = espaco;
	}
	
	//Atributos
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id_envento;
	
	@Column(name = "nome_evento",length=30, nullable = false)
	private String nome;
	
	@Column(name = "dataHora_evento",nullable = false)
	private Date data_hora;
	
	@Column(name = "descricao_evento", length=255 , nullable = false)
	private String descricao; 
	
	@Column(name = "local_evento",nullable = false)
	private String local;
		
	@Column(name = "quantPessoas_evento",nullable = false)
	private int quant_participante;
	
	@Column(name = "espaco_evento",nullable = false)
	private int espaco; // Quantidade maxima de participantes no evento.

	//Métodos Get e Set
	
	public Long getId_envento() {
		return Id_envento;
	}

	public void setId_envento(Long id_envento) {
		Id_envento = id_envento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getQuant_participante() {
		return quant_participante;
	}

	public void setQuant_participante(int quant_participante) {
		this.quant_participante = quant_participante;
	}

	public int getEspaco() {
		return espaco;
	}

	public void setEspaco(int espaco) {
		this.espaco = espaco;
	}
		
	// Determina a quantidade Maxima de Pessoas no evento
	
	public int qntMaximaDePessoas(int qntMaxima) {	
		Scanner entrada = new Scanner (System.in);
		int qntPessoasNoLocal;
		System.out.println("Quantida máxima de pessoas no evento");
		qntPessoasNoLocal = entrada.nextInt();
		
		if (this.getQuant_participante() < qntPessoasNoLocal) {
			this.setQuant_participante(1);
		}else if(this.getQuant_participante() >= qntPessoasNoLocal) {
			System.out.println("O evento da Ong no local"+ this.getLocal() +" está cheio." );
		}
		return qntMaxima;
	}

	// Status do evento
	public String statusEvento( String statusEvento ) {
		System.out.println("Nome do evento " + this.getNome());
		System.out.println("Quantidade de pessoas " + this.getQuant_participante());
		System.out.println("Data " + getData_hora());
		System.out.println("Local " + getLocal());
		return statusEvento;
	}
	
	public void addParticipante() {
		ArrayList<Cadastro> addParticipante = new ArrayList<Cadastro>();
		for (int i = 0; i < this.getEspaco(); i++) {
			Cadastro participante = new Cadastro();
			addParticipante.add(participante);
		}
	}
		
}
