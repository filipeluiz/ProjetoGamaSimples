public class Cliente {
  private String ag;
  private String conta;
  private String nome;
  private String Telefone;
  private double saldo;

  public Cliente() {}

  public Cliente(String ag, String conta, String nome) {
    this.ag = ag;
    this.conta = conta;
    this.nome = nome;
  }

  public String getAg() {
    return ag;
  }

  public void setAg(String ag) {
    this.ag = ag;
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return Telefone;
  }

  public void setTelefone(String telefone) {
    Telefone = telefone;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Cliente [Telefone=" + Telefone + ", ag=" + ag + ", conta=" + conta + ", nome=" + nome + ", saldo=" + saldo
        + "]";
  }

  
}
