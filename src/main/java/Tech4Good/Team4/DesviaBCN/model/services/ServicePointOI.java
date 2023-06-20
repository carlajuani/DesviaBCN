package Tech4Good.Team4.DesviaBCN.model.services;

import Tech4Good.Team4.DesviaBCN.model.domain.PointOfInterest;
import Tech4Good.Team4.DesviaBCN.model.dtos.PointOfInterestDTO;
import Tech4Good.Team4.DesviaBCN.model.repository.IRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicePointOI implements IServicePointOI {

    @Autowired
    private IRepository repository;

    @Bean
    public ModelMapper getModelMapper() {
       return new ModelMapper();
    }

    @Override
    public PointOfInterestDTO findById(int pointOIid) {
        PointOfInterest pointOfInterest = repository.findById(pointOIid);
        return convertToDTO(pointOfInterest);
    }

    @Override
    public List<PointOfInterestDTO> findByZipcode(String zipcode) {
        List<PointOfInterest> pointsOfInterest = repository.findByZipcode(zipcode);
        return pointsOfInterest.stream().map(p -> convertToDTO(p)).collect(Collectors.toList());
    }

    @Override
    public List<PointOfInterestDTO> findByDistrict(String district) {
        List<PointOfInterest> pointsOfInterest = repository.findByDistrict(district);
        return pointsOfInterest.stream().map(p -> convertToDTO(p)).collect(Collectors.toList());
    }

    @Override
    public List<PointOfInterestDTO> findByUseType(String useType) {
        List<PointOfInterest> pointsOfInterest = repository.findByUseType(useType);
        return pointsOfInterest.stream().map(p -> convertToDTO(p)).collect(Collectors.toList());
    }

    @Override
    public List<PointOfInterestDTO> findByDistanceFromFocus(int distanceFromFocus) {
        List<PointOfInterest> pointsOfInterest = repository.findByDistanceFromFocus(distanceFromFocus);
        return pointsOfInterest.stream().map(p -> convertToDTO(p)).collect(Collectors.toList());
    }

    @Override
    public PointOfInterestDTO convertToDTO(PointOfInterest pointOfInterest) {
        return getModelMapper().map(pointOfInterest, PointOfInterestDTO.class);
    }
}
