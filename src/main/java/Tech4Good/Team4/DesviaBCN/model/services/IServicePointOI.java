package Tech4Good.Team4.DesviaBCN.model.services;

import Tech4Good.Team4.DesviaBCN.model.domain.PointOfInterest;
import Tech4Good.Team4.DesviaBCN.model.dtos.PointOfInterestDTO;

import java.util.List;

public interface IServicePointOI {

    PointOfInterestDTO findById(int pointOIid);
    List<PointOfInterestDTO> findByZipcode(String zipcode);
    List<PointOfInterestDTO> findByDistrict(String district);
    List<PointOfInterestDTO> findByUseType(String useType);
    List<PointOfInterestDTO> findByDistanceFromFocus(int distanceFromFocus);
    PointOfInterestDTO convertToDTO(PointOfInterest pointOfInterest);

}
