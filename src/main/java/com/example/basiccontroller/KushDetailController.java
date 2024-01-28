package com.example.basiccontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class KushDetailController {
    private static final Logger logger = LoggerFactory.getLogger(KushDetailController.class);
    @Value("${my.name}")
    private String myname;

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

}
