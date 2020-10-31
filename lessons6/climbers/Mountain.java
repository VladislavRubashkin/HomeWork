package homeWork.lessons6.climbers;

public class Mountain {

    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public void setName(String name) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Название горы должно содержать не менее четырёх символов");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Название страны должно содержать не менее четырёх символов");
        } else {
            this.country = country;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("Высота горы должна быть не менее ста метров");
        } else {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}