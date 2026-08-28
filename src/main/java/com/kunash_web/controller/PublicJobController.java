package com.kunash_web.controller;

import com.kunash_web.dto.response.ApiResponse;
import com.kunash_web.dto.response.JobResponse;
import com.kunash_web.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PublicJobController {

    private final JobService jobService;

    public PublicJobController(JobService jobService) {
        this.jobService = jobService;
    }

    /**
     * PUBLIC API: Get all ACTIVE jobs
     * Website visitors can see job listings without logging in
     */
    @GetMapping("/jobs")
    public ResponseEntity<ApiResponse<List<JobResponse>>> getActiveJobs() {
        List<JobResponse> jobs = jobService.getActiveJobs();
        return ResponseEntity.ok(
                ApiResponse.success("Active jobs retrieved successfully", jobs)
        );
    }
}