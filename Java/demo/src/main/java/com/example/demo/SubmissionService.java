package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService implements SubmissionInterface
{
    @Autowired
    private SubmissionRepository sr;
    @Override
    public SubmissionForm postSubmission(SubmissionForm sf) {
        return sr.postSubmission(sf);
    }
    @Override
    public SubmissionForm getSubmissionFormById(String id){
        return sr.getSubmissionFormById(id);
    }
    @Override
    public List<SubmissionForm> getallSubmissions() {
        return sr.getallSubmissions();
    }
    @Override
    public SubmissionForm editSubmission(SubmissionForm sf) {
        return sr.editSubmission(sf);
    }
    @Override
    public List<SubmissionForm> deleteSubmission(String id){
        return sr.deleteSubmission(id);
    }
}
