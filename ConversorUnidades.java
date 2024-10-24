public class ConversorUnidades {
    
    //Construtor utilizando o método celsius para fahrenheit
    //Utilização do celsius * 9/5
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //Construtor utilizando o método quilometros para milhas 
    //Retornando 1km em 0.62
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.62;
    }

    //Construtor utilizando o método gramas para libras 
    //Retornando 1g em 0.022 libras
    public static double gramasParaLibras(double gramas) {
      return gramas * 0.002;
    }
}
