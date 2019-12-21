package Task2;

// Class PetSold inherits from ItemSold
public class PetSold extends ItemSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    //Raw Constructor for all values of base and inherit class
    public PetSold(int number, String description, float price, boolean vaccinated, boolean neutered, boolean housebroken) {
        super(number, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;
    }

    //Setters and Getters

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHousebroken() {
        return housebroken;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }
}
