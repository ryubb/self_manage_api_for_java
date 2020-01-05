package models;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Finder;

import java.util.List;

public class MessageRepository {

  public EbeanServer ebean;
  public static Finder<Integer, MessageEntity> find = new Finder<Integer, MessageEntity>(MessageEntity.class);

  public MessageRepository() {
    this.ebean = Ebean.getDefaultServer();
  }

  public List<MessageEntity> list() {
    return find.query().orderBy("created desc").findList();
  }

  public MessageEntity get(int id) {
    return find.byId(id);
  }

  public void add(MessageEntity message) {
    message.save();
  }

}
