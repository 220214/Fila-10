package model;

public class Cliente {
	public float total;
	public int Qp;
	public float valor;
	public String nome;
	@Override
	public String toString() {
	String ret = nome +" - "+ "Quantidade "+Qp+" valor de cada peça "+ valor +"Valor Total "+ total;
	return ret;
	}
}
