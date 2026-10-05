public class Gerente extends Funcionario {

    private int senha;
    private String departamento;

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void gerenciar() {
        System.out.println("O gerente " + getNome() + " está gerenciando o departamento " + this.departamento + ".");
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }
}