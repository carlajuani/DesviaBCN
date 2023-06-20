package Tech4Good.Team4.DesviaBCN.controllers;

import Tech4Good.Team4.DesviaBCN.model.dtos.PointOfInterestDTO;
import Tech4Good.Team4.DesviaBCN.model.services.IServicePOI;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/desviaBCN")
public class ControllerPOI {

    @Autowired
    IServicePOI service;

    @GetMapping("/getPOI/{id}")
    @Operation(
            summary = "get point of interest",
            description = "It requires a point of interest's id path variable (int pointOIid)"
    )
    public ResponseEntity<PointOfInterestDTO> getPointOIById(@PathVariable("id") int pointOIid) {
        try {
            return new ResponseEntity<>(service.findById(pointOIid), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getPOISbyZipcode")
    @Operation(
            summary = "get all points of interest with same zipcode",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "String zipcode")
    )
    public ResponseEntity<List<PointOfInterestDTO>> getPointsOIByZipcode(@RequestParam String zipcode) {
        try {
            List<PointOfInterestDTO> pointsOfInterestDTO = service.findByDistrict(zipcode);
            if (pointsOfInterestDTO.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(pointsOfInterestDTO, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/getPOISbyDistrict")
    @Operation(
            summary = "get all points of interest from a district",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "String district")
    )
    public ResponseEntity<List<PointOfInterestDTO>> getPointsOIByDistrict(@RequestParam String district) {
        try {
            List<PointOfInterestDTO> pointsOfInterestDTO = service.findByDistrict(district);
            if (pointsOfInterestDTO.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(pointsOfInterestDTO, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/getPOISbyNeighbourhood")
    @Operation(
            summary = "get all points of interest from a neighbourhood",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "String neighbourhood")
    )
    public ResponseEntity<List<PointOfInterestDTO>> getPointsOIByNeighbourhood(@RequestParam String neighbourhood) {
        try {
            List<PointOfInterestDTO> pointsOfInterestDTO = service.findByNeighbourhood(neighbourhood);
            if (pointsOfInterestDTO.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(pointsOfInterestDTO, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

