package kr.co.loopz.client;

import kr.co.loopz.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "user-client",
        url  = "${user.service.url}",
        path = "/internal/user"
)public interface UserClient {

    @GetMapping
    UserResponse getUserDetails();

}
