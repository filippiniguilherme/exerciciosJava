package topicosEspeciais;

import java.text.SimpleDateFormat;

public class Date {
		public static void main(String[] args) {
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			Date x1 = new Date();
			
			
			
			/*Date y1 = sdf1.parse("25/06/2018");
			Date y2 = sdf2.parse("25/06/2018 15:42:07");*/
			
			System.out.println("x1: " + sdf2.format(x1));
		}
}
