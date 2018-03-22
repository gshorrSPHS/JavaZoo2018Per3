public class Cat extends Animal implements Running
{
    private int cuddleFactor;
    
    public Cat(int cuddleFactor, String name, String description)
    {
        super(name, description);
        this.cuddleFactor = cuddleFactor;
    }
    
    public Cat(int cuddleFactor)
    {
        super("Meowster", "Fat cat");
        this.cuddleFactor = cuddleFactor;
    }
    
    @Override
    public String makeNoise()
    {
        return "Meow!";
    }
    
    @Override
    public String eat()
    {
        return "Gracefuly settles down and then stuffs face with food.";
    }
    
    @Override
    public String play()
    {
        return "Chases laser pointer around the room for " + cuddleFactor + " minutes.";
    }
    
    @Override
    public String run()
    {
        return "The cat zips up the stairs, and then down, and all over the house.";
    }
}