import java.util.Scanner;

import model.Conta;
import model.Meta;
import model.Receita;
import model.Despesa;

public class Programa.java {
    public static void main(String args[]) {

     Scanner sc = new Scanner(System.in);
        
        Conta conta = new Conta("1234567", "Gertrude");
        
        Meta meta = new Meta("moto", 9000, 4000);
        
        Receita receita = new Receita("Salario", 2500);
        
        Despesa despesa = new Despesa("Aluguel", 1200, "pendente");
        
        int deposito = 0;
        
        //RELATÓRIO
        System.out.println("--SISTEMA DE CONTROLE FINANCEIRO--");
        System.out.print("Cliente:" + conta.getCliente());
        System.out.println("Saldo inicial" + conta.getSaldo());
        System.out.println("----------------------------------");
        System.out.println("Deseja depositar este valor?" + receita.getOrigem()
            + " | Saldo inicial: R$ " + receita.getValor()
            + "? (1-Sim / 2-Não): ");
             
        deposito = sc.nextInt();
        if (deposito == 1) {
            conta.setSaldo(conta.getSaldo() + receita.getValor());
            System.out.println("Salario adicionado com sucesso.");
            System.out.println("Saldo Atual: R$ " + conta.getSaldo());

        } else {
          System.out.println("Depósito cancelado.");
        }

        //Despesa
        System.out.print("Deseja pagar a despesa [" + despesa.getDescricao()
                + "] de R$ " + despesa.getValor()
                + "? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();

        if (opcao == 1) {

            if (conta.getSaldo() + conta.getLimite() >= despesa.getValor()) {

                conta.setSaldo(conta.getSaldo() - despesa.getValor());
                despesa.setStatus("Paga");

                System.out.println("Despesa paga com sucesso!");
                System.out.println("Saldo Atual: R$ " + conta.getSaldo());

            } else {
                System.out.println("Saldo insuficiente.");
            }

        } else {
            System.out.println("Pagamento cancelado.");
        }


        
        System.out.println("Deseja poupar R$300 para a meta ("+ conta.getObjetivo() + "?) [1 - sim  / 2 - não]" );
        int pouparResposta = sc.nextInt();
        if (pouparResposta == 1){
             
            if (conta.getSaldo() >= 300) {
               
               conta.setSaldo(conta.getSaldo() - 300);
               meta.setValorPoupado(meta.getvalorPoupado() + 300);
               System.out.println("Dinheiro guardado na meta com sucesso!");
               
            }else {
                
                System.out.println("ERRO! saldo insuficiente. ");
            }
        }    
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("====================================");
        System.out.println("         RELATORIO FINANCEIRO       ");
        System.out.println("====================================");
        System.out.println("Conta:" + conta.getNumero() + "|Cliente" + conta.getCliente());
        System.out.println("Saldo final" + RS  + "|Limite" + conta.getLimite());
        System.out.println("Situação do aluguel:" + );
        System.out.println("Meta [Comprar moto]" + );
        System.out.println("====================================");
        
        
    }
}
