package py.edu.uca.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.MEC;

@RepositoryRestResource(collectionResourceRel = "institute", path = "institute")
public interface MECRepository extends PagingAndSortingRepository<MEC, Long> {

	List<MEC> findByName(String name);

}
