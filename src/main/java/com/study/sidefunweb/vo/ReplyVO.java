package com.study.sidefunweb.vo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ReplyVO {
    private long board_id;
    private long reply_id;
    private String reply_name;
    private String reply_content;
    private LocalDateTime reply_date;
    private long modifier_id;
    private long register_id;
    private long modifier_datetime;
    private long register_datetime;

}
