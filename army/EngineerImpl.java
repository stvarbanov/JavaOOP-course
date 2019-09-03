package exercise.MilitaryElite.army;

import exercise.MilitaryElite.army.enums.Corps;
import exercise.MilitaryElite.army.helperClasses.interfaces.Repair;
import exercise.MilitaryElite.army.interfaces.Engineer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();

    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator())
                .append("Repairs: ")
                .append(System.lineSeparator());

        for (Repair repair : this.repairs) {
            sb.append("  ")
                    .append(repair.toString())
                    .append(System.lineSeparator());

        }

        return sb.toString().trim();

    }
}
