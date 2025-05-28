package kr.co.loopz.controller;

import kr.co.loopz.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/user/hello")
    public String hello() {
        return "Hello, USER!";
    }


    @GetMapping("/user")
    public UserResponse getUser() {
        return new UserResponse("Hello, User!");
    }

}
