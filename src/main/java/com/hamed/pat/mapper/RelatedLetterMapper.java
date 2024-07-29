package com.hamed.pat.mapper;

import com.hamed.pat.dtos.CategoryElementDto;
import com.hamed.pat.dtos.LetterDto;
import com.hamed.pat.dtos.RelatedLetterDto;
import com.hamed.pat.model.CategoryElement;
import com.hamed.pat.model.Letter;
import com.hamed.pat.model.RelatedLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RelatedLetterMapper implements Mapper<RelatedLetterDto, RelatedLetter>{

    private final Mapper<LetterDto, Letter> letterMapper;
    private final Mapper<CategoryElementDto, CategoryElement> categoryElementMapper;
    @Override
    public RelatedLetter dtoToEntity(RelatedLetterDto dto) {
        if (dto == null) {
            return null;
        }
        RelatedLetter relatedLetter = new RelatedLetter();
        relatedLetter.setId(dto.id());
        relatedLetter.setRelatedLet(letterMapper.dtoToEntity(dto.letter()));
        relatedLetter.setRelatedLetType(categoryElementMapper.dtoToEntity(dto.relatedLetterType()));
        relatedLetter.setInsertingUser(dto.insertingUser());
        relatedLetter.setUpdatingUser(dto.updatingUser());
        relatedLetter.setInsertTime(dto.insertTime());
        relatedLetter.setUpdateTime(dto.updateTime());
        return relatedLetter;
    }

    @Override
    public Set<RelatedLetter> dtoListToEntities(List<RelatedLetterDto> relatedLetterDtos) {
        return relatedLetterDtos.stream().map(this::dtoToEntity).collect(Collectors.toSet());
    }

    @Override
    public RelatedLetterDto entityToDto(RelatedLetter entity) {
        if (entity == null) {
            return null;
        }
        return RelatedLetterDto.builder()
                .letter(letterMapper.entityToDto(entity.getLet()))
                .relatedLetterType(categoryElementMapper.entityToDto(entity.getRelatedLetType()))
                .id(entity.getId())
                .insertingUser(entity.getInsertingUser())
                .updatingUser(entity.getUpdatingUser())
                .insertTime(entity.getInsertTime())
                .updateTime(entity.getUpdateTime())
                .build();
    }

    @Override
    public List<RelatedLetterDto> entitiesToDtoList(Set<RelatedLetter> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }
    @Autowired
    public RelatedLetterMapper(LetterMapper letterMapper , CategoryElementMapper categoryElementMapper){
        this.letterMapper=letterMapper;
        this.categoryElementMapper = categoryElementMapper;
    }
}
