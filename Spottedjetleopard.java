public final class Spottedjetleopard extends Leopard
{
    public Spottedjetleopard()
    {
        super(10, "Spottedjetleopard", 
        "This is a vacuum disguised as an Leopard");
    }
    
    @Override
    public String makeNoise()
    {
        return "*vacuuming noise*: " + super.makeNoise();
    }
}
