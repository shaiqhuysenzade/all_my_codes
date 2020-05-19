package forWeb.day03.repository;

import forWeb.day03.entities.PhoneModel;
import forWeb.day03.entities.Statistic;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public interface StatisticRepository<Entity extends Statistic, Range extends Statistic.TimeRange> {
    List<Entity> getStat(List<PhoneModel> models, Range range, Comparator<Entity> comp);

    List<Entity> getStatRevenueLess(BigDecimal threshold, Range range, Comparator<Entity> comp);

    List<Entity> getStatRevenueMore(BigDecimal threshold, Range range, Comparator<Entity> comp);
}
