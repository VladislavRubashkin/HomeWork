package homeWork.lessons6.climbers;

import java.util.Arrays;

public class GroupForClimbing {

    private boolean recruitment;
    private Climber[] climbers;
    private Mountain mountain;


    public GroupForClimbing(int maxCountGroup, Mountain mountain){
        this.recruitment = true;
        this.climbers = new Climber[maxCountGroup];
        this.mountain = mountain;
    }

//    public void setRecruitment(boolean recruitment){
//        this.recruitment = recruitment;
//    }
//    public boolean getRecruitment(){
//        return recruitment;
//    }
//
//    public void setClimbers(Climber[] climbers){
//        this.climbers = climbers;
//    }
//    public Climber[] getClimbers(){
//        return climbers;
//    }
//
//    public void setMountain(Mountain mountain){
//        this.mountain = mountain;
//    }
//    public Mountain getMountain(){
//        return mountain;
//    }

    public void groupIsClosed(){
        if (!recruitment){
            System.out.println("Набор в группу на гору " + mountain.getName() + " закрыт.");
        }
    }

    public void addClimber(Climber climber){
        if (recruitment && climber != null){
            for (int i = 0; i < climbers.length; i++) {
                if (climbers[i] == null){
                    climbers[i] = climber;
                    System.out.println(climber.getName() + " присоединился для восхождению на гору "
                    + mountain.getName() +  " ,высотой "+ mountain.getHeight() + " метров" +
                                    " ,расположенную в " + mountain.getCountry());
                    break;
                }
                if (climbers[climbers.length-1] != null){
                    groupIsClosed();
                }
            }
        }
        else{
            System.out.println("Набор в группу на гору " + mountain.getName() + " закрыт.");
        }

    }

    public String climbersList() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список группы для восхождерния на ").append(this.mountain.getName()).append(": \n");
        for (Climber climber : climbers) {
            if (climber != null)
                sb.append(climber).append("\n");
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return "Group{" +
                "Recruitment=" + recruitment +
                ", climbers=" + Arrays.toString(climbers) +
                ", mountain=" + mountain +
                '}';
    }



}
