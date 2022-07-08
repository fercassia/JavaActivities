package com.company;

public class TrianguloRetangulo implements FormaGeometrica
{
    public double Altura, Base, Hipotenusa;

    public TrianguloRetangulo()
    {
        Altura = 5;
        Base = 10;
        Hipotenusa = Math.sqrt((Altura*Altura)+(Base*Base));
    }
    public TrianguloRetangulo(double altura, double base, double hipotenusa)
    {
        Altura = altura;
        Base = base;
        Hipotenusa = hipotenusa;
    }
    @Override
    public double Area() { return (Base * Altura)/2; }

    @Override
    public double Comprimento() { return Altura + Base + Hipotenusa; }
}
