package com.hamed.pat.mapper;

import com.hamed.pat.dtos.CategoryElementDto;
import com.hamed.pat.model.CategoryElement;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class CategoryElementMapper implements Mapper<CategoryElementDto, CategoryElement> {
    @Override
    public CategoryElement dtoToEntity(CategoryElementDto dto) {
        CategoryElement categoryElement = new CategoryElement();
        categoryElement.setValue(dto.value());
        categoryElement.setCode(dto.code());
        categoryElement.setId(dto.id());
        categoryElement.setInsertTime(dto.insertTime());
        categoryElement.setUpdateTime(dto.updateTime());
        categoryElement.setInsertingUser(dto.insertingUser());
        categoryElement.setUpdatingUser(dto.updatingUser());
        return categoryElement;
    }

    @Override
    public Set<CategoryElement> dtoListToEntities(List<CategoryElementDto> categoryElementDtos) {
        return categoryElementDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public CategoryElementDto entityToDto(CategoryElement entity) {
        return CategoryElementDto.builder()
                .value(entity.getValue())
                .code(entity.getCode())
                .id(entity.getId())
                .insertingUser(entity.getInsertingUser())
                .updatingUser(entity.getUpdatingUser())
                .insertTime(entity.getInsertTime())
                .updateTime(entity.getUpdateTime())
                .build();
    }

    @Override
    public List<CategoryElementDto> entitiesToDtoList(Set<CategoryElement> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
