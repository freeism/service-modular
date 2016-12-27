package com.github.freeism;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author Martin
 * @since 2016. 12. 28.
 */
@Data
@Entity
public class Wish {
  @Id
  @GeneratedValue
  private Long id;

  private long userId;

  private long itemId;

  private Date createdAt;

  private Date modifiedAt;

}
