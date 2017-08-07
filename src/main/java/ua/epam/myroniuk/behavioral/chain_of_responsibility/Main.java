package ua.epam.myroniuk.behavioral.chain_of_responsibility;

/**
 * Created by Vitalii on 06.08.2017.
 */
public class Main {
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // the main magic
        Handler handler = new PasswordHandler();
        handler.linkWith(new AdminHandler());  // handler.linkWith(new Handler1()).linkWith(new Handler2())...

        // server gets a chain from the user
        server.setHandler(handler);
    }

    public static void main(String[] args) {
        init();
        server.logIn("admin@example.com", "admin_pass");
        server.logIn("user@example.com", "user_pass");
        server.logIn("xxx@example.com", "xxx_pass");
    }
}
