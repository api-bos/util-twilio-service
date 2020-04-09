package com.bos.util.twilio.repository;

import com.bos.util.twilio.entity.TwilioDim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface TwilioRepo extends JpaRepository<TwilioDim,String> {
    @Transactional
    @Modifying
    @Query("UPDATE TwilioDim SET auth_token = :token WHERE account_sid = :sid")
    void updateFlag(@Param("token") String token, @Param("sid") String sid);
}
