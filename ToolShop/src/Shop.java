import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 
 * The overall purpose of this code: a shop include suppliser list and item list
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  5:50:23 p.m.
 *
 */
public class Shop {
	/**
	 * An item list
	 */
	private Inventory ItemList= new Inventory();
	/**
	 * An supplier list 
	 */
	private SupplierList SupList=new SupplierList();
	/**
	 * A file manager
	 */
	private FileManager FM=new FileManager();
	
	/**
	 * create a item list and supplier list
	 * @throws FileNotFoundException
	 */
	public void createList() throws FileNotFoundException {
		FM.setPathName("/Users/liuxiangyu/Desktop/items.txt");
		FM.readFile();
		Scanner scan= new Scanner(FM.getAnswer());
		while(scan.hasNextLine()) {
			String[]str = scan.nextLine().split(";");
			Item item=new Item();
			item.setId(Integer.parseInt(str[0]));
			item.setItemName(str[1]);
			item.setQuantity(Integer.parseInt(str[2]));
			item.setPrice(Double.parseDouble(str[3]));
			item.setSupplierId(Integer.parseInt(str[4]));
			ItemList.addItem(item);
		}
		scan.close();
		
		FM.setPathName("/Users/liuxiangyu/Desktop/suppliers.txt");
		FM.readFile();
		Scanner scanS= new Scanner(FM.getAnswer());
		while(scanS.hasNextLine()) {
			String[] ss= scanS.nextLine().split(";");
			Supplier sup=new Supplier();
			sup.setId(Integer.parseInt(ss[0]));
			sup.setCompanyName(ss[1]);
			sup.setAddress(ss[2]);
			sup.setSalesContact(ss[3]);
			SupList.setSupplierList(sup);
		}
		scanS.close();
		
		for(int i=0; i<ItemList.getItemList().size() ;i++) {
			for(int j=0; j<SupList.getSupplierList().size();j++) {
				if(ItemList.getItemList().get(i).getSupplierId()==SupList.getSupplierList().get(j).getId()) {
					
				
				ItemList.getItemList().get(i).setSup(SupList.getSupplierList().get(j));
				}
			}
		}
		
		for(int i=0; i<SupList.getSupplierList().size();i++) {
			for(int j=0; j<ItemList.getItemList().size();j++) {
				if(ItemList.getItemList().get(j).getSupplierId()==SupList.getSupplierList().get(i).getId()){
					SupList.getSupplierList().get(i).setItemList(ItemList.getItemList().get(j));
				}
			}
		}
		
	}
	/**
	 * getter of item list
	 * @return item list
	 */
	public Inventory getItemList() {
		return ItemList;
	}
	/**
	 * getter of supplier list
	 * @return supplier list
	 */
	public SupplierList getSupList() {
		return SupList;
	}

}
