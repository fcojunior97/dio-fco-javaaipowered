package dio.fco.domain.service;

import dio.fco.domain.model.User;

public interface UserService {
    User findByID(Long id);

    User create (User userToCreate);
}
