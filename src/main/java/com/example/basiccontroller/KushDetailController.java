package com.example.basiccontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KushDetailController {
    private static final Logger logger = LoggerFactory.getLogger(KushDetailController.class);
    @GetMapping("/")
    String personalDetails()
    {
        logger.info("kushagra----->");
        return "Hello Kushagra, you are great!!";
    }

}
