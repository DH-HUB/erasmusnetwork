package com.erasmusnetwork.repository;

import com.erasmusnetwork.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Les méthodes existantes
    List<User> findByLocation(String location);
    List<User> findByProgram(String program);
    List<User> findByUniversity(String university);

    // Nouvelle méthode ajoutée avec une requête personnalisée
    @Query("SELECT u FROM User u WHERE " +
            "(:location IS NULL OR u.location = :location) AND " +
            "(:program IS NULL OR u.program = :program) AND " +
            "(:university IS NULL OR u.university = :university)")
    List<User> searchUsers(
            @Param("location") String location,
            @Param("program") String program,
            @Param("university") String university);
}
