package Challange;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

import Challange.Sports.Football;
import Challange.Sports.Hockey;

public class Main {
    public static void main(String[] args) {


        Team<Football> footballTeam = new Team<>("Djurgården");
        Team<Football> anotherTeam = new Team<>("AIK");
        Team<Football> thirdTeam = new Team<>("Hammarby");
        Team<Football> forthTeam = new Team<>("Uppsala");
        Team<Hockey> hockeyTeam = new Team<>("Leksand");



        League<Football> football_league = new League<>("Football League");
        football_league.addTeamToLeague(footballTeam);
        football_league.addTeamToLeague(anotherTeam);
        football_league.addTeamToLeague(anotherTeam);
        football_league.addTeamToLeague(thirdTeam);
        football_league.addTeamToLeague(forthTeam);
//        football_league.addTeamToLeague(hockeyTeam); // Wont work because of generics!

        footballTeam.gameResult(anotherTeam, 1, 1);
        anotherTeam.gameResult(footballTeam, 4, 2);
        thirdTeam.gameResult(anotherTeam, 2, 3);
        forthTeam.gameResult(footballTeam, 1, 2);
        footballTeam.gameResult(anotherTeam, 1, 3);

        football_league.printLeagues();


    }
}
