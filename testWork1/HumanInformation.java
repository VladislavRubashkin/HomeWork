package homeWork.testWork1;

import java.time.LocalDate;
import java.util.Objects;

public class HumanInformation {

    private String name;
    private String surname;
    private  int age = ((int)Math.random()* 50 + 10);
    private static String[] names = {"Петя","Саша","Маша","Оля","Юра","Слава","Иван","Юля","Алёна"};
    private static String[] surNames = {"Иванов","Петров","Сидоров","Крюков","Селезнев","Сергеев",
            "Лобов","Молодцов","Карпов"};

    public  HumanInformation(){
        getName();
        getSurname();
        getAge();
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
        this.name = (names[(int) (Math.random() * names.length)]);
    }

    public void setSurname(String surname) {
        if (Objects.isNull(surname) || surname.length() < 2){
            throw new IllegalArgumentException("Фамилия должна быть более 2 символов");
        }
        this.surname = (surNames[(int) (Math.random() * surNames.length)]);
    }

    public void setAge(int age) {
        if(age < 10){
            throw new IllegalArgumentException("Возраст должен быть более 10 лет");
        }
        this.age = ((int)Math.random()* 50 + 10);
    }

//    public HumanInformation(String[] names, String[] surNames, int age) {
//        getNames();
//        getSurNames();
//        getAge();
//    }
//
//    public static int getAge() {
//        return age;
//    }
//
//    public static void setAge(int age) {
//        HumanInformation.age = age;
//    }
//
//    public static String[] getNames() {
//        return names;
//    }
//
//    public static void setNames(String[] names) {
//        HumanInformation.names = names;
//    }
//
//    public static String[] getSurNames() {
//        return surNames;
//    }
//
//    public static void setSurNames(String[] surNames) {
//        HumanInformation.surNames = surNames;
//    }
//    public static HumanInformation addHumanInformation() {
//        HumanInformation humanInformation = new HumanInformation(HumanInformation.names,
//                HumanInformation.surNames, HumanInformation.age);
//        return humanInformation;
//    }

    @Override
    public String toString() {
        return "Данные" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
