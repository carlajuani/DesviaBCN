package Tech4Good.Team4.DesviaBCN.model.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PointOfInterestDTO {
    private int id;
    private String name;
    private String street;
    private String streetNum;
    private String neighbourhood;
    private String district;
    private String zipcode;
    private int longLongitude;
    private int longLatitude;
}
