package com.company;

public class Quadrado implements FormaGeometrica
{
    public double Lado;

    public Quadrado()
    {
        Lado = 10;
    }
    public Quadrado(double lado)
    {
        Lado = lado;
    }

    @Override
    public double Area()
    {
        return Lado * Lado;
    }
    @Override
    public double Comprimento() { return Lado * 4; }

    public void ImagemQadrado()
    {
        for(int linha = 0; linha <Lado; linha++)
        {
            for (int coluna = 0; coluna < Lado; coluna++)
            {
                if ( linha == 0 || coluna == 0 || linha == Lado-1 || coluna == Lado-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
