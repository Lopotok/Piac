import java.util.Map;

public class Aru {


    //név; egység; ár (Ft-ban); hatósági áras-e; kategória (sós/édes)

    private String name;

    private String quantity;

    private int price;

    private boolean govermentPrice;

    private Izek iz;

    public Aru(String name, String quantity, int price, boolean govermentPrice, Izek iz) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.govermentPrice = govermentPrice;
        this.iz = iz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isGovermentPrice() {
        return govermentPrice;
    }

    public void setGovermentPrice(boolean govermentPrice) {
        this.govermentPrice = govermentPrice;
    }

    public Izek getIz() {
        return iz;
    }

    public void setIz(Izek iz) {
        this.iz = iz;
    }

    @Override
    public String toString() {
        return "Aru{" +
                "name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price=" + price +
                ", govermentPrice=" + govermentPrice +
                ", iz=" + iz +
                '}';
    }
}

