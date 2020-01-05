package controllers;

import models.MessageEntity;
import models.MessageRepository;
import models.PersonEntity;
import models.PersonRepository;
import play.libs.Json;
import play.mvc.*;
import web.MessageRequestBody;

import javax.inject.*;
import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final PersonRepository repo;
    private final MessageRepository messageRepository;

    @Inject
    public HomeController(PersonRepository repo, MessageRepository messageRepository) {
        this.repo = repo;
        this.messageRepository = messageRepository;
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

    public Result update(int id) {

        PersonEntity requestBody = Json.fromJson(request().body().asJson(), PersonEntity.class);

        PersonEntity person = repo.get(id);
        person.setName(requestBody.getName());
        repo.update(person);
        return ok(Json.toJson(requestBody));

    }

    public Result createMessage() {

        MessageRequestBody requestBody = Json.fromJson(request().body().asJson(), MessageRequestBody.class);
        PersonEntity person = repo.get(requestBody.getPersonId());
        MessageEntity message = new MessageEntity(0, person, requestBody.getMessage());
        messageRepository.add(message);
        return ok(Json.toJson(requestBody));

    }

}
