package creational.singleton;

/**
 * Created by Vitalii on 02.08.2017.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    // constructor
    private StaticBlockSingleton(){
    }

    // static block
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Some Exception occurred.");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
