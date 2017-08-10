package com.orange.controller;

import com.orange.entity.ParticipantsBean;
import com.orange.entity.Race;
import com.orange.entity.RaceWithParticipants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karim on 8/8/2017.
 */
@RestController
public class RaceRestController {

    @Autowired
    ParticipantsBean participantsBean;

    private static List<Race> races = new ArrayList<>();

    {
        races.add(new Race("Spartan Beast", "123", "MA", "Boston"));
        races.add(new Race("Tough Mudder RI", "456", "RI", "Providence"));
    }

    @RequestMapping("/")
    public List<Race> getRaces() {
        return races;
    }

    @RequestMapping("/participants")
    public List<RaceWithParticipants> getRacesWithParticipants() {
        List<RaceWithParticipants> returnRaces = new ArrayList<RaceWithParticipants>();
        for(Race r : races) {
            returnRaces.add(new RaceWithParticipants(r, participantsBean.getParticipants(r.getId())));
        }
        return returnRaces;
    }
}
