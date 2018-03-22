public class Crube extends Animal implements Running
{
    public Crube()
    {
        super("Crube", "This is my name for a cube in 3.5 dimensions");

    }

    public Crube(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String run()
    {
        return "The Crube turns over onto its sides, edges, faces, and vertices.";
    }

    @Override
    public String play()
    {
        return "The Crube does not play, for it forgot how to many moons ago, when it ended its \nchildhood and became fully grown."; 
    }

    @Override
    public String eat()
    {
        return "The Crube generates energy from the angiush of Moone students.";
    }

    @Override
    public String makeNoise()
    {
        return "The Crube radiates heat.";
    }
}