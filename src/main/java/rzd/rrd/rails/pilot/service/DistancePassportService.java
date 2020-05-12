package rzd.rrd.rails.pilot.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rzd.rrd.rails.pilot.domain.DistancePassport;
import rzd.rrd.rails.pilot.repository.DistancePassportRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistancePassportService {

    private final DistancePassportRepository repository;

    @Value("${ekasui.url}")
    private String url;

    public List<DistancePassport> getDistancePassport(String siteId){
         return (List<DistancePassport>) repository.findBySiteId(siteId);
    }

    public String postPassportDistance(List<DistancePassport> passports){
        new RestTemplate().postForLocation("url", passports);
        return "done";
    }
}
