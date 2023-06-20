package Tech4Good.Team4.DesviaBCN.model.dtos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Entity
public class LocalByTypeDTO {
    private int localId;
    private String neighbourhood;
    private String district;
    private String useType;
    private int cadastreName;
}