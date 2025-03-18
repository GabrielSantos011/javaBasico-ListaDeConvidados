package br.com.listaDeConvidados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaDeConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> convidados = new HashSet<>(); // Criando o HashSet

        while (true) {
            System.out.println("""
                                --- Menu ---");
                                1. Adicionar convidado
                                2. Remover convidado
                                3. Verificar convidado
                                4. Listar convidados
                                5. Sair
                                Escolha uma opção: """);

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do convidado: ");
                    String nome = scanner.nextLine();
                    if (convidados.add(nome)) { // HashSet não permite duplicatas
                        System.out.println("Convidado adicionado!");
                    } else {
                        System.out.println("Convidado já está na lista!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do convidado a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (convidados.remove(nomeRemover)) {
                        System.out.println("Convidado removido!");
                    } else {
                        System.out.println("Convidado não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do convidado para verificar: ");
                    String nomeBuscar = scanner.nextLine();
                    if (convidados.contains(nomeBuscar)) {
                        System.out.println("O convidado está na lista!");
                    } else {
                        System.out.println("Convidado não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\nLista de convidados:");
                    for (String convidado : convidados) {
                        System.out.println(convidado);
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
