package homeWork.testWork1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;

//import static homeWork.testWork1.SeasonTicketType.SINGLE;

public class SeasonTicket {
    private  HumanInformation client;
    private SeasonTicketType seasonTicketType;
    private  LocalDateTime currentDate;
    private  LocalDateTime endingDate;
    protected static ZoneType[] zoneType = {ZoneType.GYM, ZoneType.POOL, ZoneType.GROUPClass};

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
        this.seasonTicketType = seasonTicketType;
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
        this.endingDate = endingDate;
    }
    public SeasonTicket(HumanInformation client, SeasonTicketType seasonTicketType){
        this.client = client;
        this.seasonTicketType = seasonTicketType;
    }

    public static SeasonTicket addSeasonTicket() {
        SeasonTicket ticket = new SeasonTicket(HumanInformation.addHumanInformation(),
                seasonTicketTypes[(int) (Math.random() * seasonTicketTypes.length - 1)]);
        ticket.setCurrentDate(LocalDateTime.now());
        if (ticket.seasonTicketType == SeasonTicketType.SINGLE) {
            ticket.endingDate = ticket.currentDate.plusDays(1);
        } else if (ticket.seasonTicketType == SeasonTicketType.DAYTIME ||
                ticket.seasonTicketType == SeasonTicketType.FULLTIME)
            ticket.endingDate = ticket.currentDate.plusYears(1);
        return ticket;
    }

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