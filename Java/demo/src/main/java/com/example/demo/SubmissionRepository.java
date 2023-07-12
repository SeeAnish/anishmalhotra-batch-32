package com.example.demo;

import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class SubmissionRepository implements SubmissionInterface
{
    Map<String, SubmissionForm> map = new HashMap<>();
    @Override
    public SubmissionForm postSubmission(SubmissionForm sf) {
        String id = String.valueOf(UUID.randomUUID());
        sf.setId(id);
        map.put(id, sf);
        return (SubmissionForm) map.get(id);
    }

    @Override
    public SubmissionForm getSubmissionFormById(String id) {
        SubmissionForm record = new SubmissionForm();
        record = (SubmissionForm) map.get(id);
        return record;
    }

    @Override
    public List<SubmissionForm> getallSubmissions() {
        List<SubmissionForm> list = new ArrayList<>();
        map.forEach((key, value) -> list.add(value));
        return list;
    }

    @Override
    public SubmissionForm editSubmission(SubmissionForm sf) {
        map.put(sf.Id, sf);
        return map.get(sf.Id);
    }

    @Override
    public List<SubmissionForm> deleteSubmission(String id){
        map.remove(id);
        List<SubmissionForm> list = new ArrayList<>();
        map.forEach((key, value) -> list.add(value));
        return list;
    }

}
