package com.example.demo;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class SubmissionServiceTest
{
	@Mock
	private SubmissionRepository submissionRepository;
	@InjectMocks
	private SubmissionService submissionService;
	@Test
	public void testPostSubmission() {
		SubmissionForm sf = new SubmissionForm();
		sf.setId("1");
		when(submissionRepository.postSubmission(any(SubmissionForm.class))).thenReturn(sf);
		SubmissionForm result = submissionService.postSubmission(new SubmissionForm());
		assertEquals("1", result.getId());
	}
	@Test
    public void testGetSubmissionFormById() {
		SubmissionForm sf = new SubmissionForm();
		sf.setId("1");
		when(submissionRepository.getSubmissionFormById(eq("1"))).thenReturn(sf);
		SubmissionForm result = submissionService.getSubmissionFormById("1");
		assertEquals("1", result.getId());
	}
	@Test
    public void testGetAllSubmissions() {
		SubmissionForm sf1 = new SubmissionForm();
		sf1.setId("1");
		SubmissionForm sf2 = new SubmissionForm();
        sf2.setId("2");
        when(submissionRepository.getallSubmissions()).thenReturn(Arrays.asList(sf1, sf2));
		List<SubmissionForm> result = submissionService.getallSubmissions();
		assertEquals(2, result.size());
	}

	@Test
	public void testEditSubmission() {
		SubmissionForm  sf = new SubmissionForm();
		sf.setId("1");
		when(submissionRepository.editSubmission(any(SubmissionForm.class))).thenReturn(sf);
		SubmissionForm result = submissionService.editSubmission(new SubmissionForm());
		assertEquals("1", result.getId());
	}

	@Test
	public void testDeleteSubmission() {
		SubmissionForm sf = new SubmissionForm();
		sf.setId("1");
		when(submissionRepository.deleteSubmission(eq("1"))).thenReturn(Arrays.asList());
		List<SubmissionForm> result = submissionService.deleteSubmission("1");
		assertEquals(0, result.size());
	}

}
