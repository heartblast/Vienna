package netbee.springWeb.vienna.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import netbee.springWeb.vienna.model.AccountInfo;


@RestController
public class AccountInfoController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/accountInfo")
    public AccountInfo accountInfo(@RequestParam(value="accNo", required=false, defaultValue="12356") String accNo,
    		@RequestParam(value="owner", required=false, defaultValue="Seokbong") String owner,
    		@RequestParam(value="amt", required=false, defaultValue="3405050") long amt
    		) {
        return new AccountInfo(accNo, owner, amt);
    }
}