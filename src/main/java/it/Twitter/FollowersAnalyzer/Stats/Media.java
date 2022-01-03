package it.Twitter.FollowersAnalyzer.Stats;

import java.util.ArrayList;

import it.Twitter.FollowersAnalyzer.Model.User;

public class Media {
	
	private int somma=0;
	private double media=0;
	
	public Media(User user) {
		
		for(User i: user.getFollowers()) {
			somma+=i.getFollowers().size();
		}
		
		try {
			this.media=Math.round((((double)somma/user.getFollowers().size())*100.0)/100.0);}
		catch(ArithmeticException e) {
			System.err.println("Media non riuscita");
		}
			
	}

	public String toString() {
		return "{\"MediaFollowers(per utente)\":[{\"media\": \""+ media + " followers\"}]}";	
	}
	
	
	
	
	
	

}
