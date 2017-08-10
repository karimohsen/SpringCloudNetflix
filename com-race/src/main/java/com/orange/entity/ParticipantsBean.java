package com.orange.entity;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orange.controller.ParticipantsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karim on 8/9/2017.
 */
@Component
public class ParticipantsBean {
    @Autowired
    ParticipantsClient participantsClient;

    @HystrixCommand(fallbackMethod = "defaultParticipants")
    public List<Participant> getParticipants(String id){
        return participantsClient.getParticipants(id);
    }

    public List<Participant> defaultParticipants(String raceId){
        return new ArrayList<Participant>();
    }

}
