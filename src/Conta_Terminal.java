import java.util.Locale;
import java.util.Scanner;

public class Conta_Terminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.CANADA); //cria um scanner que lê o teclado e define a norma do teclado pra inglês

        String nomecliente; //define uma variável do tipo "texto" como "nomeCliente"
        int numeroConta; //define uma variável do tipo número inteiro como "numeroConta"
        int agencia; //define uma variável do tipo número inteiro como "agencia"
        double saldo = 0; //define uma variável do tipo número real como "saldo"
    
        String escolha01; //define uma variável do tipo "texto" como "escolha01"

        

        System.out.println("\nDigite seu nome: "); // imprime na tela um texto
        nomecliente = scanner.next(); //a variável "nomeCliente" recebe valor dado pelo teclado
        System.out.println("digite o Número da Agência"); // imprime na tela um texto
        agencia = scanner.nextInt(); //a variável "agencia" recebe valor dado pelo teclado
        System.out.println("digite o Número da conta: "); // imprime na tela um texto
        numeroConta = scanner.nextInt(); //a variável "numeroConta" recebe valor dado pelo teclado

        String numeroFormatado = String.format("%08d-%d", numeroConta / 10, numeroConta % 10); // formata a variável "numeroConta" em inteiro, divide o valor por 10, pega o resto da divisão e aplica um '-' entre a divisão e o resto da divisão

        System.out.println("\nNome: " + nomecliente); //pula uma linha e imprime na tela um texto e concatena com a variável "nomeCliente"
        System.out.println("Ag " + agencia); //imprime na tela um texto e concatena com a variável "agencia"
        System.out.println(numeroFormatado); // imprime na tela a variável "numeroFormatado"
        System.out.println(saldo); // imprime na tela a variável "saldo"

        System.out.println("deseja depositar dinheiro na conta?");
        escolha01 = scanner.next(); //a variável "escolha01" recebe valor dado pelo teclado

        if (escolha01.equals("sim")|| escolha01.equals("Sim") || escolha01.equals("S") || escolha01.equals("s")) { //cria um "se" que recebe diversos valores como forma de acionar o código
            System.out.println("Quanto gostaria de depositar? "); // imprime um texto na tela caso algum valor tenha sido verdadeiro
            saldo = scanner.nextDouble();  //a variável "saldo" recebe valor dado pelo teclado
            System.out.println(saldo);// imprime na tela a variável "saldo"

        } else if (escolha01.equals("nao") || escolha01.equals("Nao") || escolha01.equals("não") || escolha01.equals("Não")|| escolha01.equals("n") || escolha01.equals("N"))  {//cria um "e se" que recebe diversos valores como forma de acionar o código

            System.out.println(saldo); // imprime na tela a variável "saldo"
        } else {// caso nenhum valor dentro dos parâmetros tenha sido definido, retorna o texto abaixo
            System.out.println("escrita erronêa, escreva: Sim, sim, s, S, Não, não, nao, Nao, n ou N"); 
        }
    }
}
