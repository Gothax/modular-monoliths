package kr.co.loopz.internal;

import kr.co.loopz.dto.UserInternalResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/user")
public class UserInternalController {

    @GetMapping()
    public UserInternalResponse getUser() {
        return new UserInternalResponse("Hello, User!");
    }

}
