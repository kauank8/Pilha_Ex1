package view;

import br.com.KauanPaulino.pilhaint.No;
import br.com.KauanPaulino.pilhaint.Pilha;

public class main {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		System.out.println("EXERCICIO A:");
		//Ex a
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				p.push(i*i);
			}else {
				if(i<=5) {
					p.push(i);
				} else {
					try {
						p.pop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			try {
				int topo = p.top();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tamanho = p.size();
		System.out.println("O tamanho da pilha:" + tamanho);
		System.out.println("A pilha Ficou:");
		int valor;
		for(int i=0; i<tamanho; i++) {
			try {
				valor=p.top();
				System.out.println(valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("FIM EXERCICIO A \n");
//		//fim EX A;
		
		//Inicio ExB
		Pilha Pb = new Pilha();
		System.out.println("INICIO EXERCICIO B:");
		
		for(int i=100;i<115;i++) {
			if(Pb.isEmpty()) {
				Pb.push(i+100);
			} else {
				if(Pb.size()<=4) {
					Pb.push(i+50);
				} else {
					try {
						Pb.pop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			try {
				Pb.top();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tamanhoB = Pb.size();
		System.out.println("O tamanho da pilha:" + tamanhoB);
		System.out.println("Pilha:");
		
		for(int i=0;i<tamanhoB;i++) {
			int valorB;
			try {
				valorB=Pb.top();
				System.out.println(valorB);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Pb.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	
}
