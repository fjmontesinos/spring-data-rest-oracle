package com.preving.eanalitica.dao;

import com.preving.eanalitica.domain.Parametro;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "parametros", collectionResourceRel = "parametros")
public interface ParametroRepository extends PagingAndSortingRepository<Parametro, Long> {
}
