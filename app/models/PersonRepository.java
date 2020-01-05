package models;

import java.util.*;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import models.*;
import play.db.ebean.*;
import io.ebean.*;

public class PersonRepository {

  public EbeanServer ebean;
  public static Finder<Integer, PersonEntity> find = new Finder<Integer, PersonEntity>(PersonEntity.class);

  public PersonRepository() {
    this.ebean = Ebean.getDefaultServer();
  }

  public List<PersonEntity> list() {
    return find.all();
  }

  public PersonEntity get(int id) {
    return find.byId(id);
  }

  public void save(PersonEntity person) {
    person.save();
  }

  public void update(PersonEntity person) {
      person.update();
  }

}
