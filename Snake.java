public class Snake extends Animal
{
    private String shedSkin;
    private String bite;
    
    public Snake(String name, String desc, String shedSkin, String bite)
    {
        super(name, desc);
        this.shedSkin = shedSkin;
    }
    
    public Snake()
    {
        super("Snake", "He who slithers on land"); 
    }
    
    public String bite()
    {
        return "Hopefully I am not posionous :)";
    }
    
    public String shedSkin()
    {
        return "*Intense moulting occurs*";
    }
    
    @Override 
    public String play()
    {
        return "Sliently slithers through the brush undetected";
    }
    
    @Override
    public String eat()
    {
        return "*Gulps down Mouse*";
    }
    
    @Override
    public String makeNoise()
    {
        return "Hissssssssssssssssssss";
    }
}