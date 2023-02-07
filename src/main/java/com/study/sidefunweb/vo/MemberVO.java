package com.study.sidefunweb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
public class MemberVO {
    private long member_id;
    private String member_name;
    private String member_email;
    private String member_nickname;
    private String member_pass;
    private String member_phone;
    private String member_postcode;
    private String member_address;
    private String member_email_auth;
    private String member_del;
    private LocalDateTime member_date;
    private long board_id;
    private long reply_id;
    private long modifier_id;
    private long register_id;
    private long modifier_datetime;
    private long register_datetime;

    public MemberVO(long member_id, String member_name, String member_email, String member_nickname, String member_pass, String member_phone, String member_postcode, String member_address, String member_email_auth, String member_del, LocalDateTime member_date, long board_id, long reply_id) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.member_email = member_email;
        this.member_nickname = member_nickname;
        this.member_pass = member_pass;
        this.member_phone = member_phone;
        this.member_postcode = member_postcode;
        this.member_address = member_address;
        this.member_email_auth = member_email_auth;
        this.member_del = member_del;
        this.member_date = member_date;
        this.board_id = board_id;
        this.reply_id = reply_id;
    }

    public long getMember_id() {
        return member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname;
    }

    public String getMember_pass() {
        return member_pass;
    }

    public void setMember_pass(String member_pass) {
        this.member_pass = member_pass;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_postcode() {
        return member_postcode;
    }

    public void setMember_postcode(String member_postcode) {
        this.member_postcode = member_postcode;
    }

    public String getMember_address() {
        return member_address;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }

    public String getMember_email_auth() {
        return member_email_auth;
    }

    public void setMember_email_auth(String member_email_auth) {
        this.member_email_auth = member_email_auth;
    }

    public String getMember_del() {
        return member_del;
    }

    public void setMember_del(String member_del) {
        this.member_del = member_del;
    }

    public LocalDateTime getMember_date() {
        return member_date;
    }

    public void setMember_date(LocalDateTime member_date) {
        this.member_date = member_date;
    }

    public long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(long board_id) {
        this.board_id = board_id;
    }

    public long getReply_id() {
        return reply_id;
    }

    public void setReply_id(long reply_id) {
        this.reply_id = reply_id;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", member_email='" + member_email + '\'' +
                ", member_nickname='" + member_nickname + '\'' +
                ", member_pass='" + member_pass + '\'' +
                ", member_phone='" + member_phone + '\'' +
                ", member_postcode='" + member_postcode + '\'' +
                ", member_address='" + member_address + '\'' +
                ", member_email_auth='" + member_email_auth + '\'' +
                ", member_del='" + member_del + '\'' +
                ", member_date=" + member_date +
                ", board_id=" + board_id +
                ", reply_id=" + reply_id +
                '}';
    }
}
