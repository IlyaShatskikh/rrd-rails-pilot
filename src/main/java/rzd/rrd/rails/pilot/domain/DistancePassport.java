package rzd.rrd.rails.pilot.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceConstructor))
@Data
public class DistancePassport {
    @Id
    @JsonProperty("IDROW")
    private final Integer idrow;
    @JsonProperty("SITEID")
    private final String siteid;
    @JsonProperty("ASSETNUM")
    private final String assetnum;
    @JsonProperty("PUTGL_ID")
    private final Integer putgl_id;
    @JsonProperty("CHANGEDATE")
    private final LocalDateTime changedate;
    @JsonProperty("ID_CATEG")
    private final Integer id_categ;
    @JsonProperty("ID_CLASS")
    private final Integer id_class;
    @JsonProperty("ID_GRUP")
    private final Integer id_grup;
    @JsonProperty("M1")
    private final Integer m1;
    @JsonProperty("M2")
    private final Integer m2;
    @JsonProperty("KMN")
    private final Integer kmn;
    @JsonProperty("KMK")
    private final Integer kmk;
    @JsonProperty("PKN")
    private final Integer pkn;
    @JsonProperty("PKK")
    private final Integer pkk;
    @JsonProperty("MN")
    private final Integer mn;
    @JsonProperty("MK")
    private final Integer mk;
    @JsonProperty("L")
    private final Integer l;
}
