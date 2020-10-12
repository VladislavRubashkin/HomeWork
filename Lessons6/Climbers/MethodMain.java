package homeWork.Lessons6.Climbers;

/*
Описать объектную модель Альпинист, Гора, Группа для восхождения на гору.
Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
Группа для восхождения на гору создаётся со следующими характеристиками:
идёт набор в группу или нет;
массив альпинистов;
гора;
должна быть возможность добавить альпиниста в группу, если набор ещё идёт
В методе main (отдельного класса) создать:
3 группы для восхождений на 3 различных горы.
В первой группе 3 альпиниста (набор закрыт)
Во второй и третьей группах по 2 альпиниста (набор в эти группы закрыт)
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */

public class MethodMain {
    public static void main(String[] args) {

        Climber sergey = new Climber("Сергей","Санкт-Петербург");
        Climber aleksandr = new Climber("Александр","Москва");
        Climber anatoliy = new Climber("Анатолий","Новосибирск");
        Climber yliya = new Climber("Юлия","Екатеринбург");
        Climber anton = new Climber("Антон","Краснодар");
        Climber vitaliy = new Climber("Виталий","Новгород");


        Mountain everest = new Mountain("Эверест","Непал", 8848);
        Mountain elbrus = new Mountain("Эльбрус","Россия", 5642);
        Mountain fudziyama = new Mountain("Фудзияма","Япония", 3776);

        GroupForClimbing group1 = new GroupForClimbing(3, everest);
        group1.addClimber(sergey);
        group1.addClimber(aleksandr);
        group1.addClimber(anatoliy);
//        System.out.println(group1);
        System.out.println(group1.climbersList());

        GroupForClimbing group2 = new GroupForClimbing(2, elbrus);
        group2.addClimber(yliya);
        group2.addClimber(sergey);
//        System.out.println(group2);
        System.out.println(group2.climbersList());

        GroupForClimbing group3 = new GroupForClimbing(2, fudziyama);
        group3.addClimber(anton);
        group3.addClimber(vitaliy);
//        System.out.println(group3);
        System.out.println(group3.climbersList());
    }
}
