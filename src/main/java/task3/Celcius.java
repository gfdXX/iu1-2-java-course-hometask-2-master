package task3;

public class Celcius implements Convert {
    private double temperature;

    public Celcius(double temperature){
        this.temperature = temperature;
    }

    @Override
    public double convertToKelvin() {
        return temperature + 273.15;
    }

    @Override
    public double convertToCelcius() {
        return temperature;
    }

    @Override
    public double convertToFahrenheit() {
        return (temperature * 1.8) + 32;
    }
}

