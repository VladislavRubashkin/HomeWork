package homeWork.testWork1;

import java.time.LocalDate;
import java.util.Objects;

public class HumanInformation {

    private String name;
    private String surname;
    private  int age;


    public  HumanInformation(String name, String surname, int age){
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname ;
    }

    public int getAge() {
        return age ;
    }

    public void setName(String name) {
        if(Objects.isNull(name) || name.length() < 2){
            throw new IllegalArgumentException("Имя должно быть более 2 символов");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (Objects.isNull(surname) || surname.length() < 2){
            throw new IllegalArgumentException("Фамилия должна быть более 2 символов");
        }
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age < 10){
            throw new IllegalArgumentException("Возраст должен быть более 10 лет");
        }
        this.age = age;
    }


    public static HumanInformation addHumanInformation() {
          String[] names = {"Петя","Саша","Маша","Оля","Юра","Слава","Иван","Юля","Алёна"};
          String[] surNames = {"Иванов","Петров","Сидоров","Крюков","Селезнев","Сергеев",
                "Лобов","Молодцов","Карпов"};
        HumanInformation humanInformation = new HumanInformation(
                names[(int) (Math.random() * names.length)],
                surNames[(int) (Math.random() * surNames.length)],
                ((int)Math.random()* 35 + 15));
        return humanInformation;
    }

    @Override
    public String toString() {
        return "Имя: " + name + '\'' +
                ", Фамилия: " + surname + '\'' +
                ", Возраст: " + age +
                '}';
    }
}
