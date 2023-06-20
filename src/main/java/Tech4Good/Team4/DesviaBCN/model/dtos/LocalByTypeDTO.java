package Tech4Good.Team4.DesviaBCN.model.dtos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LocalByTypeDTO {
    private int localId;
    private String neighbourhood;
    private String district;
    private String useType;
    private int cadastreName;
}