
public abstract class Athlete {
    protected String sport;
    protected String nickname;

    public Athlete(String sport, String nickname) {
        this.sport = sport;
        this.nickname = nickname;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}