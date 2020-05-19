package forWeb.day03.entities;

import lombok.AllArgsConstructor;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PhoneModel {
    private int id;
    private String name;
}
