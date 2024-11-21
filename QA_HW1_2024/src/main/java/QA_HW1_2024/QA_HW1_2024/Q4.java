package QA_HW1_2024.QA_HW1_2024;

/*
 * STUDENT NAME :
 * 	SAPIR MARLOV 207179169 AND Arkadi vorontsov 319257572
 */
public class Q4 {
	public static String Calculate (double a, double b, String mode) {
		switch (mode) {
			case "regular": {
			
				if (a > b) {
					return "A";
				}
				else {
					return "B";
				}
			}
		case "negatives":{
			if(-a < -b) {
				return"B";
			}
			 
			else {
				return "A";
			}
		}
		case  "reciprocals" :{
			if (1/a < 1/b) {
				return "B";
						
			}
			else {
				return "A";
			}
		}
	
		default:
			
			throw new IllegalArgumentException("Unexpected value: " + mode);
		}
}
}