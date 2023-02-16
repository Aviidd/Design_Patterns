package ISP;

public class Waiter implements RestaurantEmployee{
    @Override
    public void WashDishes() {
        // not my job
    }

    @Override
    public void ServeCustomer() {
        System.out.println("i am serving to customer");
    }

    @Override
    public void cookFood() {
        //not my job
    }
}
