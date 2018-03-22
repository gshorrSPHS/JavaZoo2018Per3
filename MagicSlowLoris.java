import javax.swing.JOptionPane;
public class MagicSlowLoris extends SlowLoris
{
    
    public MagicSlowLoris()
    {
        super("Magic Slow Loris",
              "This is a magic boi. Watch out for his special abilities",
              100, 5000);
    }

    public void doMagic() {
        JOptionPane.showMessageDialog(null, "Escape while you can!",
                                      "HE DOIN BIG MAGIC BOI STUFF",
                                      JOptionPane.ERROR_MESSAGE);
                                      
        
        
    }
}
