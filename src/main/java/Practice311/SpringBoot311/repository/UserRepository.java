package Practice311.SpringBoot311.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
    @Component
    public interface UserRepository extends JpaRepository<User, Long> {

}
