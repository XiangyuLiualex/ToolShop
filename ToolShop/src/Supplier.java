import java.util.ArrayList;
/**
 * 
 * The overall purpose of this code: create a supplier 
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  5:55:05 p.m.
 *
 */
public class Supplier {
	/**
	 * a supplier id 
	 */
	private int id;
	/**
	 * the name of company 
	 */
	private String companyName;
	/**
	 * the address of supplier
	 */
	private String address;
	/**
	 * the contact of sales
	 */
	private String salesContact;
	/**
	 * the list of item
	 */
	private ArrayList<Item> itemList= new ArrayList<Item>();
	/**
	 * create a string to store 
	 */
	private String toString;
	/**
	 * setter of id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * setter for company name
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * setter of address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * setter of sales of contact
	 * @param salesContact
	 */
	public void setSalesContact(String salesContact) {
		this.salesContact = salesContact;
	}
	/**
	 * getter of id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * getter of company name
	 * @return company name
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * getter for address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * getter for sales contact
	 * @return salesContact
	 */
	public String getSalesContact() {
		return salesContact;
	}
	/**
	 * setter of item
	 * @param item
	 */
	public void setItem(Item item) {
		this.itemList.add(item);
	}
	/**
	 * getter for item
	 * @return itemList
	 */
	public ArrayList<Item> getItem() {
		return itemList;
	}
	/**
	 * setter of ToString
	 */
	public void setToString() {
		this.toString="supplier id: "+id+"Company Name: "+companyName+"address"+address+"salesContact: "+salesContact;
	}
	/**
	 * getter toString
	 * @return toString
	 */
	public String getToString() {
		return toString;
	}
	/**
	 * getter for item list
	 * @return item list
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	/**
	 * setter for item list
	 * @param item
	 */
	public void setItemList(Item item) {
		this.itemList.add(item);
	}
}
