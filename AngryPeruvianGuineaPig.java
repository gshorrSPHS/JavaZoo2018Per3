public final class AngryPeruvianGuineaPig extends GuineaPig
{
    public AngryPeruvianGuineaPig()
    {
        super(10, "Angry Peruvian Guinea Pig",
        "This guinea pig needs a little more attention than most other breeds of guinea pig, mainly due to its long hair.");
    }
    
    @Override
    public String makeNoise()
    {
        return "It chatters its teeth and aggressively growls.";
    }
}