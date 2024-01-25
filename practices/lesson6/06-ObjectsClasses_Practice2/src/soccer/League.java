/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author Thamsanqa Ndaba
 */
public class League {

    public static void main(String[] args) {
        Player player1 = new Player(), player2 = new Player(), player3 = new Player();
        player1.plyerName = "Ramos";
        player2.plyerName = "Ronaldo";
        player3.plyerName = "Rafael";
        Player[] thePlayers = {player1, player2, player3};
        Team team1 = new Team();
        team1.teamName = "The Rebels";
        team1.playerArray = thePlayers;

        Team team2 = new Team();
        team2.teamName = "The Zulus";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].plyerName = "Zidane";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].plyerName = "Zimmermann";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].plyerName = "Zlatan";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by" + 
                currGame.goals[0].thePlayer.plyerName + " of " + currGame.goals[0].theTeam.teamName);
    }
}
