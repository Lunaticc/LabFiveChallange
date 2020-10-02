package Challange;


public class Team<T extends Sport> implements Comparable<Team<T>> {
    private final String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int ranking(){
        return (won*2) + tied;
    }

    public void gameResult(Team<T> opp, int teamScore, int oppScore){
        if(teamScore > oppScore){
            won++;
        } else if (teamScore == oppScore) {
            tied++;
        }else {
            lost++;
        }
        played++;
        if(opp != null){
            opp.gameResult(null, oppScore, teamScore);
        }
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking() > o.ranking()){
            return -1;
        } else if (this.ranking() < o.ranking()) {
            return 1;
        }else {
            return 0;
        }
    }
}
