package hust.soict.hedspi.aims.cart.Cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

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
					System.out.println("removed.");
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
	    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
			for(int i = 0; i < dvdList.length; i++) {
				if(qtyOrdered >=  maxNumOrdered) {     
					System.out.println("Cart is almost full.");
					break;
				}else {
					itemsOrdered[qtyOrdered] = dvdList[i];     
					qtyOrdered++;
					System.out.println("The disc "+ dvdList[i].getTitle() + " has been added.");
				}
			}
		}   public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    	if (qtyOrdered + 2 >maxNumOrdered) { 
	            System.out.println("Cart is almost full.");
	            return;
	        }

	    	itemsOrdered[qtyOrdered] = dvd1;
	        qtyOrdered += 1;
	        System.out.println("The disc " + dvd1.getTitle() + " has been added.");

	        itemsOrdered[qtyOrdered] = dvd2;
	        qtyOrdered += 1;
	        System.out.println("The disc " + dvd2.getTitle() + " has been added.");

		}

	    public void print() {
	    	System.out.println();
	    	System.out.println("**************CART**************");
	    	System.out.println("Ordered Items");
	    	for (int i = 0; i < qtyOrdered; i++) {
	     		System.out.print(i+1 +". " +  itemsOrdered[i].toString() ); // Dùng toString()
	    		System.out.println();
	    	}
	    	System.out.println();
	    	System.out.println("Total cost: "+  calculateCost()); 
	    	System.out.println("********************************");
	    }
	    public void searchById(int id) {
	    	boolean found = false; 
	    	for(int i = 0; i < qtyOrdered; i++) {
	    		if(itemsOrdered[i].getId() == id) {
	    			System.out.println(" DVD với ID: " + id);
	    			found = true;  
	    			System.out.println(itemsOrdered[i].toString());
	    			break;
	    		}
	    	}
	    	if(found == false) System.out.println("Không tìm thấy đĩa DVD có ID: " + id);
	    }

	    public void searchByTitle(String title) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].isMatch(title)) {
	                System.out.println("Tìm thấy DVD với tiêu đề: " + title);
	                System.out.println(itemsOrdered[i].toString());
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Không tìm thấy đĩa DVD có tiêu đề: " + title);
	        }
	    }
}