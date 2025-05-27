package kr.co.loopz.service;

import kr.co.loopz.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ApplicationEventPublisher applicationEventPublisher;


    public String createOrder(String userId, String productId, int quantity) {
        // Logic to create an order
        RestClient restClient = RestClient.create();



        return "Order created successfully for user: " + userId + " with product: " + productId + " and quantity: " + quantity;
    }


}
