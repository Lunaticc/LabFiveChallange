package Challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Sport> {
    private String name;
    private List<Team<T>> teamList;

    public League(String name) {
        this.name = name;
        this.teamList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeamToLeague(Team<T> team){
        if (teamList.contains(team)){
            System.out.println("Team already in the league!");
            return false;
        }else {
            System.out.println("Team added to League!");
            teamList.add(team);
            return true;
        }
    }
    public void printLeagues(){
        Collections.sort(teamList);
        for (Team<T> t : teamList){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
