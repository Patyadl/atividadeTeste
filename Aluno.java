public class Aluno extends Usuario {

  String matricula;
  String curso;

  public Aluno() {
    
 super();
}

  public Aluno(String nome, String cpf, Float salario, int cep, String cargo, 
  String matricula,
   String curso) {

    super(nome, cpf, salario, cep, cargo);
  
    this.matricula = matricula;
    this.curso = curso;
  }

  @Override 
  //anotação que indica que um método está sendo sobrescrito
  // de um método herdado de uma superclasse ou interface
  public String getNome() {
      return super.getNome();
  }

  @Override
  public String getCargo() {
      return super.getCargo();
  }
  @Override
  public int getCep() {
      return super.getCep();
  }
  @Override
  public String getCpf() {
      return super.getCpf();
  }
  @Override
  public Float getSalario() {
      return super.getSalario();
  }
  public String getCurso() {
      return curso;
  }
  public String getMatricula() {
      return matricula;
  }
  @Override
  public void setCargo(String cargo) {
      super.setCargo(cargo);
  }
  @Override
  public void setCep(int cep) {
      super.setCep(cep);
  }
  @Override
  public void setCpf(String cpf) {
      super.setCpf(cpf);
  }
  @Override
  public void setNome(String nome) {
      super.setNome(nome);
  }
  @Override
  public void setSalario(Float salario) {
      super.setSalario(salario);
  }
  public void setCurso(String curso) {
      this.curso = curso;
  }
  public void setMatricula(String matricula) {
      this.matricula = matricula;
  }
}
