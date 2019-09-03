package exercise.MilitaryElite.army.interfaces;

import exercise.MilitaryElite.army.helperClasses.interfaces.Repair;

import java.util.Collection;

public interface Engineer {

    void addRepair(Repair repair);

    Collection<Repair> getRepairs();


}
