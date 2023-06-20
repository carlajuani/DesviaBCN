package Tech4Good.Team4.DesviaBCN.model.dtos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Entity
public class PointOfInterestDTO {

    private int id;

    private String address;

    private String zipcode;

    private String district;

    private String useType;

    private int focusDistance;

}
