package com.company;

import java.util.Scanner;

public class EscolhaFormaGeometrica
{
    private static boolean _exit = false;
    private static int _toExit = 1;

    private static void Select(int numActivity)
    {
        switch (numActivity)
        {
            case 1:
                Quadrado AplicacaoQuadrado = new Quadrado(20);
                System.out.println("Área quadrado: "+AplicacaoQuadrado.Area());
                System.out.println("Comprimento quadrado: "+AplicacaoQuadrado.Comprimento());
                System.out.println("Lado quadrado: "+AplicacaoQuadrado.Lado);
                AplicacaoQuadrado.ImagemQadrado();
                break;
            case 2:
                TrianguloRetangulo AplicacaoTriagulo = new TrianguloRetangulo();

                System.out.println("Área Triangulo Retangulo: "+AplicacaoTriagulo.Area());
                System.out.println("Comprimento Triangulo Retangulo: "+AplicacaoTriagulo.Comprimento());

                System.out.println("Altura triagulo retangulo: "+AplicacaoTriagulo.Altura+
                "\nBase triagulo: "+AplicacaoTriagulo.Base+"\nHipotenusa triangulo retangulo: "+AplicacaoTriagulo.Hipotenusa);
                break;
            default:
                System.out.println("Comando inexistente!");
        }
    }
    public static void UserInputToSelect()
    {
        Scanner scannerUser = new Scanner(System.in);
        while(_exit == false)
        {
            if (_toExit != 0)
            {
                System.out.println("Olá! O número da forma geométrica: \n 1- Quadrado; \n 2- TrianguloRetangulo; \nDigite aqui sua opção: ");
                int numUserInput = scannerUser.nextInt();
                Select(numUserInput);

                System.out.println("\nPara sair aperte 0 e para continuar qualquer número: ");
                _toExit = scannerUser.nextInt();
            }
            else
            {
                System.out.println("\nSaindo das atividades ");
                _exit = true;
            }
        }
    }
}
