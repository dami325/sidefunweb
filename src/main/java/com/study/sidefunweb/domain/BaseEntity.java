package com.study.sidefunweb.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;


/**
 *  공통적으로 사용하는 컬럼 @MappedSuperclass 상속
 *  Entity가 아님
 *  직접 생성해서 사용할 일이 없으므로 추상클래스 권장
 * @Entity 클래스는 엔티티나 @MappedSuperclass로 지정한 클래스만 상속가능
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {

    @Comment("등록일")
    @Column(name = "REGISTED_DATETIME",  updatable = false, nullable = true)
    @CreatedDate
    private LocalDateTime registedDatetime = LocalDateTime.now();

    @Comment("수정일")
    @Column(name = "MODIFIED_DATETIME")
    @LastModifiedDate
    private LocalDateTime modifiedDatetime;

    @Comment("등록자 id")
    @JsonIgnore
    @ManyToOne(fetch= FetchType.LAZY)
    @CreatedBy
    @JoinColumn(name = "REGISTER_ID",  updatable = false)
    private Member register;

    @Comment("수정자 id")
    @JsonIgnore
    @ManyToOne(fetch= FetchType.LAZY)
    @LastModifiedBy
    @JoinColumn(name = "MODIFIER_ID")
    private Member modifier;
}
