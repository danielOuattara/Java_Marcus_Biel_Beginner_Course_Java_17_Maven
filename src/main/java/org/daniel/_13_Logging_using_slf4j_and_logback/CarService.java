package org.daniel._13_Logging_using_slf4j_and_logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {
//        if (log.isDebugEnabled()) {
//            log.debug("processing car : " + input);
//        }

//      even simpler
        log.info("Entering Application");
        log.debug("processing car : {} ", input);
        log.info("Exiting Application");
    }
}

