package homeWork.testWork1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Arrays;
import java.util.Random;


public class FitnessClub {

    private SeasonTicket[] gym = new SeasonTicket[20];
    private SeasonTicket[] pool = new SeasonTicket[20];
    private SeasonTicket[] groupClass = new SeasonTicket[20];


    public void addFitness(SeasonTicket ticket, ZoneType zone){
        System.out.println(!isClosed());
        LocalTime localTime = LocalTime.now();
//        LocalDate today = LocalDate.now();
        if (!isClosed()){
            if (ticket.getSeasonTicketType() == SeasonTicketType.SINGLE  && zone == ZoneType.GROUPClass){
                System.out.println("По Вашему аббонементу групповые занятия не доступны ");
                return;
            }
            if (ticket.getSeasonTicketType() == SeasonTicketType.DAYTIME && zone == ZoneType.POOL &&
                    localTime.isAfter(LocalTime.of(16,00))){
                System.out.println("Дневной абонемент не позволяет посещать бассейн и ограничен по времени до 16:00");
            }
            else {
                if (zone == ZoneType.GYM){
                    addGim(ticket);
                }
                if (zone == ZoneType.POOL){
                    addPool(ticket);
                }
                if (zone == ZoneType.GROUPClass){
                    addGroupClass(ticket);
                }

            }
        }
    }

    private void addGim(SeasonTicket ticket){
        for (int i = 0; i < gym.length; i++) {
            if (gym[i] == null){
                gym[i] = ticket;
                Logger.getClientInfo(ticket);
                return;
            }
        }
         System.out.println("Тренажерный зал заполнен");
    }

    private void addPool(SeasonTicket ticket){
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] == null){
                pool[i] = ticket;
                return;
            }
        }
        System.out.println("Бассейн заполнен");
    }

    private void addGroupClass(SeasonTicket ticket){
        for (int i = 0; i < groupClass.length; i++) {
            if (groupClass[i] == null){
                groupClass[i] = ticket;
                return;
            }
        }
        System.out.println("Групповые занятия заполнены");
    }

    public boolean isClosed(){
        LocalTime localTime = LocalTime.now();
        if (localTime.isBefore(LocalTime.of(07,00)) ||
                localTime.isAfter(LocalTime.of(22,00))){
            Arrays.fill(gym, null);
            Arrays.fill(pool, null);
            Arrays.fill(groupClass,null);
            System.out.println("Клуб закрыт, приходите завтра");
        }
        return false;
    }

    public String getFitnessInfo() {
        return "Тренажерный зал: " + Arrays.toString(gym) + "\n"
                + "Бассейн: " + Arrays.toString(pool) + "\n"
                + "Групповые занятия" + Arrays.toString(groupClass);
    }

}
