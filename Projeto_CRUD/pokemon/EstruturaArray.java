package pokemon;

import java.util.Scanner;

public class EstruturaArray {
    public Pokemon[] espaco = new Pokemon[100];

    public int contador = 0;

    Scanner sc = new Scanner(System.in);
    public void adicionarPokemon() {
        

        if (contador < espaco.length) {

            Pokemon p = new Pokemon();

            System.out.println("Digite o nome do Pokemon:");
            p.nome = sc.nextLine();

            System.out.println("Digite o nivel do Pokemon:");
            p.nivel = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o tipo do Pokemon:");
            p.tipo = sc.nextLine();

            System.out.println("Digite a altura do Pokemon:");
            p.altura = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o peso do Pokemon:");
            p.peso = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o ataque do Pokemon:");
            p.ataque = sc.nextLine();

            espaco[contador] = p;
            contador++;
            System.out.println("\nPokemon adicionado com sucesso!");

        } else {
            System.out.println("Espaço insuficiente para adicionar o Pokemon!");
        }
    }

    public void listarPokemon() {
        if(contador == 0) {
            System.out.println("Nenhum pokemon cadastrado!");
        }
        for (int i = 0; i < contador; i++) {
            System.out.println("--Pokemon [" + (i+1) + "]--");
            System.out.println("Nome : " + espaco[i].nome);
            System.out.println("Nível: " + espaco[i].nivel);
            System.out.println("Tipo : " + espaco[i].tipo);
            System.out.println("Altura: " + espaco[i].altura);
            System.out.println("Peso : " + espaco[i].peso);
            System.out.println("Ataque: \n" + espaco[i].ataque);
        }
    }
    
    public void atualizarPokemon() {
        if (contador == 0) {
            System.out.println("\nNão há Pokémon cadastrados para atualizar.");
            return;
        }
        listarPokemon();
        System.out.println("Digite o número do pokemon que deseja atualizar : ");
        int escolha = sc.nextInt();
        sc.nextLine();

        int indice = escolha - 1;

        if (indice >= 0 && indice < contador && espaco[indice] != null) {
            Pokemon p = espaco[indice];

            System.out.print("Novo nome (" + p.nome + "): ");
        p.nome = sc.nextLine();
        
        System.out.print("Novo nível (" + p.nivel + "): ");
        p.nivel = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Novo tipo (" + p.tipo + "): ");
        p.tipo = sc.nextLine();
        
        System.out.print("Nova altura (" + p.altura + "): ");
        p.altura = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Novo peso (" + p.peso + "): ");
        p.peso = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Novo ataque (" + p.ataque + "): ");
        p.ataque = sc.nextLine();

        System.out.println("Pokémon atualizado com sucesso!");
    } else {
        System.out.println("Pokémon não encontrado com esse número!");
    
        }
    }

    public void deletarPokemon() {
        if(contador == 0) {
            System.out.println("\nNão há Pokémon cadastrados para remover.");
            return;
        }
        listarPokemon(); 
        System.out.print("\nDigite o número (ID/Índice) do Pokémon que deseja deletar: ");
        int escolha = sc.nextInt();
        sc.nextLine(); 

        int indice = escolha - 1;

        if (indice >= 0 && indice < contador && espaco[indice] != null) {
        String nomeRemovido = espaco[indice].nome;

        
        for (int i = indice; i < contador - 1; i++) {
            espaco[i] = espaco[i + 1];
        }

        
        espaco[contador - 1] = null;
        
        
        contador--;

        System.out.println("Pokémon '" + nomeRemovido + "' foi liberado (deletado) com sucesso!");
        } else {
        System.out.println("Pokémon não encontrado com esse número!");
        }
    }
}
