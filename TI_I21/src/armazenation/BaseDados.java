package armazenation;

import java.util.Vector;

import controller.ControladorFicheiro;
import model.Cliente;

public class BaseDados {
	protected static Vector<Cliente> clientes = ControladorFicheiro.lerInfo();
//	private static Vector<Produto> produtos =  ServiceDao.readInfo(Constante.PRODUTO_FILE);
//	private static Vector<Venda> vendas =  ServiceDao.readInfo(Constante.VENDA_FILE);

	public static Vector<Cliente> getClientes() {
		return clientes;
	}
	public static void setClientes(Cliente cliente) {
		BaseDados.clientes.add(cliente);
	}
	
}
