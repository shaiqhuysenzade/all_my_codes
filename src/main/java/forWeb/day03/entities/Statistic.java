package forWeb.day03.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Statistic {
    private TimeRange range;
    private String model;
    private BigDecimal revenue;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class TimeRange {
        private Timestamp to;
        private Timestamp from;
    }
}
