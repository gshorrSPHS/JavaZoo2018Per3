

public class Platypus extends Animal implements Running, Swimming
{
    private int poisonous;
    
    public Platypus(int poisonous)
    {
     super("Platypus", "Semiaquatic egg-laying mammal of action.");
     this.poisonous = poisonous;
    }
    
    public Platypus(String name, String description)
    {
     super(name, description);   
    }
    
    @Override
    public String play()
    {
        return "It's just a platypus, \n" + "they don't do much.";
    }
    
    @Override
    public String eat()
    {
     return "The platypus is a carnivore that mostly eats \n" + 
     "worms, insect larvae, freshwater shrimp, and freshwater yabby";   
    }
    
    @Override
    public String makeNoise()
    {
     return "The platypus makes a crrrrrrr sound.";   
    }
    
    @Override
    public String run()
    {
     return "The platypus waddles adorably.";   
    }
    
    @Override
    public String swim()
    {
     return "The platypus is able to swim fast" + 
     "because of it's webbed feet.";   
    }
}
