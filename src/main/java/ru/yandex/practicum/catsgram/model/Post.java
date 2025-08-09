package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = {"id"})
public class Post { // модель, описывающая сообщения в социальной сети

    private Long id; // уникальный идентификатор сообщения
    private long authorId; // пользователь, который создал сообщение
    private String description; // текстовое описание сообщения
    private Instant postDate; // дата и время создания сообщения

}
