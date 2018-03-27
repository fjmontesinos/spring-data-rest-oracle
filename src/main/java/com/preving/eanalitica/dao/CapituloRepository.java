package com.preving.eanalitica.dao;

import com.preving.eanalitica.domain.Capitulo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "capitulos", collectionResourceRel = "capitulos")
public interface CapituloRepository extends PagingAndSortingRepository<Capitulo, Long> {
}
