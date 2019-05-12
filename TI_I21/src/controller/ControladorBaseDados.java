package controller;

import armazenation.BaseDados;
import model.Cliente;

public class ControladorBaseDados {
	public static void adicionarCliente (Cliente cliente){
		BaseDados.setClientes(cliente);
	}
}
