package Tech4Good.Team4.DesviaBCN.model.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "LocalByType")
public class LocalByType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int localId;
    @Column(name = "neighbourhood")
    private String neighbourhood;
    @Column(name = "district")
    private String district;
    @Column(name = "useType")
    private String useType;
    @Column(name = "cadastreName")
    private int cadastreName;

}