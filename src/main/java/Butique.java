import java.util.ArrayList;
import java.util.Date;

/**
 * Created by dominik on 27.05.2017.
 */
public class Butique {

    private ArrayList<Boots> bootsList = new ArrayList<Boots>();
    private int sum;
    private Date discountDate = new Date();
    private String name;

    public Butique(String name) {
        this.name = name;
        System.out.println("Butique: " + name + " created");

    }
}
