
public class Leopard extends Animal implements Running,Swimming,Sleeping 
{
    private int cuteness;
    
    public Leopard(int cuteness)
    {
        super("Spotted Jet Leopard", "A big spotted cat with Nasty intentions");
        this.cuteness = cuteness;
    }
    //To allow the subclass to have its own name and desc:
    public Leopard(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    //since Animals makeNoise, eat, and play differently,
    //we make these abstract so the subclass is forced to 
    //override the methods and define how they do those actions
    //themselves
    
    @Override
    public String makeNoise()
    {
        return "*growling noise*";
    }
    
    @Override
    public String eat()
    {
        return "Leopards eat small hoofstock such as gazelle, impala,deer and wildebeast, \n" 
                + "on occasion they also eat monkeys,rodents, and birds."; 
    }
    
    @Override
    public String run()
    {
        return "Leopards are extremely fast and can run up to 36 m/hr.";
    }

    @Override
    public String swim()
    {
        return "Leopards are very agile and good swimmers.";
    }
    
    @Override
    public String play()
    {
        return "Leopards are solitary, preferring to live alone.";
    }
    
    @Override
    public String sleep()
    {
        return "Leopards are nocturnal animals, meaning they are active at night. ";
    }
}