package Tech4Good.Team4.DesviaBCN.model.services;

import Tech4Good.Team4.DesviaBCN.model.domain.LocalByType;
import Tech4Good.Team4.DesviaBCN.model.domain.PointOfInterest;
import Tech4Good.Team4.DesviaBCN.model.dtos.LocalByTypeDTO;
import Tech4Good.Team4.DesviaBCN.model.dtos.PointOfInterestDTO;
import Tech4Good.Team4.DesviaBCN.model.repository.IRepositoryLBT;
import Tech4Good.Team4.DesviaBCN.model.repository.IRepositoryPOI;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceLBT implements IServiceLBT{

    @Autowired
    private IRepositoryLBT repository;

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Override
    public LocalByTypeDTO findById(int pointOIid) {
        PointOfInterest pointOfInterest = repository.findById(pointOIid);
        return convertToDTO(pointOfInterest);
    }

    @Override
    public List<LocalByTypeDTO> findByDistrict(String district) {
        List<PointOfInterest> pointsOfInterest = repository.findByDistrict(district);
        return pointsOfInterest.stream().map(p -> convertToDTO(p)).collect(Collectors.toList());
    }

    @Override
    public List<LocalByTypeDTO> findByNeighbourhood(String neighbourhood) {
        List<PointOfInterest> pointsOfInterest = repository.findByNeighbourhood(neighbourhood);
        return pointsOfInterest.stream().map(p -> convertToDTO(p)).collect(Collectors.toList());
    }

    @Override
    public List<LocalByTypeDTO> findByUseType(String useType) {
        List<LocalByType> localsByType = repository.findByUseType(useType);
        return localsByType.stream().map(l -> convertToDTO(l)).collect(Collectors.toList());
    }

    @Override
    public LocalByTypeDTO convertToDTO(LocalByType localByType) {
        return getModelMapper().map(localByType, LocalByTypeDTO.class);
    }
}
