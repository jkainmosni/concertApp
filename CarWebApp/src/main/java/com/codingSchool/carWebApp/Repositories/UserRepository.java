package com.codingSchool.carWebApp.Repositories;


import com.codingSchool.carWebApp.Domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Page<User> findAll(Pageable pageable);

    User findByUsernameAndPassword(String username, String password);

    User save(User user);

}
