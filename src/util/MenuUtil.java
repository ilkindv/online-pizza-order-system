package util;

public class MenuUtil {
    private static MenuUtil instance;
    private MenuUtil(){}

    public static MenuUtil getInstance() {
        return instance ==  null ? instance = new MenuUtil()  : instance;
    }
    public byte entryMenu(){
        System.out.println("""
                --------- / Online Pizza Ordering system / ----------
                [0] - > Exit
                [1] - > Admin
                [2] - > Customer
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Choose option: ");
    }
    public byte adminMenu(){
        System.out.println("""
                ------------------ / Admin Panel / ------------------
                [0] - > Exit
                [1] - > Back
                [2] - > Add Courier
                [3] - > Track Orders
                [4] - > View Couriers
                [5] - > View Customers
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Choose option: ");
    }
    public byte customerMenu(){
        System.out.println("""
                ----------------- / Customer Menu / -----------------
                  [0] - > Exit
                  [1] - > Login
                  [2] - > Sing up
                  [3] - > Back
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Choose option: ");
    }
    public byte loginMenu(){
        System.out.println("""
                 [0] - > Exit
                 [1] - > Back
                 [2] - > Place Order
                 [3] - > Track Orders
                 [4] - > Cancel Order
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Choose option: ");
    }
    public byte pizzaMenu(){
       System.out.println("""
               ------------------- / Pizza Type / ------------------
               [1] -> Italiano
               [2] -> Americano
               [3] -> Mexicano
               [4] -> Chicken Kickers
               [5] -> Margherita
               -----------------------------------------------------
               """);
        return InputUtil.getInstance().inputByte("Choose pizza: ");
    }
    public byte sizeMenu(){
        System.out.println("""
                ------------------- / Pizza Size / ------------------
                 [1] -> Small
                 [2] -> Medium (+6.99 AZN)
                 [3] -> Large (+13.99 AZN)
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Choose pizza size: ");
    }
    public byte sousMenu(){
        System.out.println("""
                --------------------- / Sous / ---------------------
                 [1] -> Ketcup (+0.7 AZN)
                 [2] -> Barbecue (+0.7 AZN)
                 [3] -> Mayonnaise (+0.7 AZN)
                 [4] -> Cancel
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Choose sous: ");
    }

    public byte paymentMenu(){
        System.out.println("""
                ------------------- / Payment / --------------------
                 [1] - > Make the payment
                 [2] - > Cancel order
                -----------------------------------------------------
                """);
        return InputUtil.getInstance().inputByte("Enter the option: ");
    }
}
