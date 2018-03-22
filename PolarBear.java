public class PolarBear extends Animal implements Swimming, Running
{
  private int roughness;
  
  public PolarBear(int roughness)
  {
      super("Billy the Polar Bear", "A white ferocious ball with fur");
      this.roughness = roughness;
  }
public PolarBear(int roughness, String name, String desc)
{
   super(name, desc);
   this.roughness =roughness;
}  
  
  @Override
  public String makeNoise()
  {
      return "ggrrrrrrh" + roughness + "times";
  }
  @Override
  public String eat()
  {
      return "mostly colorful fish";
  }
  @Override
  public String play()
  {
      return "chase any animals that comes in sight";
  }
  @Override
  public String swim()
  {
      return "swims to relax or eat to animals in the sea";
  }
  @Override
  public String run()
  {
      return "only runs to eat animals as it is very hungry";
  }
}
