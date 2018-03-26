public class MantisShrimp extends Animal implements Swimming
{
    private int punchSpeed;
    
    public MantisShrimp(int punchSpeed)
    {
        super("Skittles", "A colorful lobster with a gun.");
        this.punchSpeed = punchSpeed;
    }
    
    public MantisShrimp(int punchSpeed, String name, String desc)
    {
        super(name, desc);
        this.punchSpeed = punchSpeed;
    }
    
    @Override
    public String play()
    {
        return "Mantis Shrimp don't mess with anyone.";
    }
    
    @Override
    public String eat()
    {
        return "Om nom nomming on the corpses of its fallen enemies.";
    }
    
    @Override
    public String makeNoise()
    {
        return "What noises does a lobster make?";
    }
    
    @Override
    public String swim()
    {
        return "Floating along the ocean floor.";
    }
}