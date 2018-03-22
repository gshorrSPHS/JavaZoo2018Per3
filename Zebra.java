

public class Zebra extends Animal implements Running, Swimming//, Jumping
{
    
    private int noiseCount;
    
    public Zebra(int noiseCount ){
        
        super("Z the Zebra", " Like a horse but not");
        this.noiseCount= noiseCount;
        //this.jumpNumber = jumpNumber;
    }
     public Zebra(int noiseCount, String name, String desc)
    {
        super(name, desc);
        this.noiseCount = noiseCount;
    }
    
    @Override
    public String makeNoise()
    {
        
      return "eh qh eh qh " + noiseCount + " times" ;
        
    }
    @Override
    public String eat()
    {
        return "yummy grass";
    }
    @Override
    public String play()
    {
        return "chase other zebras for fun";
    }
    @Override
    public String run()
    {
        return "runs very often with friends";
    }
    
    @Override
    public String swim()
    {
        return "Swims with his mates";
    }
    
    //@Override
    //public String jump()
    //{
      //  return "Z the Zebra jumps: " + jumpNumber + " ft";
    //}
}
