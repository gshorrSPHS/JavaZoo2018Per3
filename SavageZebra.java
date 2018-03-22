

public final class SavageZebra extends Zebra
{
    public SavageZebra()
    {
       super(100, "SavageZebra", "Z the Zebra's SAVAGE friend");
        
    }
    
    @Override
    public String makeNoise()
    {
      return "Grrrrrrrrrr " + super.makeNoise(); 
    }
    @Override
    public String run()
    {
      return "Runs faster than the flash with anger";  
        
    }
}
