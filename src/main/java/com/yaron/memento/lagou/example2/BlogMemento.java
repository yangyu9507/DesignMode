package com.yaron.memento.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class BlogMemento {

    private final Long id;
    private final String tile;
    private final String content;

    public BlogMemento(Long id, String tile, String content) {
        super();
        this.id = id;
        this.tile = tile;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTile() {
        return tile;
    }

    public String getContent() {
        return content;
    }
}
