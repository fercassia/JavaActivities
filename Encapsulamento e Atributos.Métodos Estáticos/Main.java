package AtividadeJava;

import javax.lang.model.type.ErrorType;
import java.lang.annotation.ElementType;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Olá Usuário! Digite as informações do novo funcionário abaixo: ");

        System.out.println("Matricula Funcionario: ");
        String inputMatriculaFuncionario = inputUser.nextLine();

        System.out.println("Nome Funcionario: ");
        String inputNomeFuncionario= inputUser.nextLine();

        System.out.println("Nome Departamento: ");
        String inputNomeDepartamento= inputUser.nextLine();

        System.out.println("Codigo Departamento: ");
        String inputCodigoDepartamento= inputUser.nextLine();

        int matricula = Integer.parseInt(inputMatriculaFuncionario);
        int codDep = Integer.parseInt(inputCodigoDepartamento);

        Departamento departamentFuncionario = new Departamento(codDep, inputNomeDepartamento);

        Funcionario novoFuncionario = new Funcionario(matricula, inputNomeFuncionario,departamentFuncionario);

        System.out.println(novoFuncionario);

    }
}
