package code;

public class Cart {
    private int qtyOrdered = 0;
    public static final int maxNumOrdered = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[maxNumOrdered];
    public void addDigitalVideoDisc(DigitalVideoDisc dvdnum){
        if(qtyOrdered >= maxNumOrdered)
            System.out.println("the cart is full");
        else {
            itemsOrdered[qtyOrdered] = dvdnum;
            qtyOrdered++;
            System.out.println("added!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvdnum){
    	for (int i = 0; i < qtyOrdered; i ++) {
			if(itemsOrdered[i] == dvdnum) {
				//shift to fill the gap
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println(" removed.");
				return;
			}
		}
		System.out.println(" not found ");
    }

    public float calculateCost(){
        float totalCost = 0f;
        for(int k = 0; k < qtyOrdered; k++){
            totalCost += itemsOrdered[k].getCost();
        }
        return totalCost;
    }
}
