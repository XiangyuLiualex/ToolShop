import java.security.SecureRandom;
import java.util.ArrayList;
/**
 * 
 * The overall purpose of this code: create a order list
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  5:08:18 p.m.
 *
 */
public class Order {
	/**
	 * order line
	 */
	private Orderline orderLine=new Orderline();
	/**
	 * order id
	 */
	private int orderId;
	/**
	 * date of order
	 */
	private String date="2020.02.14";
	/**
	 * order list
	 */
	private ArrayList <Orderline> orderList= new ArrayList <Orderline>();
	/**
	 * change everything to a String   
	 */
	private String toString;
	
	
	/**
	 * setter date
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * getter for date
	 * @return date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * setter order id
	 */
	public void setOrderId() {
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String number = String.format("%05d", num); 
		this.orderId=Integer.parseInt(number);
	}
	/**
	 * getter for order id
	 * @return order id
	 */
	public int getOrderId() {
		return orderId;
	}
	
	/**
	 * setter of order list
	 */
	public void setOrderList( ) {
		this.orderList.add(orderLine);
	}
	/**
	 *  getter order list
	 * @return orderList
	 */
	public ArrayList<Orderline> getOrderList() {
		return orderList;
	}
	/**
	 * setter for order line
	 */
	public void setOrderLine() {
		this.orderLine = new Orderline();
	}
	/**
	 * getter for order line
	 * @return order line
	 */
	public Orderline getOrderLine() {
		return orderLine;
	}
	/**
	 * getter toString
	 * @return toString
	 */
	public String getToString() {
		return toString;
	}
	/**
	 * setter toString
	 */
	public void setToString() {
		this.toString = "Order ID:    "+ orderId+"\nDate Ordered:    "+date+"\n\n";
		for(int i=0; i<orderList.size();i++) {
			orderList.get(i).setToString();
			toString+=orderList.get(i).getToString();
		}
	}
	
}
