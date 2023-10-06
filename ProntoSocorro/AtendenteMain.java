package ProntoSocorro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AtendenteMain {

	public static void main(String[] args) {
		
		boolean[] respostas= new boolean[4];
		int resp=0;
		int resp2=0;
		Scanner entrada= new Scanner(System.in);
		String nome;
		String nascimento;
		Calendar nasc=Calendar.getInstance();
		ListaAtendimento lista = new ListaAtendimento();
		Atestado atestado=new Atestado();
		
		
		do {
			System.out.println("[1]-Cadastrar Paciente");
			System.out.println("[2]-Chamar para atendimento");
			System.out.println("[3]-Exibir fila");
			System.out.println("[4]-Exibir histórico");
			System.out.println("[5]-Sair");
			System.out.print("O que deseja fazer atendente? : ");
			resp=entrada.nextInt();
			entrada.nextLine();
			if(resp==1) {
				System.out.print("\nQual seu nome? : ");
				nome=entrada.nextLine();
				System.out.print("\nQual sua data de nascimento? : ");
				nascimento=entrada.nextLine();
				nasc.set(Calendar.DAY_OF_MONTH,Integer.parseInt(nascimento.substring(0, 2)));
				nasc.set(Calendar.MONTH,Integer.parseInt(nascimento.substring(3, 5)));
				nasc.set(Calendar.YEAR,Integer.parseInt(nascimento.substring(6, 10)));
				Date dataNasc=nasc.getTime();
				Atendimento atendimento=new Atendimento(nome,dataNasc);
				//PERGUNTAS PARA DEFINIR PRIORIDADE
				
				//PERGUNTA 1:
				System.out.println("[1]=sim\n[2]=não");
				System.out.print("\nVocê está com febre? : ");
				resp2=entrada.nextInt();
				if(resp2==1) {
					respostas[0]=true;
				}else {
					respostas[0]=false;
				}
				
				//PERGUNTA 2:
				System.out.print("\nVocê sente dores no corpo? : ");
				resp2=entrada.nextInt();
				if(resp2==1) {
					respostas[1]=true;
				}else {
					respostas[1]=false;
				}
				
				//PERGUNTA 3:
				System.out.print("\nVocê teve desmaios? : ");
				resp2=entrada.nextInt();
				if(resp2==1) {
					respostas[2]=true;
				}else {
					respostas[2]=false;
				}
				
				//PERGUNTA 4:
				System.out.print("\nVocê utilizou algum tipo de droga? : ");
				resp2=entrada.nextInt();
				if(resp2==1) {
					respostas[3]=true;
				}else {
					respostas[3]=false;
				}
				
				atendimento.calculaPrioridade(respostas);
				
				System.out.println("\nObrigado! aguarde na fila até ser chamado para o atendimento!");
				
				lista.addFila(atendimento);
				
				
				
			}else {
				if(resp==2) {
					System.out.println("Chamar quantos? : ");
					resp2=entrada.nextInt();
					for (int i = 0; i < resp2; i++) {
						lista.addAtendidos(lista.getFila().get(i));
						System.out.println("ATESTADO: ");
						System.out.println(atestado.emitirAtestado(lista.getFila().get(i)));
						lista.removerFila(i);
					}
					
				}else {
					if(resp==3) {
						for (int i = 0; i < lista.getFila().size(); i++) {
							System.out.println(lista.getFila().get(i));
						}
					}else {
						if(resp==4) {
							for (int i = 0; i < lista.getAtendidos().size(); i++) {
								System.out.println(lista.getAtendidos().get(i));
							}
						}else {
							System.out.println("\nFim do expediente! vá para casa descansar!");
						}
					}
				}
			}
		}while(resp!=5);
 
	}
  
}
