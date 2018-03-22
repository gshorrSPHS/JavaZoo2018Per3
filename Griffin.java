public class Griffin extends Animal implements Swimming, Running, Flying
{
    private int strength;
    
    public Griffin(int strength)
    {
        super("Griffon", "An eagle and lion mix.");
        this.strength = strength;
    }
    
    public Griffin(int strength, String name, String description)
    {
        super(name, description);
        this.strength = strength; 
    }
    
    @Override
    public String play()
    {
        return "The griffon flies around the forest looking for his next kill.";
    }
    
    @Override
    public String eat()
    {
        return "It eats everything, including humans. However, it's favorite \n" +
                "meals are sheep or rodents." ;
    }
    
    @Override
    public String makeNoise()
    {
        return "It says rawr " + strength + " times.";
    }
    
    
    @Override
    public String swim()
    {
        return "It dives into the ocean to try to catch a giant squid with its \n" +
                "large claws";
    }
    
    @Override
    public String run()
    {
        return "It runs as quick as any land animal that has ever existed."; 
    }
    
    @Override 
    public String fly()
    {
        return "It flies as fast as any bird that has ever existed.";
    }
}
