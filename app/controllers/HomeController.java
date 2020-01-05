package controllers;

import models.PersonEntity;
import models.PersonRepository;
import play.libs.Json;
import play.mvc.*;

import javax.inject.*;
import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final PersonRepository repo;

    @Inject
    public HomeController(PersonRepository repo) {
        this.repo = repo;
    }

    public Result index() {

        return ok(views.html.index.render(
                "People List", repo.list()
        ));

    }

    public Result show(int id) {

        return ok(views.html.show.render(
                "Show Person", repo.get(id), id
        ));
    }

    public Result create() {

        PersonEntity requestBody = Json.fromJson(request().body().asJson(), PersonEntity.class);
        repo.save(requestBody);
        return ok(Json.toJson(requestBody));

    }

}
