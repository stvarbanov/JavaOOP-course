package exercise.MilitaryElite.army.enums;

public enum State {
    INPROGRESS,
    FINISHED;

    @Override
    public String toString() {
        String result = super.toString();
        return result = super.toString()
                .equals("INPROGRESS") ? "inProgress" : "finished";

    }
}
