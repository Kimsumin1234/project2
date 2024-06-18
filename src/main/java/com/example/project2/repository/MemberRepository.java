package com.example.project2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.project2.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);

    @Query("select m from Member m where m.email = ?1 and m.fromSocial = ?2")
    Optional<Member> findByEmailAndFromSocial(String email, boolean social);

    Optional<Member> findByNickname(String nickname);

    Optional<Member> findByPhone(String phone);

    @Query("select m from Member m where m.phone = ?1 and m.fromSocial = ?2")
    Optional<Member> findByPhoneAndFromSocial(String phone, boolean social);

    @Modifying
    @Query("update Member m set m.nickname=?1 where m.email=?2")
    void updateNickName(String nickname, String email);

    // 장바구니 추가
    Optional<Member> findByMid(Long mid);

}
