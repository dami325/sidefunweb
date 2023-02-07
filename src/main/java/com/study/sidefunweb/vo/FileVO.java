package com.study.sidefunweb.vo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FileVO {
    private long file_id;
    private long board_id;
    private String file_original;
    private String file_stored;
    private LocalDateTime file_date;
    private long modifier_id;
    private long register_id;
    private long modifier_datetime;
    private long register_datetime;
}
