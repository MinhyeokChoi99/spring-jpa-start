package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;


class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("memberA");
        //when
        Long saveId = memberRepository.save(member);
        //then
        Member findMember = memberRepository.find(saveId);
        Assertions.assertThat(findMember).isNotNull();

    }

}