package com.github.freeism;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Martin
 * @since 2016. 12. 27.
 */
@Data
@Entity
public class Person {
  @Id
  @GeneratedValue
  private Long id;

  private String firstName;

  private String lastName;
}
