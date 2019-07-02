package springandhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "item")
public class Items {
	@Id
	private int itemno;

	private String itemname;
	private int price;
	public int getItemnno() {
		return itemno;
	}
	public void setItemnno(int itemnno) {
		this.itemno = itemnno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [itemno=" + itemno + ", itemname=" + itemname + ", price=" + price + "]";
	}

}
