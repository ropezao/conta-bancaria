
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     
        System.out.println("Por favor, digite seu nome ");
        String nome = scanner.next();
   
        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();
   
        System.out.println("Digite seu numero de conta");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();
   
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
           
        System.out.println("Ola, " + nome + " "+ sobrenome +" obrigado por criar uma conta em nosso banco, sua agencia é  " + agencia + " conta " + numero + " e seu saldo " + saldo + " já esta dispoível para saque . ");
        

      //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
     
    }
}
