package com.green.greengramver.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class UserFolowIds implements Serializable {
    private Long fromUserId;
    private Long toUserId;
}
