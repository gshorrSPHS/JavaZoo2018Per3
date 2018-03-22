package pairProject.pairProject.zoo;



public final class Dumbo extends Elephant
{
    public Dumbo()
    {
        super(10, "Dumbo", "Dumbo is an elephant with extraordinarily" 
                    +"\n" + "large ears that allow him to fly!");
    }
    
    @Override
    public String fly()
    {
        return "Due to his large ears, Dumbo can fly!! :D";
    }
}
