package com.orange.entity;

import java.util.List;

/**
 * Created by Karim on 8/8/2017.
 */
public class RaceWithParticipants extends Race{
    private List<Participant> participants;

    public RaceWithParticipants(Race r, List<Participant> participants) {
        super(r.getName(), r.getId(), r.getState(), r.getCity());
        this.participants = participants;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
