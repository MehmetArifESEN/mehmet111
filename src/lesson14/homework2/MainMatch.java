package lesson14.homework2;

import java.util.ArrayList;

public class MainMatch {

	public static void main(String[] args) {
		
		League league1 = new League(new ArrayList<>());
		
		Team team1 = new Team("Barcelona" , 0 , 0);
		Team team2 = new Team("Real Madrid" , 0 , 0);
		Team team3 = new Team("Atletico Madrid" , 0 , 0);
		Team team4 = new Team("Sevilla" , 0 , 0);
		
		league1.ligeTakimEkle(team1);
		league1.ligeTakimEkle(team2);
		league1.ligeTakimEkle(team3);
		league1.ligeTakimEkle(team4);
		
		league1.macYap(team1, team2);
		league1.macYap(team1, team3);
		league1.macYap(team1, team4);
		league1.macYap(team2, team3);
		league1.macYap(team2, team4);
		league1.macYap(team3, team4);
		
		league1.showCashbox(team1);
		league1.showCashbox(team2);
		league1.showCashbox(team3);
		league1.showCashbox(team4);
		
		league1.iflasEdenTakim(team1);
		league1.iflasEdenTakim(team2);
		league1.iflasEdenTakim(team3);
		league1.iflasEdenTakim(team4);
		
		
		
		league1.puanDurumunuGoster(league1.getTakimlar());
		
		

	}

}
