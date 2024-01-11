package app;

import io.javalin.http.Context;

import java.util.concurrent.ConcurrentHashMap;

public class UserController {

    public ConcurrentHashMap<String, Nutriment> nutriments = new ConcurrentHashMap<>();

    public UserController() {
    }

    public void getOne(Context ctx) {
        String name = ctx.pathParam("name");
        ctx.json(nutriments.get(name));
    }

    public void getAll(Context ctx) {

        ctx.json(nutriments.values());
    }

    public void create(Context ctx) {
        Nutriment n = ctx.bodyAsClass(Nutriment.class);

        nutriments.put(n.name, n);
        ctx.status(201).json(n);
    }

    public void update(Context ctx) {
        Nutriment req  = ctx.bodyAsClass(Nutriment.class);

        Nutriment n = nutriments.get(req.name);
        n.setNutriment(req.name, req.energy, req.protein, req.carbohydrate, req.fat);
        
        nutriments.put(n.name, n);
        ctx.status(200).json(n);
    }

    public void delete(Context ctx) {
        String name = ctx.pathParam("name");
        nutriments.remove(name);
        ctx.status(204);
    }

}
