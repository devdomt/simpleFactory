/**
 * Created by dominik on 27.05.2017.
 */
public class RussianBootFactory extends BootsFactory{

    @Override
    public Boots makeNewBoots(String type) {

        if (type.equals("old russian karasky")) {
            return new Boots();
        }
        else if (type.equals("fashionable straight from moscowe")) {
            return new Boots();
        }
        else if (type.equals("new vladivostock boots")) {
            return new Boots();
        }
        return new Boots();
    }
}
