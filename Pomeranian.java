
public class Pomeranian extends Animal implements Running, Swimming, Flying
{
   private int tailLength = 7;
   private String name;
   
   //To allow the subclass to have its own name and desc:
   public Pomeranian(int tailLength, String name, String desc)
   {
       super(name, desc);
       this.name = name;
   }
   
   @Override
   public String eat()
   {
       return "cannot live without having boiled live and chicken";
   }
   
   @Override
   public String play()
   {
       return "goes to lay down in blanket with soft pillows around it";
   }
   
   @Override
   public String swim()
   {
       return "loves swimming since he can swim very well";
   }
   
   @Override
   public String run()
   {
       return "enjoys running with his short legs";
   }
   
   @Override
   public String fly()
   {
       return "tries to get his feet off the ground, but he fails";
   }
   
   @Override
   public String makeNoise()
   {
       return "arf-arf";
   }
}
