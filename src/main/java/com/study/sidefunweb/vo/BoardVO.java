package com.study.sidefunweb.vo;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class BoardVO {
    private long board_id;
    private String board_writer;
    private String board_title;
    private String board_content;
    private String board_del;
    private String board_view;
    private long modifier_id;
    private long register_id;
    private long modifier_datetime;
    private long register_datetime;

    public BoardVO(long board_id, String board_writer, String board_title, String board_content, String board_del, String board_view, long modifier_id, long register_id, long modifier_datetime, long register_datetime) {
        this.board_id = board_id;
        this.board_writer = board_writer;
        this.board_title = board_title;
        this.board_content = board_content;
        this.board_del = board_del;
        this.board_view = board_view;
        this.modifier_id = modifier_id;
        this.register_id = register_id;
        this.modifier_datetime = modifier_datetime;
        this.register_datetime = register_datetime;
    }

    public long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(long board_id) {
        this.board_id = board_id;
    }

    public String getBoard_writer() {
        return board_writer;
    }

    public void setBoard_writer(String board_writer) {
        this.board_writer = board_writer;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getBoard_content() {
        return board_content;
    }

    public void setBoard_content(String board_content) {
        this.board_content = board_content;
    }

    public String getBoard_del() {
        return board_del;
    }

    public void setBoard_del(String board_del) {
        this.board_del = board_del;
    }

    public String getBoard_view() {
        return board_view;
    }

    public void setBoard_view(String board_view) {
        this.board_view = board_view;
    }

    public long getModifier_id() {
        return modifier_id;
    }

    public void setModifier_id(long modifier_id) {
        this.modifier_id = modifier_id;
    }

    public long getRegister_id() {
        return register_id;
    }

    public void setRegister_id(long register_id) {
        this.register_id = register_id;
    }

    public long getModifier_datetime() {
        return modifier_datetime;
    }

    public void setModifier_datetime(long modifier_datetime) {
        this.modifier_datetime = modifier_datetime;
    }

    public long getRegister_datetime() {
        return register_datetime;
    }

    public void setRegister_datetime(long register_datetime) {
        this.register_datetime = register_datetime;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "board_id=" + board_id +
                ", board_writer='" + board_writer + '\'' +
                ", board_title='" + board_title + '\'' +
                ", board_content='" + board_content + '\'' +
                ", board_del='" + board_del + '\'' +
                ", board_view='" + board_view + '\'' +
                ", modifier_id=" + modifier_id +
                ", register_id=" + register_id +
                ", modifier_datetime=" + modifier_datetime +
                ", register_datetime=" + register_datetime +
                '}';
    }
}
