package com.uni.forum.domain.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReplyDto {
    private long id;
    private String description;
    private String username;
    private Long topicId;
    private Date created;
    private Date modified;
}
