package homeWork.lessons11.pos;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    /*
  Дано
   enum должностей Position,
   класс User со следующими полями: String fulName; int salary; Position position;
   несколько массивов, в каждом массиве будут храниться объекты класса User с одинаковыми должностями

   Пользователь вводит свои имя, фамилию и первую букву должности.
   Ваша задача создать объект типа User и поместить его в соответствующий массив.
     */
    public static void main(String[] args) {
        User[] doctors = new User[3];
        User[] policeOfficers = new User[3];
        User[] fireman = new User[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод данных");
        String input = scanner.nextLine();
        
        String[] mas = input.split(" ");
        String fullName = mas[0] + " " + mas[1];
        String position = mas[2];

        User doctor = new User(fullName, position);
        User doctor2 = new User(fullName,position);
        doctors[0] = doctor;
        doctors[1] = doctor2;
        System.out.println(doctor.getFullName() + " " + doctor.getSalary() + " " + doctor.getPosition());
        System.out.println(Arrays.toString(doctors));

        String input2 = scanner.nextLine();

        User policeman = new User(fullName,position);
        policeOfficers[0] = policeman;
        System.out.println(policeman.getFullName() + " " + policeman.getSalary() + " " + policeman.getPosition());
        System.out.println(Arrays.toString(policeOfficers));

        String input3 = scanner.nextLine();

        User firemans = new User(fullName,position);
        fireman[0] = firemans;
        System.out.println(firemans.getFullName() + " " + firemans.getSalary() + " " + firemans.getPosition());
        System.out.println(Arrays.toString(fireman));




    }

}
