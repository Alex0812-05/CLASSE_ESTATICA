public class Principal {

    public static void main(String[] args) {
        //Instanciando a classe Principal com temperatura em Celsius e Fahrenheit
        //Depois ocorre a modificação de um para o outro
        //Por fim imprimindo a enquivalencia deles com System.out.println
        double temperaturaCelsius = 28.0;
        double temperaturaFahrenheit = ConversorUnidades.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " graus Celsius são equivalentes a " + temperaturaFahrenheit + " graus Fahrenheit.");
        
        //Instancia da classe Principal com a distancia de km para milhas
        //Depois imprimindo a distancia com System.out.println
        double distanciaQuilometros = 15.0;
        double distanciaMilhas = ConversorUnidades.quilometrosParaMilhas(distanciaQuilometros);
        System.out.println(distanciaQuilometros + " quilômetros são equivalentes a " + distanciaMilhas + " milhas.");
        
        //Utiliza a variável massa em grama para massa em libras
        //Depois imprime a modificação
        double massaGramas = 750.0;
        double massaLibras = ConversorUnidades.gramasParaLibras(massaGramas);
        System.out.println(massaGramas + " gramas são equivalentes a " + massaLibras + " libras.");
    }
}
