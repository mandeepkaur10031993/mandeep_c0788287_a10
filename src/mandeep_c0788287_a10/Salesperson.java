package mandeep_c0788287_a10;

public abstract class Salesperson {
    double sales;
    double advance;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    abstract void display();
}
