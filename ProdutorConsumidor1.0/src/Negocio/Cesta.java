package Negocio;

public class Cesta {
	int n = 0;
	synchronized public int get()  {// retorna a quantidade na cesta
		
		return n;
	}
	synchronized int put(int n)  {// adiciona produtos � cesta
		this.n= n;
		return this.n;
	}


}
