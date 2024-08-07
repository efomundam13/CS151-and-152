
public class Individual extends Athlete {
    protected String name;

    public Individual(String sport, String nickname, String name) {
        super(sport, nickname);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}