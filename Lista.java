package Lista;

public class Lista {

	private Nodo prim;
	
	public void criaLista() {
		prim = null;
	}
	
	public void add(int i) {
		Nodo novo = new Nodo();
		novo.setInfo(i);
		novo.setProx(prim);
		prim = novo;
	}
	
	public void showLista() {
		Nodo no = prim;
		while (no != null){
		System.out.println(no.getInfo());
		no = no.getProx();
		}
	}
}
