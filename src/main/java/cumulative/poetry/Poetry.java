package cumulative.poetry;

public class Poetry {

    private int day;
    private String poetryMessage;

    public Poetry(int day, String poetryMessage) {
        this.day = day;
        this.poetryMessage = poetryMessage;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPoetryMessage() {
        return poetryMessage;
    }

    public void setPoetryMessage(String poetryMessage) {
        this.poetryMessage = poetryMessage;
    }
}
