package forWeb.day03.dao.enum_classes;

public enum UserSqlEnum {
    GET("SELECT u.id, u.login, u.password, r.id AS rol_id, r.role FROM users AS u LEFT JOIN roles AS r ON u.role = r.id WHERE u.login = (?);"),
    INSERT("INSERT INTO users (id,login,password,role) VALUES (DEFAULT,(?),(?),(?)) RETURNING id;"),
    DELETE("DELETE FROM users WHERE id = (?) AND login = (?) AND password = (?) RETURNING id;"),
    UPDATE("UPDATE users SET password = (?) WHERE id = (?) RETURNING id;");


    public String QUERY;

    UserSqlEnum(String QUERY) {
        this.QUERY = QUERY;
    }
}
