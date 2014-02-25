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
	
	public void comprueba(){
		Lista inicio=new Lista();
		Lista a1= new Lista();
		Lista a2= new Lista();
		inicio.insertar(1);
		inicio.insertar(2);
		inicio.insertar(3);
		inicio.insertar(4);
		inicio.recorrer();
		//this.dividir(inicio);
		inicio.eliminarUltimo();
		inicio.recorrer();
		
	}
	
 

	
	public void dividir(Lista a){
		Nodo aux=a.inicio;
		Nodo aux2=a.inicio;
		if(aux!=null){
			Lista n1= new Lista();
			Lista n2= new Lista();
			boolean ban=true;
			if(aux.getSiguiente()!=null){
			while(aux!=null){
				if(ban){
					n1.insertar(aux.getNumero());
					ban=false;
					aux=aux.getSiguiente();
				}else{
					n2.insertar(aux.getNumero());
					ban=true;
					aux=aux.getSiguiente();
				}
				
			}
			
			}else{
				n1.insertar(aux.getNumero());
			}
			System.out.println("lista original");
			a.recorreRecursivo(aux2);
			System.out.println("Lista 1 ");
			n1.recorrer();
			System.out.println("Lista 2");
			n2.recorrer();
		}
		
		else{
			System.out.println("Lista vacia");
		}
	}
	
	public void recorreRecursivo(Nodo aux){
		
		if(aux!=null){
			System.out.println(aux.getNumero());
			this.recorreRecursivo(aux.getSiguiente());
		}
	}
	
	public void eliminarUltimo(){
		Nodo aux= inicio;
		Nodo aux2=null;
		while(aux.getSiguiente()!=null){
			aux2=aux;
			aux=aux.getSiguiente();
		}
		aux2.setSiguiente(null);
		
	}
	
	public void eliminarDuplicados(){
		Nodo aux=inicio;
		Nodo aux2=null;
		Nodo aux3=null;
		Nodo aux4=inicio;
		if(aux.getSiguiente()!=null){
			while(aux4!=null){
				while(aux!=null){
					
				}
				aux=inicio;
				aux4=aux4.getSiguiente();
			}
		}else{
			System.out.println("No hay repetidos");
		}
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
