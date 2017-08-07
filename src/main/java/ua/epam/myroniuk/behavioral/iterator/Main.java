package ua.epam.myroniuk.behavioral.iterator;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext(); ){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
