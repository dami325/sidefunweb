package com.study.sidefunweb.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@SpringBootTest
@Transactional
@Rollback(value = false)
public class MemberTest {

    @PersistenceContext
    EntityManager em;

    @Test
    public void testEntity() {
//
//        Member member1 = new Member("member1", 10);
//        Member member2 = new Member("member2", 10);
//        Member member3 = new Member("member3", 10);
//        Member member4 = new Member("member4", 10);
//
//        em.persist(member1);
//        em.persist(member2);
//        em.persist(member3);
//        em.persist(member4);
//
//
//        //초기화
//        em.flush();
//        em.clear();
//
//
//
//        //확인
//        List<Member> members = em.createQuery("select m from Member m",
//                        Member.class)
//                .getResultList();
//        for (Member member : members) {
//            System.out.println("member=" + member);
//        }
    }
}