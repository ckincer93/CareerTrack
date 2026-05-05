package edu.vwcc.careertrack.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import edu.vwcc.careertrack.model.JobApplication;
import edu.vwcc.careertrack.repository.JobApplicationRepository;

public class JobApplicationServiceTests {

    @Test
    void testGetAllApplications() {

        JobApplicationRepository repository =
                Mockito.mock(JobApplicationRepository.class);

        JobApplicationService service =
                new JobApplicationService(repository);

        JobApplication app = new JobApplication();
        app.setCompanyName("Sample Company");

        when(repository.findAll())
                .thenReturn(List.of(app));

        List<JobApplication> results =
                service.getAllApplications();

        assertEquals(1, results.size());
    }
}