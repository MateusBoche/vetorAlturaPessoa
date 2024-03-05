package programa;

import entidades.Pessoa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+ (i+1) + "pessoa: ");
            System.out.println("nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoa(nome,idade,altura);
            sc.nextLine();

        }

        double aluturaMedia = 0;
        for (int i = 0; i < vetor.length; i++) {
            aluturaMedia += vetor[i].getAltura();



        }
        aluturaMedia = aluturaMedia/ vetor.length;
        System.out.println("altura media= "+ aluturaMedia);
        double porcentagem = 0;
        int pessoasMaisDeDezezzeisAnos = 0;
        String pessoas = "";



        for (int i = 0; i < vetor.length ; i++) {
            if(vetor[i].getIdade()<16){
                porcentagem += 1;
                pessoasMaisDeDezezzeisAnos += 1;
                pessoas += vetor[i].getNome() + "\n";




            }


        }
        porcentagem = (porcentagem / vetor.length) * 100;
        System.out.println("Pessoas com  menos de 16 anos: " + porcentagem+ "%");
        System.out.println(pessoas);
    }


}
