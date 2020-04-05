/**
 * 
 * The overall purpose of this code: Create a order line
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  5:21:18 p.m.
 *
 */
public class Orderline {
	/**
	 * create a item 
	 */
	private Item item;
	/**
	 * the name of item
	 */
	private String itemName;
	/**
	 * the number of item
	 */
	private int amount;
	/**
	 * supplier name 
	 */
	private String supplierName;
	/**
	 * create a string to store all the output
	 */
	private String toString;
	
/**
 * setter for a item
 * @param item
 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * setter for amount
	 */
	public void setAmount() {
		this.amount = 50-item.getQuantity();
	}
	/**
	 * getter amount
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * setter supplier name
	 */
	public void setSupplierName() {
		this.supplierName = item.getSup().getCompanyName();
	}
	/**
	 * getter supplier name
	 * @return supplier name
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * getter for item name
	 * @return item name
	 */

	public String getItemName() {
		return itemName;
	}

	/**
	 * setter item name
	 */
	public void setItemName() {
		this.itemName = item.getItemName();
	}
	/**
	 * setter of toString
	 */
	public void setToString() {
		this.toString ="Item description:   "+itemName+"\n"+"Amount ordered:    "+amount+"\n"+"Supplier:    "+supplierName+"\n\n";
	}
	/**
	 * getter of item
	 * @return a item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * getter of toSting
	 * @return toString
	 */
	public String getToString() {
		return toString;
	}

	
}
