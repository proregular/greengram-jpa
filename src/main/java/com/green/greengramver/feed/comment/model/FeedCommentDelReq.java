package com.green.greengramver.feed.comment.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@ToString
public class FeedCommentDelReq {
    @Schema(name="feed_comment_id")
    private long feedCommentId;
    @Schema(name="signed_user_id")
    private long userId;

    @ConstructorProperties({"feed_comment_id"})
    public FeedCommentDelReq(long feedCommentId) {
        this.feedCommentId = feedCommentId;
    }

    public void setSignedUserId(long signedUserId) {
        this.userId = signedUserId;
    }
}
