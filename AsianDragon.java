public class AsianDragon extends Dragon
{
    public AsianDragon()
    {
        super(99999, "Asian Dragon","Snake-like auspicious power holder, They breathe clouds,\n" +
            "move the seasons, and control the waters of rivers, lakes, and seas."); 
    }
    
    @Override
    public String makeNoise()
    {
        return "SHEEEEEEK: " + super.makeNoise();
    }
    
    @Override
    
    public String fly()
    {
        return "When they fly up to sky with Cintamani, Dragon grants a wish for human";
    }
}