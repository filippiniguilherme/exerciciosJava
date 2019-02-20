package topicosEspeciais;

import java.text.SimpleDateFormat;

public class Calendar {
	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		System.out.println("x1: " + sdf1.format(x1));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime();
	}

	
	
}
