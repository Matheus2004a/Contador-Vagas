package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vagas, programador = 0, analista = 0, dba = 0, test_Prog = 0, gerente_Pr = 0, total_Cand, finalizar;

        System.out.println("Lista de vagas de TI:");
        System.out.println("1 - Programador");
        System.out.println("2 - Analista");
        System.out.println("3 - Gerenciador de Banco de Dados");
        System.out.println("4 - Testador de programas");
        System.out.println("5 - Gerente de Projetos");
        System.out.println("0 - Finalizar");

        System.out.print("Quais vagas de TI você deseja se candidatar:");
        vagas = teclado.nextInt();

        do {
            System.out.print("Escolha apenas o número das vagas disponíveis acima:");
            vagas = teclado.nextInt();

            switch (vagas) {
                case 1:
                    programador += 1;
                    System.out.println("Quantidade de programador:" + programador);
                break;
                case 2:
                    analista += 1;
                    System.out.println("Quantidade de analista:" + analista);
                break;
                case 3:
                    dba += 1;
                    System.out.println("Quantidade de Gerenciador de Banco de Dados:" + dba);
                break;
                case 4:
                    test_Prog += 1;
                    System.out.println("Quantidade de Testador de programas:" + test_Prog);
                break;
                case 5:
                    gerente_Pr += 1;
                    System.out.println("Quantidade de Gerente de Projetos:" + gerente_Pr);
                break;
                
                default:
                    System.out.println("*** Entre apenas com os números disponíveis na lista ***");                
                break;
            }
            System.out.println("------------------------------------------------");
        } while (vagas != 0);


        total_Cand = programador + analista + dba + test_Prog + gerente_Pr;

        System.out.println("Quantidade de candidatos a Programador:" + programador);
        System.out.println("Quantidade de candidatos a Analista:" + analista);
        System.out.println("Quantidade de candidatos a Gerenciador de Banco de Dados:" + dba);
        System.out.println("Quantidade de candidatos a Testador de programas:" + test_Prog);
        System.out.println("Quantidade de candidatos a Gerente de Projetos:" + gerente_Pr);
        System.out.println("Total de candidatos:" + total_Cand);
    }
}
