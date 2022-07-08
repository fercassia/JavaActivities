package AtvidadeClasseAbstrata;

public class Gerente extends Funcionario
{
    @Override
    public void aumentaSalario()
    {
        setSalario(Math.round(getSalario()*1.10));
    }
}
