package controller;

import br.mari.FilaObject.Fila;
import model.Cliente;

public class Calcular {
	Fila f =new Fila();
	
	
	public Calcular() {
	super();	
	}
	public void Cvalor (Fila fila) {
		
		try {
			 fila.list();
			} catch (Exception e) {
				e.printStackTrace();
			}
		for(int i=0;i<20;i++) {
		try {
			Object v =fila.remove();
			System.out.println(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	}


