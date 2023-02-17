package com.study.sidefunweb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Board extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    @Comment("작성자")
    private String board_writer;
    private String board_title;
    private String board_content;
    private LocalDateTime board_date;
    private LocalDateTime board_update;


}
