package kr.co.loopz.service;

import kr.co.loopz.client.UserClient;
import kr.co.loopz.dto.UserInternalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final UserClient userClient;

    public String createOrder(String userId, String productId, int quantity) {

        UserInternalResponse userDetails = userClient.getUserDetails();
        System.out.println("userDetails = " + userDetails);

        return "Order created successfully for user: " + userId + " with product: " + productId + " and quantity: " + quantity;
    }


}
