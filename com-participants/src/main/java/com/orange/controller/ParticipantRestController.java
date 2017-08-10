package com.orange.controller;

import com.orange.entity.Participant;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Karim on 8/8/2017.
 */
@RestController
public class ParticipantRestController {

    private static List<Participant> participants = new ArrayList<Participant>();

    {
        participants.add(new Participant("Ryan", "Baxter", "MA", "S", Arrays.asList("123", "456")));
        participants.add(new Participant("Stephanie", "Baxter", "MA", "S", Arrays.asList("456")));
    }

    @RequestMapping("/")
    public List<Participant> getParticipants() {
        return participants;
    }

    @RequestMapping("/races/{id}")
    public List<Participant> getParticipants(@PathVariable String id) {
        return participants.stream().filter(p -> p.getRaces().contains(id)).collect(Collectors.toList());
    }

}
