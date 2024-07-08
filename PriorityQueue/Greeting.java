import java.util.Scanner;
import java.util.PriorityQueue;
public class Greeting{
	public static void main (String args []){
		
		Scanner xd = new Scanner(System.in);
		PriorityQueue<String> nicknames = new PriorityQueue<>();
		
		System.out.println("Enter the nicknames of 4 of your classmates:\n");	
		for(int i = 1; i <= 4; i++){
			System.out.print("Nickname " + i + ": ");
			String name = xd.next();
			nicknames.offer(name);
		}		
		int count = 0;
		do{ 
			System.out.print("\nPress 'H' to say Hi: ");
			char greet = xd.next().charAt(0);
			
			if((greet == 'H' || greet == 'h') && !nicknames.isEmpty()){
				System.out.println("Hi, " + nicknames.poll() + "!");
				count++;
				
				if(count == 4){
				System.out.println("\nDone saying Hi");
				break;
				}
			}
			
			else{
				System.out.println("\ninvalid input!");
			}
		}while(true);	

	}
}