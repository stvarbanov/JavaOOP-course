package exercise.MilitaryElite.army;

import exercise.MilitaryElite.army.interfaces.LieutenantGeneral;
import exercise.MilitaryElite.army.interfaces.Private;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>(new Comparator<Private>() {
            @Override
            public int compare(Private first, Private second) {
                return second.getId() - first.getId();
            }
        });

    }

    @Override
    public void addPrivate(Private soldier) {
        this.privates.add(soldier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb
                .append(System.lineSeparator())
                .append("Privates:")
                .append(System.lineSeparator());
        for (Private aPrivate : this.privates) {
            sb
                    .append("  ")
                    .append(aPrivate.toString())
                    .append(System.lineSeparator());
        }


        return sb.toString().trim();
    }
}
