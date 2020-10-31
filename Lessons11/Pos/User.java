package homeWork.Lessons11.Pos;

public class User {

    private String fullName;
    private int salary;
    Position position;

    public User(String fulName, String p) {
        if (fulName == null){
            throw new IllegalArgumentException("Имя должно быть!");
        }
        this.fullName = fulName;
        setPosition(p);
        setSalary();
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }
    public void setPosition(String pos) {
        switch (pos) {
            case "D":
                this.position = Position.DOCTOR;
                break;
            case "P":
                this.position = Position.POLICEMAN;
                break;
            case "F":
                this.position = Position.FIREMAN;
        }
        return;
    }

    public void setSalary() {
        salary = (int) (Math.random() * 160000);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "Полное имя: '" + fullName + '\'' +
                ", Зарплата: " + salary +
                ", Должность: " + position +
                '}';
    }
}


enum Position{
    DOCTOR,POLICEMAN,FIREMAN

}
