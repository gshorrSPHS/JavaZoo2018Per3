package pairProject.pairProject.zoo;


public class Elephant extends Animal implements Running, Swimming, Flying
{
    private int cuteness;
    
    public Elephant(int cuteness, String name, String Description)
    {
        super("Elephant", "Elephants are amazing!!!");
        this.cuteness = cuteness;
    }
    
    @Override
    public String eat()
    {
        return "Elephants eat grasses, small plants, bushes, fruit,"
                + "\n" + "and many other types of vegetation.";
    }
    
    @Override
    public String play()
    {
        return "Elephants love to play in the mud!";
    }
    
    @Override
    public String makeNoise()
    {
        return "*trumpet sounds*";
    }
    
    @Override
    public String swim()
    {
        return "Elephants CAN swim!" + "\n" 
                + "Their trunks act as a snorkel which allows them to breathe underwater!";
    }
    
    @Override
    public String fly()
    {
        return "Elephants can't fly...unless they are Dumbo.";
    }
    
    @Override
    public String run()
    {
        return "Elephants don't run in a classical sense, they kind of just speedwalk.";
    }
}