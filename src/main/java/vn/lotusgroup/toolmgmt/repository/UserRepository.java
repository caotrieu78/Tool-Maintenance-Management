package vn.lotusgroup.toolmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.lotusgroup.toolmgmt.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
