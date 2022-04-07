package task3;

public class TestConvert {
    public static void main(String[] args){
        Celcius Celcius = new Celcius(100);
        System.out.println("из целсий в фаренгейты");
        System.out.println(Celcius.convertToFahrenheit());

        Kelvin Kelvin = new Kelvin(150);
        System.out.println("\n из кельвин в целсии");
        System.out.println(Kelvin.convertToCelcius());

        Fahrenheit Fahrenheit = new Fahrenheit(200);
        System.out.println("\n из фаренгейт в кельвин");
        System.out.println(Fahrenheit.convertToKelvin());
    }
}
