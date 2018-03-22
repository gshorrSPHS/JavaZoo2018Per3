public class Pingu extends Animal implements Running
{
    int noots;
    public Pingu(int noots)
    {
        super("Pingu", "A happy penguin that speaks Pinguish");
        this.noots = noots;
    }
    
    public Pingu (int noots, String name, String desc)
    {
        super(name, desc);
        this.noots = noots;
    }
    
    @Override
    public String run()
    {
        return "Pingu waddles across the ice with determination.";
    }
    
    @Override
    public String makeNoise()
    {
        String talk = "";
        for(int i = 0; i < noots; i++)
        {
            talk = talk + "noot ";
        }
        return talk;
        //return "Pingu noots " + noots + " times"; 
    }
    
    @Override
    public String eat()
    {
        return "Pingu shoves a whole fish down his throat and" +
               "\ndowns his glass of chocolate milk";
    }
    
    @Override
    public String play()
    {
        return "Pingu skates across the ice in his ice skates";
    }
}