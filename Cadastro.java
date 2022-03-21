import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cadastro {
  private ArrayList<Cliente> clientes;
  private File file;
  private FileWriter newFile;
  private PrintWriter saveFile;
  private String text;
  private String fileName;
  private String line;
  private FileReader reader;
  private BufferedReader leitor;

  public Cadastro() throws IOException {
    clientes = new ArrayList<>();
    fileName = "/home/filipe/Documentos/file.txt"; // Eu uso Debian(Linux)
    file = new File(fileName);
    text = "";
    line = "";
  }

  // Ação dos metodos aqui
  public void cadastrar(Cliente cliente) {
    clientes.add(cliente);
  }

  public void listar() {
		for(Cliente c:clientes) {		
			System.out.println("Ag: "+c.getAg()+" Conta: "+c.getConta()+" Cliente: "+c.getNome()+ " Telefone: "+c.getTelefone());
		}    
  }

  public void gravar() throws IOException {
    newFile = new FileWriter(fileName);
    saveFile = new PrintWriter(newFile);

    saveFile.println("Clientes do banco: ");

    System.out.println(clientes.size());

    for(int i = 0; i < clientes.size(); i++) {
      saveFile.println(clientes.get(i));
    }

    newFile.close();

    if(file.exists()) {
      System.out.println("Arquivo gerado na unidade "+fileName);
    }
    else {
      System.out.println("Erro: O arquivo não foi salvo.");
    }
  }

  public void consultar() {
    // Lendo as informações de dentro do nosso arquivo
    try {
      reader = new FileReader(fileName);
      leitor = new BufferedReader(reader);
      
      while(true) {
        line=leitor.readLine();
          System.out.println(line);
          if(line == null) {
            break;
          }
      }
    } catch (Exception erro) {
      System.out.println(text+" arquivo");
    }    
  }
}
