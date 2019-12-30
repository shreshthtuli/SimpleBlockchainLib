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
				// Add data point
				test.AddBlock(data);
			}
			else if(option.contains("b")){
				// Validate blockchain integrity. Pass if no errors
				test.ValidateChain();
			}
			else if(option.contains("c")){
				System.out.println("Enter location:");
				int loc = Integer.parseInt(sc.nextLine().trim());
				System.out.println("Enter data:");
				String dat = sc.nextLine();
				// Change data maliciously, numbering starts from 1 not 0
				test.chain.get(loc).data = dat;
			}
			else if(option.contains("d")){
				// Save blockchain to file
				test.SaveChain("testchain");
			}
			else if(option.contains("e")){
				// Load blockchain from file
				test = new Blockchain("testchain");
			}
			else if(option.contains("f")){
				// Print all datapoints in blockchain
				System.out.println(test.GetAllData("\n"));
			}
		}
	}
}
