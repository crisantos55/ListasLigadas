package LISTA;

public class Lista {
	public Nodo inicio;

	public Lista() {
		inicio = null;
	}

	public void insertar(Integer num) {
		Nodo nuevo = new Nodo(num);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			Nodo aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}

	public void insertarInicio(Integer num) {
		Nodo nuevo = new Nodo(num);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
	}

	public void insertarMedio(Integer a, Integer b) {
		Nodo aux = inicio;
		Nodo aux2 = null;
		while (aux != null) {
			if (aux.getNumero() == b) {
				Nodo nuevo = new Nodo(a);
				nuevo.setSiguiente(aux2.getSiguiente());
				aux2.setSiguiente(nuevo);

			}
			aux2 = aux;
			aux = aux.getSiguiente();

		}

	}

	public boolean busca(Integer a) {
		Nodo aux = inicio;
		boolean ban = false;
		while (aux != null) {
			if (aux.getNumero() == a) {
				ban = true;
			}
			aux = aux.getSiguiente();
		}
		return ban;
	}

	public void recorrer() {
		Nodo aux = inicio;
		while (aux != null) {
			System.out.println(aux.getNumero());
			aux = aux.getSiguiente();

		}

	}

	public Integer count() {
		Nodo aux = inicio;
		Integer contador = 0;
		while (aux != null) {
			contador++;
			aux = aux.getSiguiente();
		}
		return contador;
	}
	
	public void buscaNelemento(Integer n){
		if(n>this.count()){
			System.out.println("error");
		}else{
			Nodo aux=inicio;
			Integer cont=1;
			
			while(cont!=n){
				cont++;
				aux=aux.getSiguiente();
			}
			System.out.println(aux.getNumero());
		}
	}
	
	public void pop(){
		Nodo aux=inicio;
		System.out.printf(" primer elemento borrado %d %n ",aux.getNumero());
		inicio=aux.getSiguiente();
	}

	public void ordenarBurbuja() {
 
		Nodo aux = inicio;
		Nodo aux2 = aux.getSiguiente();
		// se evita que aux2 este en nulo
		if (aux2 != null) {
			// se compara para saber el mayor
			if (aux.getNumero() > aux2.getNumero()) {
				aux.setSiguiente(aux2.getSiguiente());
				aux2.setSiguiente(aux);
				inicio = aux2;
			}else{
				Nodo t= aux;
				aux=aux2;
				aux2=t;
				
			}
			Nodo aux3 = aux2;
			while (aux.getSiguiente() != null) {
				aux2 = aux.getSiguiente();
				if (aux.getNumero() > aux2.getNumero()) {
					aux.setSiguiente(aux2.getSiguiente());
					aux2.setSiguiente(aux);
					aux3.setSiguiente(aux2);
					aux3 = aux3.getSiguiente();
				} else {
					aux = aux.getSiguiente();
					aux3 = aux3.getSiguiente();
				}

			}

		}

	
	}

}
