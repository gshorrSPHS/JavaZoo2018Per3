
public class Pomsky extends Pomeranian
{
    public Pomsky(int tailLength)
    {
        super(tailLength, "Pomsky", "a puppy who shares the traits of Husky and Pomeranian");
    }
    
    @Override
    public String makeNoise()
    {
        return "*loud barking" + "woof-woof";
    }
    
}
