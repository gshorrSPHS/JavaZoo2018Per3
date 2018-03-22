

public class Platycorn extends Platypus implements Flying
{
     
    
    public Platycorn()
    {
        super( "Platycorn", "The righteous hybrid of nature, \n" + 
        "it does everything a platypus does, \n" + 
        "but more magical.");

    }
    
    @Override
    public String play()
    {
        return "The platycorn plays with glitter.";
    }
    
    @Override
    public String eat()
    {
     return "The platycorn is a carnivore that mostly eats \n" + 
     "fairies, gnomes, humming fish, and butterflies";   
    }
    
    @Override
    public String makeNoise()
    {
     return "The platycorn makes a krrrrrr sound.";   
    }
    
    @Override
    public String run()
    {
     return "The platycorn waddles majestically.";   
    }
    
    @Override
    public String swim()
    {
     return "The platycorn is able to swim fast" + 
     "because of it's sparkly webbed feet.";   
    }
    
    @Override
    public String fly()
    {
     return "The platycorn is able to fly" + 
     "because of it's magic light dancing.";   
    }
}
