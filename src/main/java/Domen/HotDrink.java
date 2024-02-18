package Domen;

public class HotDrink extends Product{
    private Integer temperatura;

    public HotDrink(int price, int place, String name, long id, Integer temperatura) {
        super(price, place, name, id);
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Temperatura = " + temperatura + "°\n";
    }
}
