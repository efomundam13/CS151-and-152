
public class CollegeTeam extends Athlete {
    protected String collegeName;
    protected int teamSize;

    public CollegeTeam(String sport, String nickname, String collegeName, int teamSize) {
        super(sport, nickname);
        this.collegeName = collegeName;
        this.teamSize = teamSize;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}