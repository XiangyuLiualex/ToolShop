import java.util.ArrayList;
/**
 * 
 * The overall purpose of this code: create a list of supplier
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  6:22:52 p.m.
 *
 */
public class SupplierList {
	/**
	 * a list of supplier
	 */
	private ArrayList <Supplier>supplierList = new ArrayList <Supplier>();
	/**
	 * setter for supplier list
	 * @param supplier
	 */
	public void setSupplierList(Supplier supplier) {
		this.supplierList.add(supplier);
	}
	/**
	 * getter of supplier list
	 * @return supplier list
	 */
	public ArrayList<Supplier> getSupplierList() {
		return supplierList;
	}
}
