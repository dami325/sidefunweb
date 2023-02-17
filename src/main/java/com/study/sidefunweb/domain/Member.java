package com.study.sidefunweb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Comment("")
    private String member_email;
    private String member_nicname;
    private String member_pass;
    private String member_phone;
    private String member_postcode;
    private String member_address;
    private String member_email_auth;
    private String member_del;
    private String member_date;
    private String member_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    public Member (String name) {
        this.member_name = name;
    }


//    @ManyToOne(fetch = FetchType.LAZY)
//    private Reply reply;


}
