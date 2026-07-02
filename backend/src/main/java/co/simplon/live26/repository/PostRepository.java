package co.simplon.live26.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.live26.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, UUID>{

}
