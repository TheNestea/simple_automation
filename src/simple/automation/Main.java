package simple.automation;

public class Main {

    public final static String EXISTED_USER = "existed";
    public final static String NOT_EXISTED_USER = "wrong";

    public static void main(String[] args) {
        new AuthorizationTests().testLogin();

        OrderTests orderTests = new OrderTests();
        orderTests.testCreateOrder();
        orderTests.testListOrders();

        String bro;
    }

}
