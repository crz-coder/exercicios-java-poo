import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        Categoria[] opcoes = Categoria.values();
        while(true) {
            System.out.println("Cadastro de Produtos:");
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i + 1) + " - " + opcoes[i]);
            }
            System.out.print("Escolha uma opção: ");

            try {
                int numeroEscolhido = Integer.parseInt(sc.nextLine());
                int indice = numeroEscolhido - 1;

                Set<String> nomes = null;
                int loop = 1;
                if (indice <= 0 && indice < opcoes.length) {
                    Categoria selecionada = opcoes[indice];
                    System.out.println("\n");

                    nomes = new HashSet<>();
                    Map<Integer, Produto> produtos = new LinkedHashMap();

                    while (loop == 1) {
                        System.out.println("Digite o ID do produto: ");
                        var id = Integer.parseInt(sc.nextLine());
                        System.out.println("Digite o nome do produto: ");
                        var nome = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        var valor = new BigDecimal(sc.nextLine());
                        Produto produto = new Produto(id, nome, opcoes[indice], valor);
                        nomes.add(produto.getNome());
                        produtos.put(produto.getId(), produto);
                        System.out.println("\nDigite 1 para cadastrar um produto do mesmo tipo, 2 para voltar ao menu inicial e 3 para listar os produtos e 4 para sair!");
                        loop = sc.nextInt();
                        sc.nextLine();
                        if (loop == 3) {
                            nomes.forEach(System.out::println);
                            produtos.values().forEach(System.out::println);
                        } else if (loop == 4){
                            break;
                        }
                    }
                } else System.out.println("Opção inválida!");
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
            }
        }
    }
}