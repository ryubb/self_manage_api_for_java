package models;

import io.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

@Entity
@Table(name = "messages")
public class MessageEntity extends Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "person_id")
  private PersonEntity person;

  private String message;

  private Timestamp created;

  public MessageEntity() {
    super();
  }

  public MessageEntity(int id, PersonEntity person, String message) {
    this.id = id;
    this.person = person;
    this.message = message;
    this.created = new Timestamp(new Date().getTime());
  }

  public Integer getId() {
    return id;
  }

  public PersonEntity getPerson() {
    return person;
  }

  public void setPersonId(PersonEntity person) {
    this.person = person;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Timestamp getCreated() {
    return created;
  }

}
