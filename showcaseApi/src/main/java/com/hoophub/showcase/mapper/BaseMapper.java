package com.hoophub.showcase.mapper;

import java.util.List;

public interface BaseMapper<E, D> {

    D toDto(E e);

    List<D> toDtoList(List<E> eList);
}
