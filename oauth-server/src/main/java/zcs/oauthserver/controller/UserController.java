package zcs.oauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("/user/test1")
    public String test() {
        return "test1";
    }

    @GetMapping("/user/test2")
    public String test2() {
        return "test2";
    }

}
