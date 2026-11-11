import pokemon.EstruturaArray;
import pokemon.Pokemon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstruturaArray pokedex = new EstruturaArray();
        while (true) {
            System.out.println("-----Pokedex-----");
            System.out.println("1. Adicionar Pokemon");
            System.out.println("2. Listar Pokemon");
            System.out.println("3. Atualizar Pokemon");
            System.out.println("4. Deletar Pokemon");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            }
            switch (opcao) {
                case 1:
                    pokedex.adicionarPokemon();
                    break;
                case 2:
                    pokedex.listarPokemon();
                    break;
                case 3:
                    pokedex.atualizarPokemon();
                    break;
                case 4:
                    pokedex.deletarPokemon();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
