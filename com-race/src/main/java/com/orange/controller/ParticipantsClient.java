package com.orange.controller;

import com.orange.entity.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Karim on 8/8/2017.
 */
@FeignClient("participants")
public interface ParticipantsClient {

    @RequestMapping(method = RequestMethod.GET, value="/races/{raceId}")
    List<Participant> getParticipants(@PathVariable("raceId") String raceId);

}
