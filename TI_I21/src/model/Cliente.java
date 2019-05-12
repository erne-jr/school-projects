package model;

import java.io.Serializable;
import java.util.Date;

import controller.ControladorCliente;

public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private	String id;
	private String nome;
	private String email;
	private int codigoPostal;
	private Date dataNascimento;
	private double saldo;
	
	/*
	protected String nome;
	protected int nuit;
	protected String localizacao;
	protected String email;
	protected String lingua;
	protected String linguagem;
	protected String pais;
	protected String descricaoActividade;
	protected int codigoPostal;
	protected String dataRegistro;
	 */
	
	public Cliente() {
		super();
	}
	
	public static void criarCliente (String id, String nome, String email, int codigoPostal, String dataNascimento){
		ControladorCliente.criarCliente(id, nome,email, codigoPostal, dataNascimento);
	}
	public static void visualizarCliente (){
		ControladorCliente.visualizarCliente();
	}
	
	public Cliente(String id, String nome, String email, int codigoPostal, String dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.codigoPostal = codigoPostal;
		this.saldo = 0;
		this.dataNascimento = ControladorCliente.validarDataNascimento(dataNascimento);
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", codigoPostal=" + codigoPostal
				+ ", dataNascimento=" + ControladorCliente.format(dataNascimento) + ", saldo=" + saldo + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
