package ubo.fr.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ubo.fr.users.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
