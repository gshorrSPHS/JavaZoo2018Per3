public class AngryPingu extends Pingu
{
    int angriness;
    public AngryPingu(int angriness)
    {
        super(10, "Angry Pingu", "Pingu is angry and noots agressively");
        this.angriness = angriness;
    }
    
    @Override
    public String makeNoise()
    {
        String talk = "";
        for(int i = 0; i < angriness; i++)
        {
            talk = talk + "NOOT ";
        }
        return talk;
    }
}