package in.manish.foodiesapi.service;

import in.manish.foodiesapi.io.UserRequest;
import in.manish.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
