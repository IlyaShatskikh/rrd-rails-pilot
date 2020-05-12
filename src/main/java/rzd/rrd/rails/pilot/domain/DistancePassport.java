package rzd.rrd.rails.pilot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceConstructor))
public class DistancePassport {
    @Id @JsonIgnore
    private final Long id;
    private final Integer IDROW;
    private final String SITEID;
    private final String ASSETNUM;
    private final Integer PUTGL_ID;
    private final LocalDateTime CHANGEDA;
    private final Integer ID_CATEG, ID_CLASS, ID_GRUP, M1, M2, KMN, KMK, PKN, PKK, MN, MK, L;
}
