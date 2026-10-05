public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario oreiaRessecada = new Funcionario();
        oreiaRessecada.setCpf("156.789.345-67");
        oreiaRessecada.setNome("Alex");
        oreiaRessecada.setSalario(3778.98);
        oreiaRessecada.setTipo(2);

        System.out.println("O nome é: " + oreiaRessecada.getNome());
        System.out.println("O CPF é: " + oreiaRessecada.getCpf());
        System.out.println("O salário é: " + oreiaRessecada.getSalario());
        System.out.println("A bonificação é: " + oreiaRessecada.getBonificacao());

        oreiaRessecada.aumentarSalario(10);
        System.out.println("O salário reajustado é: " + oreiaRessecada.getSalario());

        Gerente marcao = new Gerente();
        marcao.setCpf("678.546.234-87");
        marcao.setNome("Marco Tonhao Batista");
        marcao.setSalario(6788);
        marcao.setTipo(1);
        marcao.setSenha(123456);
        marcao.setDepartamento("TI");

        System.out.println("O nome é: " + marcao.getNome());
        System.out.println("O CPF é: " + marcao.getCpf());
        System.out.println("O salário é: " + marcao.getSalario());
        System.out.println("A bonificação é: " + marcao.getBonificacao());
        System.out.println(marcao.autentica(123456));
        marcao.gerenciar();
    }
}