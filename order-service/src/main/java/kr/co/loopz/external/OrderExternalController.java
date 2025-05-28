package kr.co.loopz.external;

import kr.co.loopz.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderExternalController {

    private final OrderService orderService;

    @GetMapping("/order/hello")
    public String hello() {
        return "Hello, Order!";
    }

    @GetMapping("/order/create")
    public String createOrder() {
        return orderService.createOrder("12345", "67890", 2);
    }


}
