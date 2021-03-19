import java.util.Scanner;

public class Item {

    //MEM VARS
    private int id = 0;
    private String name;
    private double price = 0;

    //DEFAULT 
    public Item() {
        System.out.println("Item created");
    }

    //CONSTRUCTOR
    public Item(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;

    }

    //TOSTRING()
    public String toString() {
        return "ID: " + id + " Name: " + name + " Price: $" + price;
    }
    
    public static void main(String[] args) {
        
        Item[] items = new Item[3];
        Scanner sc = new Scanner(System.in);
        int typeInput;
        int id = 0;
        String name;
        double price;

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter type of item: (1) for Grocery, (2) for Clothing, (3) for Pharmacy, (4) for done");
            typeInput = Integer.valueOf(sc.nextLine());
            switch(typeInput) {
                case 1:
                    System.out.println("Enter id: ");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.println("Enter name: ");
                    name = sc.nextLine();
                    System.out.println("Enter price: ");
                    price = Double.valueOf(sc.nextLine());
                    
                    items[i] = new Grocery(id, name, price);
                    
                    System.out.println("New Grocery item added..");
                    break;
                case 2: 
                    System.out.println("Enter id: ");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.println("Enter name: ");
                    name = sc.nextLine();
                    System.out.println("Enter price: ");
                    price = Double.valueOf(sc.nextLine());
                    
                    items[i] = new Clothing(id, name, price);
                    
                    System.out.println("New Clothing item added..");
                    break;
                case 3:
                    System.out.println("Enter id: ");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.println("Enter name: ");
                    name = sc.nextLine();
                    System.out.println("Enter price: ");
                    price = Double.valueOf(sc.nextLine());
                    
                    items[i] = new Pharmacy(id, name, price);
                    
                    System.out.println("New Pharmacy item added..");
                    break;
                case 4:
                    System.out.println("Done..");
                    break;
            }
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }



        sc.close();

    }
    
    //GETTERS AND SETTERS
    public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

interface FivePercentTaxRate {
    void fiveTax();
}

interface SevenPercentTaxRate {
    void sevenTax();
}

interface TenPercentTaxRate {
    void tenTax();
}
class Grocery extends Item implements FivePercentTaxRate {
    public Grocery(int id, String name, double price) {
        super(id, name, price);
    }

    double taxAmount;
    double finalAmount;

    //GETTERS AND SETTERS

    public double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getFinalAmount() {
        return this.finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    //METHOD

    public void fiveTax() {
        taxAmount = this.getPrice() * 5/100;
        finalAmount = this.getPrice() + taxAmount;
        System.out.println("Tax applied..");
    }

}

class Pharmacy extends Item implements SevenPercentTaxRate {
    public Pharmacy(int id, String name, double price) {
        super(id, name, price);
    }
    
    double taxAmount;
    double finalAmount;

    //GETTERS AND SETTERS

    public double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getFinalAmount() {
        return this.finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    //METHOD

    public void sevenTax() {
        taxAmount = this.getPrice() * 7/100;
        finalAmount = this.getPrice() + taxAmount;
        System.out.println("Tax applied..");
    }
    
}

class Clothing extends Item implements TenPercentTaxRate {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double taxAmount;
    double finalAmount;

    //GETTERS AND SETTERS

    public double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getFinalAmount() {
        return this.finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    //METHOD

    public void tenTax() {
        taxAmount = this.getPrice() * 10/100;
        finalAmount = this.getPrice() + taxAmount;
        System.out.println("Tax applied..");
    }
}