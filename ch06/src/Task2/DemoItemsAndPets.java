package Task2;

// Main Testing Class
public class DemoItemsAndPets {
    //Main Method
    public static void main(String[] args) {
        //Instance Variable
        ItemSold myitem = new ItemSold(4209532, "Doggie Treats", 10);
        PetSold mypet = new PetSold(754098, "Labradoodle", 2000, true, true, false);

        //Item Object Information
        System.out.println("Item Information ("+myitem.getNumber()+")");
        System.out.println("Item Description: "+myitem.getDescription());
        System.out.println("Item Price: $"+myitem.getPrice());

        System.out.println(); // Add Spacer

        //Pet Object Information
        System.out.println("Pet Information ("+mypet.getNumber()+")");
        System.out.println("Pet Description: "+mypet.getDescription());
        System.out.println("Pet Price: $"+mypet.getPrice());
        System.out.println("Pet Details");
        System.out.println("\tVaccinated: "+mypet.isVaccinated());
        System.out.println("\tNeutered: "+mypet.isNeutered());
        System.out.println("\tHousebroken: "+mypet.isHousebroken());
    }

}
