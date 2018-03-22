//we don't want to be able to instantiate Animal
//It's a concept more than a concrete thing.
//we make it an ABSTRACT class
public class SmolSloth extends Animal implements Sleeping, Climbing
{
    private int cuteness;
    
    public SmolSloth(int cuteness)
    {
        super("Cute Lil Sloth ", "A Furry Smol Teddy Bear ");
        this.cuteness  = cuteness;
    }
    //All animals getName & getDescription in the same way
    //so those methods can be defined--don't need to be abstract
    public SmolSloth(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    //since Animals makeNoise, eat, and play differently,
    //we make these abstract so the subclass is forced to 
    //override the methods and define how they do those actions
    //themselves
    
    @Override
    public String makeNoise()
    {
        return "*squeaking noise*";
    }
    @Override
    public String eat()
    {
        return "A Sloths diet consists mainly of leaves. They are generalizes as \n"+ 
               " herbivores and can feed from over 50 different types of trees in \n" +
               "the American tropical rainforest.";
    }
    @Override
    public String play()
    {
        return "Sloths don't really play, they remain motionless";
    }
    @Override
    public String sleep()
    {
        return "Sloths can sleep from up to 15 to 20 house";
    }
    @Override
    public String climb()
    {
        return "Sloths can climb from 6 to 8 feet per minute.";
    }
}