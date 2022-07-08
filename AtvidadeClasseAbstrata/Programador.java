package AtvidadeClasseAbstrata;

public class Programador extends Funcionario
{
    @Override
    public void aumentaSalario()
    {
        setSalario(Math.round(getSalario()*1.20));
    }
}
