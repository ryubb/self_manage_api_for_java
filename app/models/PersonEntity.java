package models;

import io.ebean.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "people")
public class PersonEntity extends Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  private String mail;
  private String tel;

  @OneToMany(mappedBy = "person")
  public List<MessageEntity> messages = new ArrayList<MessageEntity>();

  public PersonEntity() {
    super();
  }

  public PersonEntity(int id, String name, String mail, String tel) {
    super();
    this.id = id;
    this.name = name;
    this.mail = mail;
    this.tel = tel;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return id + ": " + name + " [" + mail + ", " + tel + "]";
  }
}
