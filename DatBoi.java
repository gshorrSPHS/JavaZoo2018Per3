public class DatBoi extends Animal implements Running
{
    private int numOfFans;
    public DatBoi(int time)
    {
        super("Dat Boi,AKA: Poison Dart Frog", "Basically, a cool frog on a unicycle.");
        this.numOfFans = numOfFans;
    }
    
    @Override
    public String play()
    {
        return "The animal acts snobbish and rolls around on his uncycle, he does not play... he is dat boi";
    }
       
    @Override
    public String eat()
    {
        return "The animal eats all of the attention he recieves for being so cool, and there are " + numOfFans + "fans.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Dat boi does not make noise, the only noises the cheers and wows from other people around him.";
    }
    
    @Override
    public String run()
    {
        return "He does not run, he rolls around rather on a unicycle... and he's pretty fast.";
    }
}