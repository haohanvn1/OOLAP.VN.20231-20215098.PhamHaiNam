
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public void addDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println(" added.");
		} else {
			System.out.println("the cart is full");
		}
	}
	
	public void addDisc(DigitalVideoDisc... dvds) {
	    for (DigitalVideoDisc disc : dvds) {
	        addDisc(disc); 
	    }
	}
	
	public void addDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDisc(dvd1);
		addDisc(dvd2);
	}
	
	
	public void removeDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i ++) {
			if(itemsOrdered[i] == disc) {
				
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println("Deleted !");
				return;
			}
		}
		System.out.println("Disc not found!");
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
}
