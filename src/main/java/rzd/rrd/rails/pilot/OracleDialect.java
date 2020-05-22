package rzd.rrd.rails.pilot;

import org.springframework.data.relational.core.dialect.AnsiDialect;

public class OracleDialect extends AnsiDialect {
    public static final OracleDialect INSTANCE = new OracleDialect();
}
