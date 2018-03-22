
/**
 * Write a description of class Otter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Otter extends Animal implements Running, Swimming
{
    // instance variables - replace the example below with your own
    private int cuteness;
    private String name, description;

    /**
     * Constructor for objects of class Otter
     */
    public Otter(int cuteness)
    {
        // initialise instance variables
        super("Otter", "These are Carnivorous mammals in \n"
        + "the subfamily Lutrinae. The 13 extant otter species are \n"
        +"all semiaquatic, aquatic or marine, with diets based on \n" +
            "fish and invertebrates.");
        this.cuteness = cuteness;
    } 
    
    public Otter(String name, String description)
    {
        // initialise instance variables
        super(name, description);
        
     }

    @Override
    public String play()
    {
         return "The otter splashes around in its little pool, chasing \n" +
            "A toy shaped like a fish.";
    }
    
    @Override
    public String eat()
    {
        return "The otter floats on its back in the water, \n" +
            "using its tiny paws as it nibbles and gnaws on the \n" +
            "clam it holds.";
    }
    
    @Override
    public String makeNoise()
    {
        return "The otter makes a chirping sound" + cuteness + "times, \n" +
                "Showing how happy it is.";
    }
    
    public String run()
    {
     return "The otter dashes on all fours in an adorable manner.";
    }
    
    public String swim()
    {
    return "The otter streamlines its body as it dives, \n" +
    "each paw paddling and letting it move with ease.";
    }

}
