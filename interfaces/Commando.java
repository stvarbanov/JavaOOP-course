package exercise.MilitaryElite.army.interfaces;

import exercise.MilitaryElite.army.helperClasses.interfaces.Mission;

import java.util.Collection;

public interface Commando {

     void addMission(Mission mission);

     Collection<Mission> getMissions();


}
