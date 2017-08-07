package ua.epam.myroniuk.behavioral.chain_of_responsibility;

/**
 * Created by Vitalii on 06.08.2017.
 */
public abstract class Handler {
    private Handler next;

    // this method helps to build a chain
    public Handler linkWith(Handler next) {
        this.next = next;
        return next;
    }

    // this method starts checking in the next handler or finishes it if we are in the last handler.
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return false;
        } else {
            return next.check(email, password);
        }
    }

    // in this method subclasses has to implement a concrete checking.
    public abstract boolean check(String email, String password);
}
