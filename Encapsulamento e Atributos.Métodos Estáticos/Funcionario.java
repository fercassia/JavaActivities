package AtividadeJava;

public class Funcionario {
    private int matricula;//fun
    private String nome;
    private Departamento depto;

    public Funcionario(int matriculaEntrada, String nomeEntrada, Departamento departamento)
    {
        setMatricula(matriculaEntrada);
        setNome(nomeEntrada);
        setDepto(departamento);
    }
    private void setMatricula(int matriculaFuncionario)
    {
        if(matriculaFuncionario <= 0)
        {
            System.out.println("A matricula do funcionario deve ser maior que 0!");
            return;
        }
        matricula = matriculaFuncionario;
    }
    private void setNome(String nomeFuncionario)
    {
        if(nomeFuncionario == null ||nomeFuncionario.isEmpty() || nomeFuncionario.isBlank())
        {
            System.out.println("É necessário colocar o nome do Funcionario");
            return;
        }
        nome = nomeFuncionario;
    }
    private void setDepto(Departamento departamento)
    {
        depto = departamento;
    }
    private int getMatricula()
    {
        return matricula;
    }
    private String getNome()
    {
        return nome;
    }
    private Departamento getDepto()
    {
        return depto;
    }
    public String toString()
    {
        return "\nSOBRE FUNCIONARIO: \n\nMatricula Funionario: "+getMatricula()+"\nNome Funcionario: "+getNome()+
                "\n\nDepartamento do funcionario >> "+getDepto();
    }
}
