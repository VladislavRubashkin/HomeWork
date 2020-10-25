package homeWork.testWork1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;

import static homeWork.testWork1.SeasonTicketType.SINGLE;

public class SeasonTicket {
    private  HumanInformation client;
    private SeasonTicketType seasonTicketType;
    private  LocalDateTime currentDate;
    private  LocalDateTime endingDate;
//    protected ZoneType[] zoneType; // [GYM,POOL]

    private static SeasonTicketType[] seasonTicketTypes = {SeasonTicketType.SINGLE,
            SeasonTicketType.DAYTIME, SeasonTicketType.FULLTIME};


    public SeasonTicket(HumanInformation client, SeasonTicketType seasonTicketType,
                        LocalDateTime currentDate, LocalDateTime endingDate) {
        setClient(client);
        setSeasonTicketType(seasonTicketType);
        setCurrentDate(currentDate);
        setEndingDate(endingDate);
    }

    public HumanInformation getClient() {
        return client;
    }

    public void setClient(HumanInformation client) {
        this.client = client;
    }

    public SeasonTicketType getSeasonTicketType() {
        return seasonTicketType;
    }

    public void setSeasonTicketType(SeasonTicketType seasonTicketType) {
        this.seasonTicketType = seasonTicketTypes[(int) (Math.random() * seasonTicketTypes.length - 1)];
    }

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDateTime currentDate) {
        this.currentDate = currentDate;
    }

    public LocalDateTime getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDateTime endingDate) {
        if (seasonTicketType == SeasonTicketType.SINGLE) {
            this.endingDate = currentDate.plusDays(1);
        }
        if (seasonTicketType == SeasonTicketType.DAYTIME) {
            this.endingDate = currentDate.plusYears(1);
        }
        if (seasonTicketType == SeasonTicketType.FULLTIME) {
            this.endingDate = currentDate.plusYears(1);
        }
    }
//    public SeasonTicket(HumanInformation client, SeasonTicketType[] seasonTicketTypes){
//        getClient();
//        getSeasonTicketTypes();
//    }
//
//
//    public static HumanInformation getClient() {
//        return client;
//    }
//
//    public static void setClient(HumanInformation client) {
//        SeasonTicket.client = client;
//    }
//
//    public static LocalDateTime getCurrentDate() {
//        return currentDate;
//    }
//
//    public static void setCurrentDate(LocalDateTime currentDate) {
//        SeasonTicket.currentDate = currentDate;
//    }
//
//    public static LocalDateTime getEndingDate() {
//        return endingDate;
//    }
//
//    public static void setEndingDate(LocalDateTime endingDate) {
//        SeasonTicket.endingDate = endingDate;
//    }
//
//    public static SeasonTicketType[] getSeasonTicketTypes() {
//        return seasonTicketTypes;
//    }
//
//    public static void setSeasonTicketTypes(SeasonTicketType[] seasonTicketTypes) {
//        SeasonTicket.seasonTicketTypes = seasonTicketTypes;
//    }
//
//
//    public static SeasonTicket addSeasonTicket() {
//        SeasonTicket ticket = new SeasonTicket(HumanInformation.addHumanInformation(),
//                seasonTicketTypes[(int) (Math.random() * 3)];
//
//        if (ticket.seasonTicketType == SINGLE) {
//            ticket.endingDate = ticket.currentDate.plusDays(1));
//        } else if (ticket.seasonTicketType == SeasonTicketType.DAYTIME ||
//                ticket.seasonTicketType == SeasonTicketType.FULLTIME)
//            ticket.endingDate = ticket.currentDate.plusYears(1);
//        return ticket;
//    }

    @Override
    public String toString() {
        return "SeasonTicket{" +
                "Клиент: " + client +
                ", Тип абонемента: " + seasonTicketType +
                ", Текущая дата: " + currentDate +
                ", Дата окончания: " + endingDate +
                '}';
    }

}