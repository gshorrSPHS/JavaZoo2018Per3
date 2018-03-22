public class Tardigrades extends Animal implements Swimming, Running
{
    private int harmless;
    
    public Tardigrades()
    {
        super("Water Bear", "A micro bear.:)");
    }
    
    public Tardigrades(int harmless, String name, String desc)
    {
        super(name, desc);
        this.harmless = harmless;
    }
    
    public String name()
    {
        return "Normal T";
    }
    
    @Override
    public String swim()
    {
        return "It swims beside moss.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Can't really make noises.";
    }
    
    @Override
    public String eat()
    {
        return "They eat rotifers and other tardigrades.";
    }
    
    @Override
    public String play()
    {
        return "They roll in between the mosses.";
    }
    
    @Override
    public String run()
    {
        return "They run in slow motion.";
    }
}
