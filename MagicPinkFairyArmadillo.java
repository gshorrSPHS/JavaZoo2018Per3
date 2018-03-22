public final class MagicPinkFairyArmadillo extends PinkFairyArmadillo
{
    public MagicPinkFairyArmadillo()
    {
        super(10, "Magic Pink Fairy Armadillo", 
        "This is a wizard disguised as an Aramdillo");
    }
    
    @Override
    public String makeNoise()
    {
        return "Expectum Abracadabra: " + super.makeNoise();
    }
}
