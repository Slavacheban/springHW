package beans.backs;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("srna")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Srna implements Back {
    private static Logger LOGGER = Logger.getLogger(Srna.class.getName());

    public void back() {
        LOGGER.info("back as Srna");
    }
}
