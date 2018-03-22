public class SwimmingCat extends Cat implements Swimming
{
    public SwimmingCat(int cuddlingFactor, String name, String description)
    {
        super(cuddlingFactor, name, description);
    }
    
    public SwimmingCat(int cuddlingFactor)
    {
        super(cuddlingFactor, "Meowster", "Fat cat");
    }
    
    @Override
    public String swim()
    {
        return "Despite not liking water, the cat swims";
    }
    
    public String breathe()
    {
        return "The cat calmly takes a breathe, and then goes back to swimming.";
    }
    
    @Override
    public String makeNoise()
    {
        return "The cat angrily says \"meow\" out of indignation since it is in water.";
    }
}