package edu.vwcc.careertrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.vwcc.careertrack.model.JobApplication;
import edu.vwcc.careertrack.service.JobApplicationService;

@Controller
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        var applications = service.getAllApplications();

        model.addAttribute("applications", applications);
        model.addAttribute("totalCount", applications.size());
        model.addAttribute("interviewCount", applications.stream()
                .filter(app -> "Interviewing".equalsIgnoreCase(app.getStatus()))
                .count());
        model.addAttribute("offerCount", applications.stream()
                .filter(app -> "Offer".equalsIgnoreCase(app.getStatus()))
                .count());
        model.addAttribute("acceptedCount", applications.stream()
                .filter(app -> "Accepted".equalsIgnoreCase(app.getStatus()))
                .count());

        return "applications";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("application", new JobApplication());
        return "add-application";
    }

    @PostMapping("/save")
    public String saveApplication(@ModelAttribute JobApplication application) {
        service.saveApplication(application);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("application", service.getApplicationById(id));
        return "edit-application";
    }

    @GetMapping("/delete/{id}")
    public String deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
        return "redirect:/";
    }
}