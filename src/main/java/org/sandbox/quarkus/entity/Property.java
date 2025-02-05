package org.sandbox.quarkus.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "properties")
@Cacheable
public class Property extends PanacheEntityBase {

  @Id
  @Column(length = 40, unique = true)
  public String id;

  @Column(length = 1024)
  public String value;

  public Property() {
  }

  public Property(String id, String value) {
    this.id = id;
    this.value = value;
  }

}
