package animal;

public class Human extends Mammal
{
    /**
     * Prints a statement about who (the Human) can bend thumbs
     */
    public void bendThumb()
    {
        System.out.println(this.getName() + "can bend thumbs!");
    }
}
