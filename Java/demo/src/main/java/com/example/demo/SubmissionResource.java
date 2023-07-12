package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/sub-mission")
public class SubmissionResource implements SubmissionInterface
{
    @Autowired
    private SubmissionService ss;
    @Override
    @PostMapping("/postSubmission")
    public SubmissionForm postSubmission(@RequestBody SubmissionForm sf) {
        return ss.postSubmission(sf);
    }
    @Override
    @GetMapping("/getSubmission/{id}")
    public SubmissionForm getSubmissionFormById(@PathVariable String id){
        return ss.getSubmissionFormById(id);
    }
    @Override
    @GetMapping("/getallSubmissions")
    public List<SubmissionForm> getallSubmissions() {
        return ss.getallSubmissions();
    }
    @Override
    @PutMapping("/editing")
    public SubmissionForm editSubmission(@RequestBody SubmissionForm sf) {
        return ss.editSubmission(sf);
    }
    @Override
    @DeleteMapping("/deleting/{id}")
    public List<SubmissionForm> deleteSubmission(@PathVariable String id){
        return ss.deleteSubmission(id);
    }
}
