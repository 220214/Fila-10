package view;

import br.mari.FilaObject.Fila;
import controller.Calcular;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.isEmpty();
		
		for(int i=0;i<20;i++) {
			Cliente c =new Cliente ();
			c.nome ="Cliente" + i;
			c.Qp=(int)((Math.random()*30)+20);
			c.valor=(float)((Math.random()*95)+5);
			c.total = c.Qp * c.valor;
			fila.insert(c);
		}
		Calcular Cal = new Calcular();
		Cal.Cvalor(fila);
	
		
	
	}
	}
