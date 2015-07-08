package models;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

import java.util.Set;

/**
 * Created by abenhmida on 08/07/15.
 */
@NodeEntity
public class Movie {
    @GraphId
    @Indexed(unique=true)
    private String nodeId;
    private String title;
    int year;
    Set<Role> cast;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<Role> getCast() {
        return cast;
    }

    public void setCast(Set<Role> cast) {
        this.cast = cast;
    }
}
