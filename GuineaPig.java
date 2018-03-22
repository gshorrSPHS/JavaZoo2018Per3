public class GuineaPig extends Animal implements Running, Swimming
{
    int oinks;
    public GuineaPig(int oinks)
    {
        super("Guinea Pig", "A species of rodent belonging to the family Caviidae and the genus Cavia.");
        this.oinks = oinks;
    }
    
    public GuineaPig(int oinks, String name, String desc)
    {
        super(name, desc);
        this.oinks = oinks;
    }
    
    @Override
    public String run()
    {
        return "Guinea Pig runs around and stretches its legs outside its cage.";
    }
    
    @Override
    public String swim()
    {
        return "Guinea Pig swims with distress....";
    }
    
    @Override
    public String makeNoise()
    {
        return "Guinea Pig oinks " + oinks + " times.";
    }
    
    @Override
    public String eat()
    {
        return "Guinea Pig eats a lettuce.";
    }
    
    @Override
    public String play()
    {
        return "Guinea Pig takes its time observing the mysterious puzzle playground.";
    }
}