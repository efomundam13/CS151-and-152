
public class ProfessionalTeam extends Athlete {
    protected String cityName;

    public ProfessionalTeam(String sport, String nickname, String cityName) {
        super(sport, nickname);
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}