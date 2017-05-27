/**
 * Created by dominik on 27.05.2017.
 */
public class Boots {

    private int price;
    private boolean isNew;
    private enum size {small, medium, big};
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

}
