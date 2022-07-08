package AtvidadeClasseAbstrata;

public abstract class Funcionario
{
    private String nome;
    private double salario;

    public void setNome(String entradaNomeFuncionario)
    {
        if(entradaNomeFuncionario == null ||entradaNomeFuncionario.isEmpty() || entradaNomeFuncionario.isBlank())
        {
            System.out.println("É necessário colocar o nome do funcionario");
            return;
        }
        nome = entradaNomeFuncionario;
    }
    public String getNome()
    {
        return nome;
    }
    public void setSalario(double entradaSalarioFuncionario)
    {
        if(entradaSalarioFuncionario < 1200.00)
        {
            System.out.println("O funcionario deve receber mais ou igual a 1200");
            return;
        }
        salario = entradaSalarioFuncionario;
    }
    public double getSalario()
    {
        return salario;
    }
    public void imprimeDados()
    {
        System.out.println("IMPRESSÃO FUNCIONARIO: \n" +
                "Nome Funcionario: "+getNome()+"\n" +
                "Salario Funcionario: "+getSalario()+"\n");
    }
    public abstract void aumentaSalario();
}
