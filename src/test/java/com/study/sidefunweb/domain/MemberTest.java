package com.study.sidefunweb.domain;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import static com.study.sidefunweb.domain.QMember.*;

@SpringBootTest
@Transactional
public class MemberTest {

    private JPAQueryFactory queryFactory;

    @Autowired
    private EntityManager em;

    @BeforeEach
    public void before() {
        queryFactory = new JPAQueryFactory(em);
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");

        Member member3 = new Member("member3");
        Member member4 = new Member("member4");
        em.persist(member1);
        em.persist(member2);
        em.persist(member3);
        em.persist(member4);
    }

    @Test
    public void testEntity() {
        List<String> result = queryFactory.select(member.member_name)
                .from(member)
                .where(member.member_name.eq("member1"))
                .fetch();

        for (String s : result) {
            System.out.println("s = " + s);
        }


    }
}