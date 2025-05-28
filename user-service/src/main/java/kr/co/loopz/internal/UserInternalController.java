package kr.co.loopz.internal;

import kr.co.loopz.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/user")
public class UserInternalController {

    @GetMapping()
    public UserResponse getUser() {
        return new UserResponse("Hello, User!");
    }

}
