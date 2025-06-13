public class Usuario {
    
  String nome ;
  String cpf;
  Float salario;
  int cep;
  String cargo;

  public Usuario(){}

  public Usuario (String nome, String cpf, Float salario,int cep,String cargo){
   this.nome = nome;
   this.cpf = cpf;
   this.salario = salario;
   this.cep = cep;
   this.cargo = cargo;
  }

  public String getNome() {
      return nome;
  }
  public String getCargo() {
      return cargo;
  }
  public int getCep() {
      return cep;
  }
  public String getCpf() {
      return cpf;
  }
  public Float getSalario() {
      return salario;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public void setSalario(Float salario) {
      this.salario = salario;
  }
  public void setCargo(String cargo) {
      this.cargo = cargo;
  }
  public void setCep(int cep) {
      this.cep = cep;
  }
  public void setCpf(String cpf) {
      this.cpf = cpf;
  }
}
