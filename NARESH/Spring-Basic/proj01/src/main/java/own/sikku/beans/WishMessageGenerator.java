package own.sikku.beans;

import java.util.Date;


import lombok.Setter;

@Setter
public class WishMessageGenerator {
	
	private Date date;
	
	public String generateMessage(String user) {
		int hour = date.getHours();
		return "good morningl "+user+" "+ hour;
	}
	
}
