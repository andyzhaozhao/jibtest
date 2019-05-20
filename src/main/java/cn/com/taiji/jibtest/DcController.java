package cn.com.taiji.jibtest;//package cn.com.taiji.oauth2.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    private static Logger logger = LoggerFactory.getLogger(DcController.class);

    @GetMapping("/dc")
    public String dc() {
        logger.info("dc");
        return "dc";
    }
}
