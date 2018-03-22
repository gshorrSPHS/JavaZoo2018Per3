
public class RelaxedOtter extends Otter implements Running, Swimming
{
    // instance variables - replace the example below with your own
    private int cuteness;

    /**
     * Constructor for objects of class DeadlyOtter
     */
    public RelaxedOtter()
    {
        // initialise instance variables
        super("Otter", "This is still an otter, it is just relaxed.");
        
    }
    
    public String Bathe()
    {
        return "The otter floats on its back while it uses its front paws \n" +
        "to scrub at the rest of its body. Occasionally, it tucks its tiny \n" +
        "head in and does a lazy front flip in the water, before \n" +
        "continuing to rub away.";
    }
    
    public String laze()
    {
        return "The otter rolls over on itself while it floats lazily \n" +
        "on its back. It continues to drift around on the water, \n" +
        "relaxing. With an occasional flick of it's tail, it creates \n" +
            "a small splash.";
    }

   
}
