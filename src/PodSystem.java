public class PodSystem {
    private int id;
    private String name;
    private int price;
    private String publisher;
    private String tankSystem;
    private int tankPrice;
    private boolean podCondition;
    private boolean tankCondition;
    public static int count = 1;

    public PodSystem(){

    }

    public PodSystem(String name, int price, String publisher,
                     String tankSystem, int tankPrice, boolean podCondition,
                     boolean tankCondition) {
        this.id = count++;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
        this.tankSystem = tankSystem;
        this.tankPrice = tankPrice;
        this.podCondition = podCondition;
        this.tankCondition = tankCondition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTankSystem() {
        return tankSystem;
    }

    public void setTankSystem(String tankSystem) {
        this.tankSystem = tankSystem;
    }

    public int getTankPrice() {
        return tankPrice;
    }

    public void setTankPrice(int tankPrice) {
        this.tankPrice = tankPrice;
    }

    public boolean isPodCondition() {
        return podCondition;
    }

    public void setPodCondition(boolean podCondition) {
        this.podCondition = podCondition;
    }

    public boolean isTankCondition() {
        return tankCondition;
    }

    public void setTankCondition(boolean tankCondition) {
        this.tankCondition = tankCondition;
    }

    @Override
    public String toString() {
        return "PodSystem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", tankSystem='" + tankSystem + '\'' +
                ", tankPrice=" + tankPrice +
                ", podCondition=" + podCondition +
                ", tankCondition=" + tankCondition +
                '}';
    }
}
