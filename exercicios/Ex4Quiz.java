import java.util.Scanner;

public class Ex4Quiz {
    public static void main(String[] args) {
        int chancesDisponiveis = 3;
        char escolhaUsuario;

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Na lógica de programação, como se chama o recurso utilizado para repetir um bloco de código várias vezes até que uma condição seja atendida?\n");

        System.out.println("""
                    a) Variável
                    b) Condicional
                    c) Função
                    d) Laço de Repetição (Loop)
                    e) Atribuição
                """);

        do {
            System.out.println("Resposta: ");
            escolhaUsuario = sc.next().charAt(0);

            switch (escolhaUsuario) {
                case 'a':
                    chancesDisponiveis -= 1;
                    System.out.println("Resposta errada, você tem " + chancesDisponiveis + " chances");
                    break;

                case 'b':
                    chancesDisponiveis -= 1;
                    System.out.println("Resposta errada, você tem " + chancesDisponiveis + " chances");
                    break;

                case 'c':
                    System.out.println("Resposta correta! Parabéns!");
                    break;

                case 'd':
                    chancesDisponiveis -= 1;
                    System.out.println("Resposta errada, você tem " + chancesDisponiveis + " chances");
                    break;

                case 'e':
                    chancesDisponiveis -= 1;
                    System.out.println("Resposta errada, você tem " + chancesDisponiveis + " chances");
                    break;

                default:
                    System.out.println("Digite apenas opções entre 'a' e 'e'.");
                    break;
            }

            if (chancesDisponiveis < 1) {
                System.out.println("Suas chances acabaram! FIM DO QUIZ.");
                break;
            }

            if (escolhaUsuario == 'c') {
                break;
            }
            
        } while (chancesDisponiveis >= 0);

        sc.close();
    }
}