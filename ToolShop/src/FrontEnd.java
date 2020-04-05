import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 
 * The overall purpose of this code: Main function for the entire shop
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  4:53:17 p.m.
 *
 */
public class FrontEnd {

	/**
	 * main function to call all the class and create a menu
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		while(true) {
		Shop shop= new Shop();
		shop.createList();
		System.out.println("menu:\n1. List all tools.\n2. Search for tool by toolName\n"
				+ "3. Search for tool by toolID\n4. Check item quantity\n5. Decrease Item quantity \n6. Quit\n");
		Scanner sca= new Scanner(System.in);
		int input=sca.nextInt();
		
		if(input==1) {
			shop.getItemList().setToString();
			System.out.print(shop.getItemList().getToString());
		}
		
		if(input==2) {
			System.out.println("Please enter a Item id: ");
			Scanner scan= new Scanner(System.in);
			int id= scan.nextInt();
			Item item=shop.getItemList().searchById(id);
			item.setToString();
			System.out.print(item.getToString());
			
		}
		if(input==3) {
			System.out.println("Please enter a Item name: ");
			Scanner scan= new Scanner(System.in);
			String name= scan.nextLine();
			Item item=shop.getItemList().searchByName(name);
			item.setToString();
			System.out.print(item.getToString());
		}
		if(input==4) {
			System.out.println("What day is today? ");
			Scanner scan=new Scanner(System.in);
			String date=scan.nextLine();
			shop.getItemList().checkQuntity();
			shop.getItemList().getOrderList().setDate(date);
			shop.getItemList().getOrderList().setToString();
			System.out.println(shop.getItemList().getOrderList().getToString());
		}
		if(input==5) {
			System.out.println("What day is today? ");
			Scanner scan= new Scanner(System.in);
			String date=scan.nextLine();
			System.out.println("Which item you want to decrease? ");
			String name= scan.nextLine();
			System.out.println("How much you want to decrease? (Please do not beyond the item's quanlity)");
			int num=scan.nextInt();
			shop.getItemList().decreaseItem(name, num);
			shop.getItemList().checkQuntity();
			shop.getItemList().getOrderList().setDate(date);
			shop.getItemList().getOrderList().setToString();
			System.out.println(shop.getItemList().getOrderList().getToString());
			
		}
		if(input==6) {
			System.exit(0);
		}
		if(input!=1&& input!=2&& input!=3&&input!=4&&input!=5&&input!=6) {
			System.out.println("invalid value!!!");
			System.exit(0);
		}
	}
	}
}
