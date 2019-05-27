package cumulative.poetry.models;

public class ArgsDTO {

    private boolean isRevealOptionSelected;
    private boolean isReciteOptionSelected;
    private boolean isEchoSelected;
    private int day;

    public boolean isRevealOptionSelected() {
        return isRevealOptionSelected;
    }

    public void setRevealOptionSelected(boolean revealOptionSelected) {
        isRevealOptionSelected = revealOptionSelected;
    }

    public boolean isReciteOptionSelected() {
        return isReciteOptionSelected;
    }

    public void setReciteOptionSelected(boolean reciteOptionSelected) {
        isReciteOptionSelected = reciteOptionSelected;
    }

    public boolean isEchoSelected() {
        return isEchoSelected;
    }

    public void setEchoSelected(boolean echoSelected) {
        isEchoSelected = echoSelected;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ArgsDTO{" +
                "isRevealOptionSelected=" + isRevealOptionSelected +
                ", isReciteOptionSelected=" + isReciteOptionSelected +
                ", isEchoSelected=" + isEchoSelected +
                ", day=" + day +
                '}';
    }
}
