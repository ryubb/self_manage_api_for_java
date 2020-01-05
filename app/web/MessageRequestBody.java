package web;

public class MessageRequestBody {

  private Integer personId;
  private String message;


  public MessageRequestBody() {

  }

  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
