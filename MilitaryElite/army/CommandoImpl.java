package exercise.MilitaryElite.army;

import exercise.MilitaryElite.army.enums.Corps;
import exercise.MilitaryElite.army.helperClasses.interfaces.Mission;
import exercise.MilitaryElite.army.interfaces.Commando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private List<Mission> missions;


    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;

    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator())
                .append("Missions: ")
                .append(System.lineSeparator());

        for (Mission mission : this.missions) {
            sb.append("  ")
                    .append(repair.toString())
                    .append(System.lineSeparator());

        }

        return sb.toString().trim();
    }


}
