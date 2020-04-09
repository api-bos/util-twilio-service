package com.bos.util.twilio.service;

import com.bos.util.twilio.repository.TwilioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilTwilioService {
    @Autowired
    TwilioRepo twilioRepo;

    public String updateToken(String token){
        String sid = "AC17cb2fb0f7fd9bfe9b4b619d19b79031";
        try {
            System.out.println("\ntoken: "+token+"\n");
            twilioRepo.updateFlag(token,sid);
            return "BERHASIL PEN";
        }catch (Exception e)
        {
            e.printStackTrace();
            return "GAGAL PEN";
        }
    }
}
