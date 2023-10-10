package pro.sky.java.course6.animalshelter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pro.sky.java.course6.animalshelter.entity.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
