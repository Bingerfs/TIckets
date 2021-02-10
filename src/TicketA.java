public class TicketA implements Ticket {
    private String name = "";
    private String details = "";
    private Double price;

    public TicketA(String name, String details, Double price){
        this.name = name;
        this.details = details;
        setPrice(price);
    }

    @Override
    public void setPrice(Double price){
        if(price >= 0)
            this.price = price;
        else
            System.out.println("error setting price");

    }

    @Override
    public Double getPrice() {
        return price;
    }
}
