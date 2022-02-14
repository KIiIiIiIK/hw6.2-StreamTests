package Blogs;

import java.util.Objects;

public class BlogPost {

    private String title;
    private String author;
    private BlogPostType type;
    private int likes;

    public BlogPost(String title, String author, BlogPostType type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BlogPostType getType() {
        return type;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BlogPost blogPost = (BlogPost) o;
        return likes == blogPost.likes &&
                Objects.equals(title, blogPost.title) &&
                Objects.equals(author, blogPost.author) &&
                type == blogPost.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, type, likes);
    }

    @Override
    public String toString() {
        return "BlogPost{" + "title='" + title + '\'' + ", type=" + type + ", likes=" + likes + '}';
    }
}
