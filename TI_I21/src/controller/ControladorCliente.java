package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import armazenation.BaseDados;
import model.Cliente;

public class ControladorCliente extends BaseDados{
	public static void criarCliente (String id, String nome, String email, int codigoPostal, String dataNascimento){
		Cliente cliente = new Cliente(id, nome, email, codigoPostal, dataNascimento);
		
		ControladorBaseDados.adicionarCliente(cliente); // guardarCliente dentro do vector 
		ControladorFicheiro.guardarInfo(BaseDados.getClientes()); // guardarCliente no ficheiro
	}
	public static void visualizarCliente (){
		for(int i = 0; i < BaseDados.getClientes().size(); i++){
			System.out.println(BaseDados.getClientes().elementAt(i));
		}
//		for(int i = 0 ; i<ControladorFicheiro.lerInfo().size(); i++){
//			System.out.println(ControladorFicheiro.lerInfo().elementAt(i));
//		}
	}
	public static void removerCliente(String nome){
		for (Cliente cliente : BaseDados.getClientes()) {
			if(cliente.getNome().equalsIgnoreCase(nome)){
				BaseDados.clientes.remove(cliente);
				System.out.println("Cliente removido com Sucesso!");
				salvarCliente();
				return;
			}
			
		}
		salvarCliente();
		System.out.println("O Cliente não existe!");   }
	 
	public static void AtualizarCliente(String nome) {
			for (Cliente cliente : BaseDados.getClientes()) {
				if(cliente.getNome().equalsIgnoreCase(nome)){
					ControladorMenu.menuAtualizarCliente(cliente);
					salvarCliente();
					return;
				}}
			salvarCliente();
			System.out.println("O Cliente não existe!");
		}
	
	public static void salvarCliente(){
		ControladorFicheiro.guardarInfo(BaseDados.getClientes()); }
	
	public static Date validarDataNascimento (String dataNascimento){
		try{
			SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
			return ft.parse(dataNascimento);
		}catch (ParseException e){}
		return null;
	}
	public static String format(Date dataNascimento){
		SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
		return ft.format(dataNascimento);
	}

}
