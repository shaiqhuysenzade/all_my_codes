package forWeb.day03.dao;

public interface DAO<Entity,Key> {
    boolean create(Entity model);
    Entity read(Key key);
    boolean update(Entity model);
    boolean delete(Entity model);
}
