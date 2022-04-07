package task3;

public class Fahrenheit implements Convert{
    private double temperature;

    public Fahrenheit(double temperature){
        this.temperature = temperature;
    }

    @Override
    public double convertToKelvin() {
        return (temperature + 459.67) / 1.8;
    }

    @Override
    public double convertToCelcius() {
        return (temperature - 32) / 1.8;
    }

    @Override
    public double convertToFahrenheit() {
        return temperature;
    }
}
