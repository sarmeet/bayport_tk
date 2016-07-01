package org.bayport.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Version;

import java.util.Date;

/**
 * Created by sarmeetsingh on 6/26/16.
 */
public class BaseEntity {


    @Id
    @Property("id")

    private ObjectId id;

    @Version
    @Property("version")
    private Long version;

    private Date creationDate;
    private Date lastChange;

    public BaseEntity() {
        super();
    }

    @PrePersist
    public void prePersist() {
        creationDate = (creationDate == null) ? new Date() : creationDate;
        lastChange = (lastChange == null) ? creationDate : new Date();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }


}
