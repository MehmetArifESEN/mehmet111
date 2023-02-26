package lesson14.homework2;

import java.util.ArrayList;
import java.util.Random;

public class League {
	
	private ArrayList<Team> takimlar;
	private  int result;
	
	 
	public League() {
		
	}
	
	public League(ArrayList<Team> takimlar) {
		super();
		this.takimlar = takimlar;
		
	}

	public int randomOlustur() {
		Random random = new Random();
		this.result = random.nextInt(1, 4);
		return this.result;
		
		
	}
	
	public void ligeTakimEkle(Team team) {
		this.takimlar.add(team);
	}
	
	public void macYap(Team team1, Team team2) {
		randomOlustur();
		if(this.result==1) {
			System.out.println(team1.getName() + " " + team2.getName() + " ye karşı maçı kazanmıştır.");
			team1.setCashbox(team1.getCashbox() +10000);
			team1.setScore(team1.getScore() + 3 );
		}
		else if (this.result==2) {
			System.out.println(team2.getName() + " " + team1.getName() + " ye karşı maçı kazanmıştır.");
			team2.setCashbox(team2.getCashbox() +10000);
			team2.setScore(team2.getScore() + 3 );
		}else {
			System.out.println(team1.getName() + " ve " + team2.getName() + " berabere kalmıştır." );
			team1.setCashbox(team1.getCashbox() +5000);
			team1.setScore(team1.getScore() + 1 );
			team2.setCashbox(team2.getCashbox() +5000);
			team2.setScore(team2.getScore() + 1 );
		}
		
	}
	
	public void showCashbox (Team team) {
		System.out.println(team.getName() + " Kasası--->" + team.getCashbox() );
	}
	
	public void iflasEdenTakim(Team team) {
		if (team.getCashbox()< 5000) {
			System.out.println(team.getName() + " iflas etmiştir.");
			
		}
	}
	
	public void puanDurumunuGoster(ArrayList<Team> takimlar) {
		System.out.println("******Puan Durumu******");
		int maxPuan=0;
		String champ=null;
		for (Team team: this.takimlar) {
			System.out.println(team.getName() + " Puanı--->" + team.getScore() );
			if(team.getScore()>maxPuan) {
				maxPuan= team.getScore();
				champ=team.getName();
			}
			
		}
		System.out.println("Şampiyon--->" + champ );
	}

	public ArrayList<Team> getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(ArrayList<Team> takimlar) {
		this.takimlar = takimlar;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
	
	
	
	

}
