public final class SavagePolarBear extends PolarBear
{
    public SavagePolarBear()
    {
       super(10, "SavagePolarBear", "A Polar Bear on steroids!!!");
    }      
    @Override
    public String makeNoise()
    {
         return "ggrrrrhhhhh ggrrrhhhhh: " + super.makeNoise();
    } 
     @Override
    public String run()
    {
         return "runs with more enthusiasm and violence";
    }
}   