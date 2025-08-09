package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
public class Image { // модель, которая описывает изображения, прикреплённые к конкретному сообщению

    private Long id; // уникальный идентификатор изображения,
    private long postId; // уникальный идентификатор поста, к которому прикреплено изображение,
    private String originalFileName; // имя файла, который содержит изображение,
    private String filePath; // путь, по которому изображение было сохранено

}
