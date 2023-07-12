package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class SubmissionRepositoryTest {
    private SubmissionRepository repository;
    @BeforeEach
    public void setUp() {
        repository = new SubmissionRepository();
    }
    @Test
    public void postSubmissionTest() {
        SubmissionForm form = new SubmissionForm();
        form.setVendorName("TestVendor");
        form.setRate(5);
        form.setLeadName("TestLead");
        form.setTechnology("TestTech");
        form.setName("Shiva");

        SubmissionForm result = repository.postSubmission(form);
        assertNotNull(result);
        assertEquals("TestVendor", result.getVendorName());
        assertEquals(5, result.getRate());
        assertEquals("TestLead", result.getLeadName());
        assertEquals("TestTech", result.getTechnology());
        assertEquals("Shiva", result.getName());
        assertNotNull( result.getId());
    }
    @Test
    public void GetSubmissionFormByIdTest() {
        SubmissionForm form = new SubmissionForm();
        form.setVendorName("TestVendor");
        form.setRate(5);
        form.setLeadName("TestLead");
        form.setTechnology("TestTech");
        form.setName("Shiva");

        SubmissionForm sf = repository.postSubmission(form);
        SubmissionForm result = repository.getSubmissionFormById(sf.getId());
        assertEquals(sf.getName(), result.getName());
        assertEquals(sf.getVendorName(), result.getVendorName());
        assertEquals(sf.getRate(), result.getRate());
        assertEquals(sf.getLeadName(), result.getLeadName());
        assertEquals(sf.getTechnology(), result.getTechnology());
    }
    @Test
    public void GetAllSubmissionsTest() {
        SubmissionForm form1 = new SubmissionForm();
        form1.setName("Shiva");
        form1.setVendorName("TestVendor");
        form1.setRate(5);
        form1.setLeadName("TestLead");
        form1.setTechnology("TestTech");

        SubmissionForm form2 = new SubmissionForm();
        form2.setName("Dinesh");
        form2.setVendorName("Vendor2");
        form2.setRate(35);
        form2.setLeadName("Lead2");
        form2.setTechnology("Technology2");

        repository.postSubmission(form1);
        repository.postSubmission(form2);

        List<SubmissionForm> result = repository.getallSubmissions();
        assertEquals(2, result.size());
    }
    @Test
    public void EditSubmissionTest() {
        SubmissionForm form = new SubmissionForm();
        form.setName("Shiva");
        form.setVendorName("TestVendor");
        form.setRate(5);
        form.setLeadName("TestLead");
        form.setTechnology("TestTech");

        SubmissionForm sf = repository.postSubmission(form);
        sf.setName("Anish");
        sf.setVendorName("Manohar");
        sf.setRate(35);
        sf.setLeadName("Lead2");
        sf.setTechnology("Technology2");

        SubmissionForm result = repository.editSubmission(sf);
        assertEquals("Anish", result.getName());
        assertEquals("Manohar", result.getVendorName());
        assertEquals(35, result.getRate());
        assertEquals("Lead2", result.getLeadName());
        assertEquals("Technology2", result.getTechnology());
    }

    @Test
    public void DeleteSubmissionTest() {
        SubmissionForm form = new SubmissionForm();
        form.setName("Shiva");
        form.setVendorName("TestVendor");
        form.setRate(5);
        form.setLeadName("TestLead");
        form.setTechnology("TestTech");

        SubmissionForm sf = repository.postSubmission(form);
        List<SubmissionForm> result = repository.deleteSubmission(sf.getId());
        assertEquals(0, result.size());
    }
}
