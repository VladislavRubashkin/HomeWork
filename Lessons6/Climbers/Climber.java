package homeWork.Lessons6.Climbers;

public class Climber {

    private String name;
    private String address;

    public Climber(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Имя альпиниста должно содержать не менее трех символов");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(String address) {
        if (address == null || address.length() < 5) {
            throw new IllegalArgumentException("Адрес должен содержать не менее пяти символов");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}