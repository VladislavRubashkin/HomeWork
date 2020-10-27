package homeWork.testWork1;

import java.time.LocalDateTime;

public class MethodMain {


    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();


            fitnessClub.addFitness(SeasonTicket.addSeasonTicket(),ZoneType.GROUPClass);
            fitnessClub.addFitness(SeasonTicket.addSeasonTicket(),ZoneType.POOL);
            fitnessClub.addFitness(SeasonTicket.addSeasonTicket(), ZoneType.GYM);




//        Logger.getClientInfo();
        Logger.getFitnessInfo(fitnessClub);

        fitnessClub.isClosed();

    }
}
