package rzd.rrd.rails.pilot.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import rzd.rrd.rails.pilot.domain.DistancePassport;

public interface DistancePassportRepository extends CrudRepository<DistancePassport, Long> {

    @Query("select * from table(maximo.etb_p.gp_wayclass(:siteId))")
    Iterable<DistancePassport> findBySiteId(String siteId);
}
