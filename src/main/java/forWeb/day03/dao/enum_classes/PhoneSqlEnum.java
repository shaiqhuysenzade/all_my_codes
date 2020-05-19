package forWeb.day03.dao.enum_classes;

public enum PhoneSqlEnum {
    INSERT("INSERT INTO phone_models (id, name) VALUES (DEFAULT, (?)) RETURNING id;"),
    UPDATE("UPDATE phone_models SET name=(?) WHERE id=(?) RETURNING id;"),//0506637001
    DELETE("DELETE  FROM phone_models where id=(?) RETURNING id;"),
    READ("SELECT id FROM phone_models WHERE name=(?);");

    public String QUERY;

    PhoneSqlEnum(String QUERY) {
        this.QUERY = QUERY;
    }
}
