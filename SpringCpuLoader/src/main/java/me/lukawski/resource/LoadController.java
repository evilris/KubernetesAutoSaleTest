package me.lukawski.resource;

import static java.util.UUID.randomUUID;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadController {

    private final String TEXT_TO_ENCODE = "some text to encode in a loop so we can do some cpu load";

    //TODO: Not the best way to create CPU load but should be enough
    @RequestMapping("/load")
    public String loadCpu() {
        for (int i = 0; i < 1000000 ; i++) {
            String giveGcSomeJob = Base64.encodeBase64String(TEXT_TO_ENCODE.getBytes());
        }
        return randomUUID().toString();
    }
}
