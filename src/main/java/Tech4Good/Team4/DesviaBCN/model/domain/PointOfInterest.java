package Tech4Good.Team4.DesviaBCN.model.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PointsOfInterest")
public class PointOfInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pointOIid;
    @Column(name = "name")
    private String name;
    @Column(name = "street")
    private String street;
    @Column(name = "streetNum")
    private String streetNum;
    @Column(name = "neighbourhood")
    private String neighbourhood;
    @Column(name = "district")
    private String district;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "email")
    private String email;
    @Column(name = "web")
    private String web;
    @Column(name = "longLongitude")
    private int longLongitude;
    @Column(name = "longLatitude")
    private int longLatitude;

}