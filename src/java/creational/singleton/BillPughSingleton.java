package creational.singleton;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class BillPughSingleton {
    // constructor
    private BillPughSingleton(){
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
