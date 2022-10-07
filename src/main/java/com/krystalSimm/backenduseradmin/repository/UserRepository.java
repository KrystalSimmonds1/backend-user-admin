package com.krystalSimm.backenduseradmin.repository;

import com.krystalSimm.backenduseradmin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
