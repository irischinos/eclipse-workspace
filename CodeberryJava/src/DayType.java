
public class DayType
{
    public static void main(String[] args) {
    	/*Multi-constant case labels supported from Java 14 onwards only*/
        int day = 2;
        switch(day) {
            /*case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";*/
        case 1:
        	System.out.println("Working day");
        	break;
        case 2:
        	System.out.println("Weekend");
        	break;
        default:
        	System.out.println("Invalid day");
        	break;
            };
        System.out.println(day);
    }
} 
