package org.daniel._14_main_method;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {

//      even simpler
        log.info("Entering Application");
        log.debug("processing car : {} ", input);
        log.info("Exiting Application");
    }
}

