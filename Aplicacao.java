import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    Cadastro cadastros = new Cadastro();
    Cliente cliente;
    String agencia, conta, nome, telefone;
    int opcao; 
    double saldo;

    do {
      System.out.println("Escolhe uma opção:");
      System.out.println("1 - Cadastrar Clientes");
      System.out.println("2 - Listar Clientes");
      System.out.println("3 - Gravar em arquivo texto");
      System.out.println("4 - Consultar arquivo texto");
      System.out.println("5 - Sair");

      opcao = input.nextInt();

      switch(opcao) {
        case 1:
          System.out.println("Entre com a Agência:");
          agencia = input.next();
          System.out.println("Entre com a Conta:");
          conta = input.next();
          System.out.println("Informe o seu nome:");
          nome = input.next();
          System.out.println("Informe numero de telefone:");
          telefone = input.next();
          System.out.println("Informe o seu saldo inicial");
          saldo = input.nextDouble();

          cliente = new Cliente(agencia, conta, nome);
          cliente.setTelefone(telefone);
          cliente.setSaldo(saldo);

          cadastros.cadastrar(cliente);
          break;
        case 2:
          cadastros.listar();
          break;
        case 3:
          cadastros.gravar();
          break;
        case 4:
          cadastros.consultar();
          break;
        case 5:
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while(opcao != 5);

    input.close();
  }
}
