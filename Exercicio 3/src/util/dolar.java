package util;

public class dolar {

    public static final double IOF = 0.06;

    public static double converteEmDolar(double dolar, double qtd){
        return dolar * qtd;
    }

    public static double calculaIOF(double dolar){
        return dolar * IOF + dolar;
    }

}
