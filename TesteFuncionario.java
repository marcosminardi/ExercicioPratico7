public class TesteFuncionario {
    public static void main(String[] args) {

        FuncionarioRegular r1 = new FuncionarioRegular("Fred", 32.0, 160);
        FuncionarioRegular r2 = new FuncionarioRegular("Carla", 32.0, 160);
      
        FuncionarioTerceirizado t1 = new FuncionarioTerceirizado("Victor", 15.0, 120, 400.0);
        FuncionarioTerceirizado t2 = new FuncionarioTerceirizado("Gustavo", 20.0, 160, 600.0);

        System.out.println("\nInformações dos funcionários regulares:");
        System.out.println("Nome: " + regular1.getNome() + ", Salário Mensal: " + regular1.calcularSalarioMensal());
        System.out.println("Nome: " + regular2.getNome() + ", Salário Mensal: " + regular2.calcularSalarioMensal());

        System.out.println("\nInformações dos funcionários terceirizados:");
        System.out.println("Nome: " + terceirizado1.getNome() + ", Salário Mensal: " + terceirizado1.calcularSalarioMensal());
        System.out.println("Nome: " + terceirizado2.getNome() + ", Salário Mensal: " + terceirizado2.calcularSalarioMensal());
    }
}
