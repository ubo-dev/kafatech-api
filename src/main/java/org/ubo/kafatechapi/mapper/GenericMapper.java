package org.ubo.kafatechapi.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * Generic Mapper class responsible for object-to-object mapping using ModelMapper.
 * This class provides generic methods to convert entities to DTOs and vice versa,
 * utilizing ModelMapper library for automatic object mapping.
 *
 * @param <E> The entity type.
 * @param <D> The DTO (Data Transfer Object) type.
 */
@Component
public class GenericMapper<E, D> {

    /**
     * -- GETTER --
     *  Retrieves the ModelMapper instance used in this mapper.
     *
     */
    private final ModelMapper modelMapper;

    /**
     * Constructor initializing the ModelMapper instance.
     */
    public GenericMapper() {
        this.modelMapper = new ModelMapper();
    }

    /**
     * Converts an entity to a DTO.
     *
     * @param entity   The entity to be converted.
     * @param dtoClass The DTO class type.
     * @return The converted DTO.
     */
    public D convertToDto(E entity, Class<D> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    /**
     * Converts a DTO to an entity.
     *
     * @param dto         The DTO to be converted.
     * @param entityClass The entity class type.
     * @return The converted entity.
     */
    public E convertToEntity(D dto, Class<E> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    /**
     * Maps a list of entities to a list of DTOs.
     *
     * @param source   The list of entities to be mapped.
     * @param dtoClass The DTO class type.
     * @return The list of mapped DTOs.
     */
    public List<D> mapListToDto(Collection<E> source, Class<D> dtoClass) {
        return source.stream()
                .map(element -> convertToDto(element, dtoClass))
                .toList();
    }

}