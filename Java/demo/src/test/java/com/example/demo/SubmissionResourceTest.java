package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SubmissionResourceTest
{
    @Mock
    private SubmissionService submissionService;
    @InjectMocks
    private SubmissionResource submissionResource;
    @Test
    public void postSubmissionTest() {
        SubmissionForm sf = new SubmissionForm();
        sf.setId("1");
        when(submissionService.postSubmission(any(SubmissionForm.class))).thenReturn(sf);
        SubmissionForm result =  submissionResource.postSubmission(sf);
        assertEquals("1",result.getId());
    }
    @Test
    public void GetSubmissionFormByIdTest() {
        SubmissionForm sf = new SubmissionForm();
        sf.setId("1");
        when(submissionService.getSubmissionFormById(eq("1"))).thenReturn(sf);
        SubmissionForm result =  submissionResource.getSubmissionFormById("1");
        assertEquals("1",result.getId());
    }
    @Test
    public void GetAllSubmissionsTest() {
        SubmissionForm sf1 = new SubmissionForm();
        sf1.setId("1");
        SubmissionForm sf2 = new SubmissionForm();
        sf2.setId("2");
        when(submissionService.getallSubmissions()).thenReturn(Arrays.asList(sf1,sf2));
        List<SubmissionForm> result =  submissionResource.getallSubmissions();
        assertEquals(2, result.size());
    }
    @Test
    public void EditSubmissionTest() {
        SubmissionForm sf = new SubmissionForm();
        sf.setId("1");
        when(submissionService.editSubmission(any(SubmissionForm.class))).thenReturn(sf);
        SubmissionForm result =  submissionResource.editSubmission(new SubmissionForm());
        assertEquals("1",result.getId());
    }
    @Test
    public void DeleteSubmissionTest() {
        SubmissionForm sf = new SubmissionForm();
        sf.setId("1");
        SubmissionForm sf2 = new SubmissionForm();
        sf2.setId("2");
        when(submissionService.deleteSubmission(eq("1"))).thenReturn(Arrays.asList(sf2));
        List<SubmissionForm> result =  submissionResource.deleteSubmission("1");
        assertEquals(1,result.size());
    }
}
