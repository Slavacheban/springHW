package beans.goalkeepers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("piat")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Piat implements Goalkeeper {
    private static Logger LOGGER = Logger.getLogger(Piat.class.getName());

    public void keep() {
        LOGGER.info("keep as Piatov");
    }
}
