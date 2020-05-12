package rzd.rrd.rails.pilot.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rzd.rrd.rails.pilot.domain.DistancePassport;
import rzd.rrd.rails.pilot.service.DistancePassportService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DistancePassportController {

    private final Logger log = LoggerFactory.getLogger(DistancePassportController.class);
    private final DistancePassportService service;

    @GetMapping(value = "/dp") //produces = MediaType.APPLICATION_JSON_VALUE)
    public String distancePassport(@RequestParam(name = "siteId") String siteId) throws Exception {
        log.info("Request: distance passport. Arrgs: siteId {}", siteId);
        List<DistancePassport> passports = service.getDistancePassport(siteId);
        return service.postPassportDistance(passports);
    }

}