public final class StuffedSmolSloth extends SmolSloth
{
    public StuffedSmolSloth()
    {
        super(10, "Stuffed Smol Sloth", 
        "This is stuffed toy sloth diguised by an actual Sloth");
    }
    
    @Override
    public String makeNoise()
    {
        return "Hug Me: " + super.makeNoise();
    }
}