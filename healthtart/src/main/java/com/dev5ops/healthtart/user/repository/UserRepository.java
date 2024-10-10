package com.dev5ops.healthtart.user.repository;

import com.dev5ops.healthtart.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUserEmail(String userEmail);


    User findByProviderAndProviderId(String provider, String providerId);
}
