package forWeb.day03.repository;


import atHome.method.Ex;
import forWeb.day03.dbmanager.Database;
import forWeb.day03.entities.PhoneModel;
import forWeb.day03.entities.Statistic;
import forWeb.day03.jdbc.DatabaseConnection;
import forWeb.day03.repository.enum_classes.StatSql;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class StatisticRepositoryImpl extends Database implements StatisticRepository<Statistic, Statistic.TimeRange> {
    @Override
    public List<Statistic> getStat(final List<PhoneModel> models, Statistic.TimeRange range, Comparator<Statistic> comp) {
        SortedSet<Statistic> statistics = new TreeSet(comp);
        try (DatabaseConnection dbc = new DatabaseConnection()) {
            conn = dbc.getConnection();
            pr = conn.prepareStatement(StatSql.GET_STAT.QUERY);

        } catch (Exception ex) {
            System.out.println("SMTH wrong in getStat method");
        }

        return null;
    }

    @Override
    public List<Statistic> getStatRevenueLess(BigDecimal threshold, Statistic.TimeRange range, Comparator<Statistic> comp) {
        return null;
    }

    @Override
    public List<Statistic> getStatRevenueMore(BigDecimal threshold, Statistic.TimeRange range, Comparator<Statistic> comp) {
        return null;
    }
}
