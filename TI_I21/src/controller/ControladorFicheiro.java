package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Vector;

import model.Cliente;



public class ControladorFicheiro {
	//salvar cliente
	public static void guardarInfo(Object object) {
//		File ficheiro = ;
		try {
//			FileOutputStream stream = ;
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File(Constante.FILE_CLIENTE)));
			output.writeObject(object);
			output.close();
		} catch (IOException e) {
		}
	}
	public static Vector<Cliente> lerInfo() {
		Vector<Cliente> vector = new Vector<>();
		try {
			ObjectInputStream guardar = new ObjectInputStream(new FileInputStream(new File(Constante.FILE_CLIENTE)));
			vector.addAll((Collection) guardar.readObject());
			guardar.close();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e);
		}
		return vector;
	}
	
//	public static Vector<Object> lerInfo() {
//		File ficheiro = new File(Constante.FILE_CLIENTE);
//		Vector<Object> vector = new Vector<>();
//		try {
//			FileInputStream stream = new FileInputStream(ficheiro);
//			ObjectInputStream guardar = new ObjectInputStream(stream);
//			vector.addAll((Collection<?>) guardar.readObject());
//			guardar.close();
//		} catch (IOException | ClassNotFoundException e) {
//			System.err.println(e);
//		}
//		return vector;
//	}
	
	
}
