package bank.pichincha.search.repository;

import bank.pichincha.search.dto.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ITestUserDao extends JpaRepository<TestUser, Integer> {

    @Query(value = "SELECT * FROM test_user c WHERE c.use_id=:use_id", nativeQuery = true)
    public abstract TestUser findUsers(@Param("use_id") Integer use_id);

}
