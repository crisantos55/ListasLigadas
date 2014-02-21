package LISTA;

public class Nodo {
	public Nodo siguiente;
	public Integer numero;
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Nodo(Integer num){
		this.siguiente=null;
		this.numero=num;
	}

}
