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

        for (Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.plyerName);
        }

        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.plyerName);
        }
    }
}
