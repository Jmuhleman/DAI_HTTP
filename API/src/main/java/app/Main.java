package app;

import io.javalin.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);


        UserController userController = new UserController();
        app.get("/api/nutriment", userController::getAll);
        app.get("/api/nutriment/{name}", userController::getOne);

        app.post("/api/nutriment/", userController::create);

        app.put("/api/nutriment/{name}", userController::update);
        app.delete("/api/nutriment/{name}", userController::delete);


    }
}