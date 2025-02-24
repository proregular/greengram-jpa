package com.green.greengramver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserFollow extends CreatedAt {
    @EmbeddedId
    private UserFolowIds userFolowIds;

    @ManyToOne
    @MapsId("fromUserId")
    @JoinColumn(name = "to_user_id")
    private User fromUser;

    @ManyToOne
    @MapsId("toUserId")
    @JoinColumn(name = "from_user_id")
    private User toUser;
}
