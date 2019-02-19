package com.zachary.ssm.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
/**演示复合主键**/
@Entity
@Table(name = "tab_animal")
public class Animal {
    @EmbeddedId
    private AnimalKey key;

    public AnimalKey getKey() {
        return key;
    }

    public void setKey(AnimalKey key) {
        this.key = key;
    }
}
