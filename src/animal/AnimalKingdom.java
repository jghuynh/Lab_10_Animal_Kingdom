package animal;

public class AnimalKingdom
{
    private String name;
    private String animal;
    private String animalGroup;
    private String DEFAULT_KINGDOM = "Animal Kingdom";

    public AnimalKingdom(String name, String animal, String animalGroup)
    {
        this.name = name;
        this.animal = animal;
        this.animalGroup = animalGroup;
        //this.DEFAULT_KINGDOM = DEFAULT_KINGDOM;
    }
    /**
     * Gets the name of the object
     * @return name the name of the object
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the name of the type of animal (Ex: Emu, Dog, Human, Kangaroo, Robin)
     * @return
     */
    public String getAnimal()
    {
        animal = this.getClass().getName(); // returns animal.Emu...What?
        return animal;
    }

    /**
     * Gets the name of the general animal group (Amphibian, Mammal, Bird)
     * @return the name of the general animal group
     */
    public String getAnimalGroup()
    {
        if (this instanceof Bird){
            animalGroup = "Bird";
        }
        else
        {
            animalGroup = "Mammal";
        }
        return animalGroup;
    }

    /**
     * Formats an animal into a prettier format: name, animalName, animalGroup, kingdom
     * @return the neater format
     */
    @Override
    public String toString()
    {
        return name + "(" + animalName + ", " + animalGroup + ", " + DEFAULT_KINGDOM + ")";
    }

}

