package AtividadeJava;

public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int condigoEntrada, String nomeEntrada)
    {
        setCodigo(condigoEntrada);
        setNome(nomeEntrada);
    }
    private void setCodigo(int codigoDepartamento)
    {
        if(codigoDepartamento <= 0)
        {
            System.out.println("O codigo do departamento deve ser maior que 0!");
            return;
        }
        codigo = codigoDepartamento;
    }
    private void setNome(String nomeDepartamento)
    {
        if(nomeDepartamento == null ||nomeDepartamento.isEmpty() || nomeDepartamento.isBlank())
        {
            System.out.println("É necessário colocar o nome do Departamento");
            return;
        }
        nome = nomeDepartamento;
    }
    private int getCodigo()
    {
        return codigo;
    }
    private String getNome()
    {
        return nome;
    }
    public String toString()
    {
        return "Codigo departamento: "+getCodigo()+"\nNome Departamento: "+getNome();
    }
}
