package com.github.sadiker.IstanbulAPI.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sadiker.IstanbulAPI.serviceJson.ReplyPrayService;
import com.github.sadiker.IstanbulAPI.models.pray.Pray;
import com.github.sadiker.IstanbulAPI.models.pray.TimeToPray;

@Service
public class PrayService {

    @Autowired
    ReplyPrayService replyPrayService;

    public List<Pray> getPrayAll() {
        return replyPrayService.getPrayAll().getResult();
    }

    public TimeToPray getTimeToPrayAkşam() {
        return replyPrayService.getTimeToPray("Akşam").getResult().get(0);
    }

    public TimeToPray getTimeToPrayYatsı() {
        return replyPrayService.getTimeToPray("Yatsı").getResult().get(0);
    }

    public TimeToPray getTimeToPrayİkindi() {
        return replyPrayService.getTimeToPray("İkindi").getResult().get(0);
    }

    public TimeToPray getTimeToPrayÖğle() {
        return replyPrayService.getTimeToPray("Öğle").getResult().get(0);
    }

    public TimeToPray getTimeToPrayİmsak() {
        return replyPrayService.getTimeToPray("İmsak").getResult().get(0);
    }

    public List<TimeToPray> getTimeToPrayAll() {

        List<TimeToPray> list = new ArrayList<TimeToPray>();
        list.add(getTimeToPrayİmsak());
        list.add(new TimeToPray());
        list.add(getTimeToPrayÖğle());
        list.add(getTimeToPrayİkindi());
        list.add(getTimeToPrayAkşam());
        list.add(getTimeToPrayYatsı());
        return list;
    }
}
