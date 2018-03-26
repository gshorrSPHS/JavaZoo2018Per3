public class BushBaby extends Animal implements Running
{
    private int eyeSize;
    private int bushiness;

    public BushBaby(int eye, int bushiness){
        super("Bush Baby", "Tiny nocturnal primate with big eyes.");
        this.eyeSize = eye;
        this.bushiness = bushiness;
    }

    public BushBaby(String name, String desc, int eye, int bushiness)
    {
        super(name, desc);
        this.eyeSize = eye;
        this.bushiness = bushiness;
    }
    
    @Override
    public String makeNoise()
    {
        return "goo goo ga ga";
    }

    @Override
    public String eat()
    {
        return "the bush baby eats some bugs.";
    }

    @Override
    public String play()
    {
        return "the bush baby plays with its fam.";
    }

    public String run()
    {
        return "i scamper up a tree.";
    }
    
    public int getEyeSize()
    {
        return eyeSize;
    }
    
    public void increaseEyeSize()
    {
        eyeSize += 10; 
    }
    
    public void decreaseEyeSize()
    {
        eyeSize -= 10;
    }
    
    public int getBushiness()
    {
        return bushiness;
    }
    
    public void increaseBushiness()
    {
        bushiness += 10;
    }
    
    public void decreaseBushiness()
    {
        bushiness -= 10;
    }
    
    
}
