public class MagicTardigrades extends Tardigrades implements Flying
{
    public MagicTardigrades()
    {
        super(10, "Magic Tardigrades", "This is a flying micro bear!");
    }
    
    public String name()
    {
        return "Kami T";
    }
    
    @Override
    public String fly()
    {
        return "Can't only live on the ground any more, they are in the sky now, and they got wings!";
    }
}
