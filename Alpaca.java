public class Alpaca extends Animal implements Running, Spitting
{
    private int cuteness, ugliness;
    
    public Alpaca(int cuteness)
    {
        super("Alpacalypse", "An unfortunate, hairy, spitting sheep pony");
        this.cuteness = cuteness;
    }
    
    public Alpaca(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "It only plays with its friends.";
    }
    
    @Override
    public String eat()
    {
        return "It eats hay.";
    }
    
    @Override
    public String makeNoise()
    {
        return "It whistles through its nostrils.";
    }
    
    @Override
    public String run()
    {
        return "It runs whenever it wants to, \n" +
               "fighting everyone and everything in its way.";
    }
    
    @Override
    public String spit()
    {
        return "If its staring at you with its ears pinned back, \n" +
               "avoid eye contact because it's going to spit on you.";
    }
}