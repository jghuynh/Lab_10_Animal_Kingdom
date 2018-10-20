package animal;

/**
 * A Mammal
 */
public class Mammal extends Chordata
{
    // every Mammal here has AnimalKingdom's methods, like this.getName()
    //private String name;
    private String ANIMAL_GROUP = "Mammal";

    /**
     * Constructs a Mammal that has a name (etc. Leafie, Jay, Max..)
     * @param name the Mammal's name
     */
    public Mammal(String name)
    {
        super(name); //because every Mammal already has a name from AnimalKingdom
    }

    /**
     * Prints a statement about who (name) is drinking milk.
     */
    public void drinkMilk()
    {
        System.out.println(this.getName() + "is drinking milk.");
    }

    /**
     * Gets the animal group, such as Bird or Mammal
     * @return the animal group
     */
    public String getANIMAL_GROUP()
    {
        return ANIMAL_GROUP;
    }
}
