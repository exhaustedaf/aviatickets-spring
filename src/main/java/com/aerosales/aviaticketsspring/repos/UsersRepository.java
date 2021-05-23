package com.aerosales.aviaticketsspring.repos;

import com.aerosales.aviaticketsspring.pojo.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
}
