package homeWork.testWork1;

import java.time.LocalDateTime;

public class MethodMain {
    public static void main(String[] args) {

        FitnessClub fitnessClub = new FitnessClub();

        for (int i = 0; i < 3; i++) {
            fitnessClub.addFitness(SeasonTicket.addSeasonTicket(),ZoneType.GROUPClass);
            fitnessClub.addFitness(SeasonTicket.addSeasonTicket(),ZoneType.POOL);
            fitnessClub.addFitness(SeasonTicket.addSeasonTicket(), ZoneType.GYM);
        }

        Logger.getFitnessInfo(fitnessClub);

        fitnessClub.isClosed();
    }
}
