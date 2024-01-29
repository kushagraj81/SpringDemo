package com.example.basiccontroller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.Collections;

@RestController
public class KushDetailController {
    private static final Logger logger = LoggerFactory.getLogger(KushDetailController.class);
    @Value("${my.name}")
    private String myname;

    Boolean flag=false;

    private Mydetails mydetails;
// If we only have one constructor then @Autowired over that constructor is optional
    @Autowired
    public KushDetailController(Mydetails mydetails)
    {
        this.mydetails=mydetails;
    }

    @GetMapping("/")
    String personalDetails()
    {
        logger.info("Hello My friend {}----->",myname);

        return mydetails.getKushDetails();
    }
//    this function stops the whole thread for 5 seconds
//    this is not our case. We want to check what happens when response is delayed for sometime.
//    does or code moves to next line in such case or waits.
    public Boolean changeFlagToTrue()
    {
        try {
            Thread.sleep(5000);
            logger.info("10 seconds has passed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("We are out of Changeflag function now");
        return true;

    }

}
