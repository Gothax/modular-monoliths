package kr.co.loopz.external;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserExternalController {

    @GetMapping("/user/hello")
    public String hello() {
        return "Hello, USER!";
    }




}
