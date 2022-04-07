package task3;

public class Kelvin implements Convert{
    private double temperature;

    public Kelvin(double temperature){
        this.temperature = temperature;
    }

    @Override
    public double convertToKelvin() {
        return temperature;
    }

    @Override
    public double convertToCelcius() {
        return temperature - 273.15;
    }

    @Override
    public double convertToFahrenheit() {
        return (temperature * 1.8) - 459.67;
    }
}
