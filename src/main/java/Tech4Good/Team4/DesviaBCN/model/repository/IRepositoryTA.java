package Tech4Good.Team4.DesviaBCN.model.repository;

import Tech4Good.Team4.DesviaBCN.model.domain.PointOfInterest;
import Tech4Good.Team4.DesviaBCN.model.domain.TouristicAccommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositoryTA extends JpaRepository<Integer, TouristicAccommodation> {
    TouristicAccommodation findById(int id);
    List<TouristicAccommodation> findByDistrict(String district);
    List<TouristicAccommodation> findByNeighbourhood(String neighbourhood);
}
