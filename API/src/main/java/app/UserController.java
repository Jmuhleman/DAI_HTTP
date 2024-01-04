package app;

import io.javalin.http.Context;

import java.util.concurrent.ConcurrentHashMap;

public class UserController {

    private ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();
    private int lastId = 0;

    public UserController() {
        users.put(++lastId, new User("John", "Doe"));
        users.put(++lastId, new User("Vadim", "sirovsky"));
        users.put(++lastId, new User("simon", "cartel"));
    }

    public void getOne(Context ctx) {
        int id = Integer.parseInt(ctx.pathParam("id"));
        ctx.json(users.get(id));
    }

    public void getAll(Context ctx) {
        ctx.json(users.values());
    }
    public void create(Context ctx) {
        User user = ctx.bodyAsClass(User.class);
        users.put(++lastId, user);
        ctx.status(201).json(user);
    }
    public void update(Context ctx) {
        int id = Integer.parseInt(ctx.pathParam("id"));
        User user = ctx.bodyAsClass(User.class);
        users.put(id, user);
        ctx.status(204);
    }

    public void delete(Context ctx) {
        int id = Integer.parseInt(ctx.pathParam("id"));
        users.remove(id);
        ctx.status(204);
    }







}
