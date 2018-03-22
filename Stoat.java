public class Stoat extends Animal implements Running
{
    public Stoat()
    {
        super("Stoat", "A cute sausage with legs.");
    }
    
    public Stoat(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The stoat runs around in circles, chasing its tail.";
    }
    
    @Override
    public String eat()
    {
        return "It returns with a mouse in its mouth, ready to eat.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Tweet?";
    }
    
    @Override
    public String run()
    {
        return "It runs at insane speeds, instantly catching to its prey.";
    }
}
