public class SeaSnake extends Snake implements Swimming 
{
    private String breathe;
    
    public SeaSnake(String breathe)
    {
        super("Seasnake", "A snake in water", "Often", "Rarely");
        this.breathe = breathe;
    }
    
    public String breathe()
    {
        return "*gasp*";
    }
    
    @Override 
    public String swim()
    {
        return "Slithering in water";
    }
    
    
}