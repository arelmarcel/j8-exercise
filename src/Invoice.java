public class Invoice {
    private Integer id;
    private String title;
    private Integer amount;
    private String customer;
    //getter
    public String getCustomer() {
        return customer;
    }

    //setter

    public void setId(Integer id) {
        this.id = id;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }


}
