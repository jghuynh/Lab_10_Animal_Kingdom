package animal;

/**
 * A Bird that has a name and the color of the feathers.
 */
public class Bird extends Chordata

{
    private String name;
    private String featherColor;
    private String ANIMAL_GROUP = "Bird";

    /**
     * Constructs a Bird that has a name and the colors of the feather
     * @param name the bird's name
     * @param featherColor the bird's color of the feather
     */
    Bird(String name, String featherColor)
    {
        this.name = super.getName();
        this.featherColor = featherColor;
        //this.animalGroup = getBirdGroup();

    }

    public String getName()
    {
        return super.getName();
    }

    /**
     * Prints a statement about the color of the feathers
     */
    public void showFeathers()
    {
        System.out.print(this.getName() + "'s feather color is " + featherColor);
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
