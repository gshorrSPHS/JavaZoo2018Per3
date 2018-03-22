public class WarGriffin extends Griffin
{
    public WarGriffin()
    {
        super(9000, "War Griffin",
            "The war griffin is used to denote strength and military \n"+
            "courage and leadership");
            
    }
   
    @Override
    public String makeNoise()
    {
        return "Skrraaaa skeeeet: " + super.makeNoise();
    }
}
