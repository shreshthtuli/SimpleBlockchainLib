/* 
	Coded by:
	Shreshth Tuli
*/

import java.util.*;

public class TestBlockchain{
	public static void main(String[] argv) throws Exception{

		// Create a simple blockchain
		Blockchain test = new Blockchain();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Enter option:\n 'a' for new data\n 'b' for validating chain\n 'c' for changing data\n 'd' for saving\n 'e' for loading\n 'f' print chain:");
			String option = sc.nextLine(); 

			if(option.contains("a")){
				System.out.println("Enter data:");
				String data = sc.nextLine();
				test.AddBlock(data);
			}
			else if(option.contains("b")){
				test.ValidateChain();
			}
			else if(option.contains("c")){
				System.out.println("Enter location:");
				int loc = Integer.parseInt(sc.nextLine().trim());
				System.out.println("Enter data:");
				String dat = sc.nextLine();
				test.chain.get(loc).data = dat;
			}
			else if(option.contains("d")){
				test.SaveChain("testchain");
			}
			else if(option.contains("e")){
				test = new Blockchain("testchain");
			}
			else if(option.contains("f")){
				System.out.println(test.GetAllData("\n"));
			}
		}
	}
}
