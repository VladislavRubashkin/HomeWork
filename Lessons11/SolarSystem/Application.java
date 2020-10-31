package homeWork.Lessons11.SolarSystem;

public class Application {
    /*
    написать enum, который перечисляет планеты Солнечной системы и
    возвращает массу планеты, ее радиус и радиус орбиты.
     */
    public static void main(String[] args) {
        SolarSystem[] solarSystems = SolarSystem.values();
        for (SolarSystem solarSystem : solarSystems) {
            System.out.println("Название " + solarSystem.name() +" "
                           + "Масса " + solarSystem.getWeight() + " "
                           + "Радиус " + solarSystem.getRadius() + " "
                           + "Орбита " + solarSystem.getOrbitalRadius());

        }

    }



}


enum SolarSystem{
    MERCURY(15,12,23),
    VENUS(11,11,11),
    EARTH(22,22,22),
    MARS(33,33,33),
    JUPITER(44,44,44),
    SATURN(55,55,55),
    URANIUM(66,66,66),
    NEPTUNE(77,77,77);

    private int weight;
    private int radius;
    private int orbitalRadius;

    SolarSystem(int weight, int radius, int orbitalRadius) {
        this.weight = weight;
        this.radius = radius;
        this.orbitalRadius = orbitalRadius;
    }

    public int getWeight() {
        return weight;
    }

    public int getRadius() {
        return radius;
    }

    public int getOrbitalRadius() {
        return orbitalRadius;
    }
}
