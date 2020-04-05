import java.util.ArrayList;
/**
 * 
 * The overall purpose of this code:A list of item
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  4:55:48 p.m.
 *
 */
public class Inventory {
	/**
	 * create a item
	 */
	private Item item;
	/**
	 * the list of item
	 */
	private ArrayList <Item> itemList= new ArrayList<Item>();
	/**
	 * a list of orders
	 */
	private Order orderList=new Order();
	/**
	 * change output to string
	 */
	private String toString="";
	/**
	 * setter for Item list
	 */
	public void setItemList() {
		this.itemList.add(item);
	}
	
	/**
	 * setter for order list
	 * @param orderList
	 */
	public void setOrderList(Order orderList) {
		this.orderList = orderList;
	}
	/**
	 * getter for Item list
	 * @return itemList
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	
	/**
	 * getter for order list
	 * @return orderList
	 */
	public Order getOrderList() {
		return orderList;
	}
	
	/**
	 * setter for item
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	/**
	 * getter for item
	 * @return item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * add a item
	 * @param tool
	 */
	public void addItem(Item tool) {
		this.itemList.add(tool);
	}
	/**
	 * search an item by id
	 * @param id
	 * @return item
	 */
	public Item searchById(int id) {
		for(int i=0; i<itemList.size();i++) {
			if(itemList.get(i).getId()==id ) {
				return itemList.get(i);
			}
		}
		System.out.println("Sorry invalid value!");
		return null;
	}
	/**
	 * search an item by name
	 * @param name
	 * @return item
	 */
	public Item searchByName(String name) {
		for(int i=0; i<itemList.size();i++) {
			if(itemList.get(i).getItemName().equalsIgnoreCase(name) ) {
				return itemList.get(i);
			}
		}
		System.out.println("Sorry invalid value!");
		return null;
	}
	/**
	 * decrease an item by num 
	 * @param name
	 * @param num
	 */
	public void decreaseItem(String name,int num) {
		for(int i=0; i<itemList.size();i++) {
			if(itemList.get(i).getItemName().equalsIgnoreCase(name) ) {
				 itemList.get(i).setQuantity( itemList.get(i).getQuantity()-num);
			}
		}
	}
	
	/**
	 * delete an item
	 * @param item
	 */
	public void deleteItem(Item item) {
		for(int i=0; i<itemList.size();i++) {
			if(itemList.get(i)==item ) {
				this.itemList.remove(i);
			}
		}
		
	}
	/**
	 * setter for toString
	 */
	public void setToString() {
		for(int i=0; i<itemList.size();i++) {
			this.itemList.get(i).setToString();
			this.toString+=itemList.get(i).getToString()+"\n\n";
		}
	}
	/**
	 * getter for to string
	 * @return toString
	 */
	public String getToString() {
		return toString;
	}
	
	/**
	 * check amount of all items, call a oder for the small number of items
	 */
	public void checkQuntity() {
		for(int i=0; i<itemList.size();i++) {
			if(this.itemList.get(i).getQuantity()<=40) {
				this.orderList.setOrderLine();
				this.orderList.getOrderLine().setItem(itemList.get(i));
				this.orderList.getOrderLine().setAmount();
				this.orderList.getOrderLine().setItemName();
				this.orderList.getOrderLine().setSupplierName();
				this.orderList.setOrderList();
				
			}
		}
		this.orderList.setOrderId();
	}
	
	
	
}
