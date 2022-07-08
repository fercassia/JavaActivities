package AtvidadeClasseAbstrata;

import java.text.Normalizer;
import java.util.ArrayList;

public class ClassePrincipal
{
    public static void main(String[] args)
    {
        System.out.println("####-EXERCICIO 1-####\n");
        Funcionario funcionarioProgramador = new Programador();
        Funcionario funcionarioGerente = new Gerente();

        funcionarioProgramador.setNome("Fernanda");
        funcionarioProgramador.setSalario(4000.00);

        funcionarioGerente.setNome("Geraldo");
        funcionarioGerente.setSalario(3000.00);

        funcionarioProgramador.aumentaSalario();
        funcionarioGerente.aumentaSalario();

        funcionarioProgramador.imprimeDados();
        funcionarioGerente.imprimeDados();

        System.out.println("####-EXERCICIO 2-####\n");
        Circulo circulo = new Circulo();
        circulo.setRaio(5.0);
        circulo.area();
        circulo.comprimento();

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(7.0);
        quadrado.area();
        quadrado.comprimento();

        System.out.println("\n####-EXERCICIO 3-####");

        Soma soma = new Soma();
        soma.calcula(new double[]{1, 2, 4});

        Subtracao subtracao = new Subtracao();
        subtracao.calcula(new double[]{2,6});

        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcula(new double[]{2,8});

        Divisao divisao = new Divisao();
        divisao.calcula(new double[]{28,2,2});
    }
}
