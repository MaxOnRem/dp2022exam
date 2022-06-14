package exam2022.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import exam2022.entity.Tables;

//@RepositoryRestResource(collectionResourceRel = "table", path = "table")

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface tableRepository extends JpaRepository<Tables, Long> {
	
	//List<Table> findByTitle(@Param("title11") String title11);
	
}
