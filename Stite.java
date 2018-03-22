public final class Stite extends Stoat
{
    public Stite()
    {
        super("Stite", "This is the stoat king, King Stite");
    }
    
    @Override
    public String eat()
    {
        return "It doesn't eat like its barbaric subjects, it dines solely on premium roast beef.";
    }
    
    @Override
    public String makeNoise()
    {
        return "SERVE ME!";
    }
    
    @Override
    public String play()
    {
       return "It doesn't play, playing is too childish and barbaric for the king.";
    }
    
    @Override
    public String run()
    {
        return "Run? It doesn't run, it is carried on a palanquin.";
    }
}
