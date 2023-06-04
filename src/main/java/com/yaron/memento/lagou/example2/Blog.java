package com.yaron.memento.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Blog {

    private Long id;

    private String title;

    private String content;

    public Blog(Long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    public BlogMemento createBackUp(){
        return new BlogMemento(id, title, content);
    }

    public void restore(BlogMemento memento){
        this.id = memento.getId();
        this.title = memento.getTile();
        this.content = memento.getContent();
    }

    public Long getId() {
        return id;
    }

    public Blog setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Blog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Blog setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
