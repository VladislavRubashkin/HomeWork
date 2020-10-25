package homeWork.testWork1;

import java.time.LocalDateTime;

public class MethodMain {


    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();

        HumanInformation humanInformation = new HumanInformation();
        SeasonTicket seasonTicket = new SeasonTicket(humanInformation,SeasonTicketType.FULLTIME,
                     LocalDateTime.now(), LocalDateTime.of(2020,5,12,00,00));

        fitnessClub.addFitness(seasonTicket, ZoneType.GYM );

        Logger.getClientInfo(seasonTicket);
        Logger.getFitnessInfo(fitnessClub);


        fitnessClub.isClosed();









        //    public void check(ZoneType[] zoneType, LocalDateTime currentDate, LocalDateTime endingDate)
//    {
//        LocalDate today = LocalDate.now();
//
//        if (zoneType == null || (today.isBefore(ChronoLocalDate.from(currentDate))&&
//                !today.isEqual(ChronoLocalDate.from(currentDate))) ||
//                (today.isAfter(ChronoLocalDate.from(endingDate))&&
//                        !today.isEqual(ChronoLocalDate.from(currentDate)))){
//            System.out.println("Абонемент не действителен");
//        }
//        LocalTime currentTime = LocalTime.now();
//
//        LocalTime startTime = LocalTime.of(8, 0);   //08:00
//        LocalTime middleTime = LocalTime.of(16, 0); //16:00
//        LocalTime endTime = LocalTime.of(22, 00);   //22:00
//
//        if(currentTime.isBefore(startTime) || currentTime.isAfter(endTime) ||
//                (ZoneType == ZoneType.POOL && currentTime.isAfter(middleTime)))
//        {
//            System.out.println("В текущее время по Вашему абонементу проход запрещен");
//        }
//
//        if (ZoneType.GYM.equals(ZoneType.POOL) || ZoneType.GYM.equals(ZoneType.GROUPClass)){
//            System.out.println("Вы можете заниматься только в одной зоне.");
//        }
//
//    }
//
//    public void InZone(SeasonTicket ticket){
//
//        if (ticket.equals(SINGLE)) {
//            ticket = null;
//
//            switch (zoneType) {
//                case ZoneType.GYM:
//                    System.out.print("бассейн\n");
//                    break;
//                case ZoneType.POOL:
//                    System.out.print("тренажерный зал\n");
//                    break;
//                case ZoneType.GROUPClass:
//                    System.out.print("групповое занятие\n");
//                    break;
//            }
//        }
//        //Информация о новом посетителе
//        System.out.print("Посетитель: "+ humanInformation.getName()  + " " + humanInformation.getSurname() + "\nЗона: ");
//        System.out.println("Дата и время: " + LocalDateTime.now() + "\n" + "Добавлен.");
//
//    }

        //    ZoneType[] gymZone = new ZoneType[ZONELimit];
//    ZoneType[] poolZone = new ZoneType[ZONELimit];
//    ZoneType[] groupClassZone = new ZoneType[ZONELimit];

        //    final static int ZONELimit = 20;
//    final static int TICKETLimit = 20;





    }
}
