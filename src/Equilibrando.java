import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Equilibrando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;

        do{
          valor = scanner.nextDouble();
          
 
         if (valor > 0) {
             //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
             String valorFormatado = new DecimalFormat("0.00").format(valor);
             System.out.println("Deposito realizado com sucesso!\r\n" + 
                     "Saldo atual: R$ " + valorFormatado);
         } else if (valor == 0) {
             //TODO: Imprimir a mensagem de valor inválido.
             System.out.println("Encerrando o programa...");
         } else {
              //TODO: Imprimir a mensagem de encerrar o programa.
              System.out.println("Valor invalido! Digite um valor maior que zero.");
         }
        }while(valor < 0);
        scanner.close();
}
}
