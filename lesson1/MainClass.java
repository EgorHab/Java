package JavaCore.lesson1;

public class MainClass {
    public static void main(String[] args) {
        Team teamGb = new Team("GB");

        teamGb.createTeam();
        teamGb.allPlayerInfo();
        teamGb.createCourse();
        teamGb.doIt();
        teamGb.playerSuccessInfo();
    }
}
