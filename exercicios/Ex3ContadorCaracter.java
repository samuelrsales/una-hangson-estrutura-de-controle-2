import java.util.Scanner;

public class Ex3ContadorCaracter {
    public static void main(String[] args) {
        int contadorLetras = 0;
        int contadorEspacos = 0;
        int contadorNumeros = 0;
        int contadorOutros = 0;
        String texto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            
            if (Character.isLetter(letra)) {
                contadorLetras += 1;
            } else if (Character.isDigit(letra)) {
                contadorNumeros += 1;
            } else if (Character.isWhitespace(letra)) {
                contadorEspacos += 1;
            } else {
                contadorOutros += 1;
            }
        }
        
        System.out.println("Quantidade Total");
        System.out.println("Letras: " + contadorLetras);
        System.out.println("Números: " + contadorNumeros);
        System.out.println("Espaços: " + contadorEspacos);
        System.out.println("Outros: " + contadorOutros);

        sc.close();
}}
