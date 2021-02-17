package us.org.crm.demo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import us.org.crm.demo.entities.Customer;


@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customer ,Long>{

    @RestResource(path = "/bycity")
    Page<Customer> findBycityContainingIgnoreCase(String city ,Pageable pageable);
}
