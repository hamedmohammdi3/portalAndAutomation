package com.hamed.pat.mapper;

import java.util.List;
import java.util.Set;

public interface Mapper <D,E>{
    E dtoToEntity(D dto);
    Set<E> dtoListToEntities(List<D> dList);
    D entityToDto (E entity);
    List<D> entitiesToDtoList(Set<E> entities);
}
