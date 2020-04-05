/**
 * 
 * The overall purpose of this code: create a item
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  5:03:00 p.m.
 *
 */
public class Item {
	/**
	 *  item id
	 */
	private int id;
	/**
	 *  item name
	 */
	private String itemName;
	/**
	 * item quantity
	 */
	private int quantity;
	/**
	 * item price
	 */
	private double price;
	/**
	 * item supplier id
	 */
	private int supplierId;
	/**
	 * supplier for this item
	 */
	private Supplier sup;
	/**
	 * change output to string
	 */
	private String toString;
	
	/**
	 * setter for id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * setter for quantity
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * setter for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * setter for item name
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * setter for supplier id
	 * @param id
	 */
	public void setSupplierId(int id) {
		this.supplierId = id;
	}
	/**
	 * getter for id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * getter for item name
	 * @return item name
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * getter for price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * getter for quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * getter for supplier id
	 * @return supplier id
	 */
	public int getSupplierId() {
		return supplierId;
	}
	/**
	 * setter for supplier
	 * @param sup
	 */
	public void setSup(Supplier sup) {
		this.sup = sup;
	}
	/**
	 * getter for supplier
	 * @return supplier
	 */
	public Supplier getSup() {
		return sup;
	}
	/**
	 * decrease item by n
	 * @param n
	 */
	public void decreaseItem(int n) {
		this.quantity-=n;
	}
	/**
	 * setter for toString
	 */
	public void setToString() {
	this.toString="Item id: "+id+"\nitem Name: "+ itemName+ "\nprice: "+price+"\nsupplier ID: "+ supplierId;
	}
	/**
	 * getter of toString
	 * @return toString
	 */
	public String getToString() {
		return toString;
	}
	
	
	
}
