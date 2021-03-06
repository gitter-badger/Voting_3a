package es.uniovi.asw.persistence.dbManagement.repository;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Voto;

public interface VoteRepository extends CrudRepository<Voto, Long>{

	@SuppressWarnings("unchecked")
	Voto save(Voto voto);
}
