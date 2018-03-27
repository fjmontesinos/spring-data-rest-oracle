package com.preving.eanalitica.dao;

import com.preving.eanalitica.domain.Perfil;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "perfiles", collectionResourceRel = "perfiles")
public interface PerfilRepository extends PagingAndSortingRepository<Perfil, Long> {
}
