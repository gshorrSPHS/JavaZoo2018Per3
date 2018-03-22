public class Dragon extends Animal implements Swimming, Flying
{
    private int strength;
    
    public Dragon(int strength)
    {
        super("Dragon","Snake-like auspicious power holder, They breathe clouds,\n" +
            "move the seasons, and control the waters of rivers, lakes, and seas.");
        this.strength = strength;
    }
    
    public Dragon(int strength, String name, String description)
    {
        super(name, description);
        this.strength = strength;
    }
    
    @Override
    public String play()
    {
        return "It burns villages and castles and collect gold.";
    }
    
    @Override
    public String eat()
    {
        return "It eats meats, like animals, humans.";
    }
    
    @Override
    public String makeNoise()
    {
        return "It says growl" + strength + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It plunges into the ocean, making tsunami all over the place.";
    }
    
    @Override
    public String fly()
    {
        return "They fly up to sky and take a break on the cloud.";
    }
}