package forWeb.day03.repository.enum_classes;

public enum StatSql {
    GET_STAT("SELECT " +
            "  m.name, " +
            "  sum(p.price) AS cost " +
            "FROM (" +
            "       SELECT * " +
            "       FROM phones_sale" +
            "       WHERE date BETWEEN (?) AND (?) " +
            "     ) AS p " +
            "  INNER JOIN phone_models AS m " +
            "    ON p.model_id = m.id %models% " +
            "GROUP BY m.name " +
            "ORDER BY cost DESC;"),
    GET_STAT_REVENUE_LESS("SELECT " +
            "  m.name, " +
            "  sum(p.price) AS cost " +
            "FROM ( " +
            "       SELECT * " +
            "       FROM phones_sale " +
            "       WHERE date BETWEEN (?) AND (?) " +
            "     ) AS p " +
            "  INNER JOIN phone_models AS m " +
            "    ON p.model_id = m.id " +
            "GROUP BY m.name " +
            "HAVING sum(p.price) <= (?) " +
            "ORDER BY cost DESC;"),
    GET_STAT_REVENUE_MORE("SELECT " +
            "  m.name, " +
            "  sum(p.price) AS cost " +
            "FROM ( " +
            "       SELECT * " +
            "       FROM phones_sale " +
            "       WHERE date BETWEEN (?) AND (?) " +
            "     ) AS p " +
            "  INNER JOIN phone_models AS m " +
            "    ON p.model_id = m.id " +
            "GROUP BY m.name " +
            "HAVING sum(p.price) >= (?) " +
            "ORDER BY cost DESC;");
    public String QUERY;

    StatSql(String QUERY) {
        this.QUERY = QUERY;
    }
}
