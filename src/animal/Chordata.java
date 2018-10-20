package animal;

public class Chordata extends AnimalKingdom
{
    public String getName()
    {
        return super.getName();
    }

    public String toString()
    {
        return super.toString() + "is Chordata with name" + this.getName();
    }
}
