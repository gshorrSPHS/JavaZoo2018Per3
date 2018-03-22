public class PinkFairyArmadillo extends Animal implements Running, Swimming
{
    private int cuteness;
    
    public PinkFairyArmadillo(int cuteness)
    {
        //super comes first in the constructor
        super("Pink Fairy Armadillo", "A tiny sashimi with legs.");
        this.cuteness = cuteness;
    }
    
    //To allow the subclass to have its own name and desc:
    public PinkFairyArmadillo(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The armadillo frolics around in a bowl of wasabi.";
    }
    
    @Override
    public String eat()
    {
        return "It eats sticky rice.";
    }
    
    @Override
    public String makeNoise()
    {
        return "It says Rheeeeeeeeee " + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It bathes in a vat of soy sauce.";
    }
    
    @Override
    public String run()
    {
        return "It runs as quickly as its little legs can carry it, \n" + 
               "trailing soy sauce puddles behind.";
    }
}








