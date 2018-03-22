public class SlowLoris extends Animal implements Running
{
    private int eyeSize, howSlow;
    /**
     * Constructor for objects of class SlowLoris
     */
    public SlowLoris(int eye, int slow)
    {
        super("Slow Loris.", "A cute round boi.");
        this.eyeSize = eye;
        this.howSlow = slow;
    }

    public SlowLoris(String name, String desc, int eye, int slow) {
        super(name, desc);
        this.eyeSize = eye;
        this.howSlow = slow;
    }

    @Override
    public String play() {
        return "The slow loris bops the lil ball. \n" +
        "Their big eyes widen to a diameter of " + eyeSize +
        " inches.";
    }

    @Override
    public String eat() {
        if(howSlow == 1 || howSlow == -1) {
            return "They be eatin' rice at a rate of " + 
            howSlow + " grain per minute";
        }
        else {
            return "They be eatin' rice at a rate of " + 
            howSlow + " grains per minute";
        }
    }
    
    @Override
    public String makeNoise() {
        return "They make a funny noise... \"Yuhhhh\".";
    }

    public String run() {
        return "WEEEEE THEY RUNNIN'!";
    }
}
