package ir.maktabsharif.controller;

import ir.maktabsharif.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subjects")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping({"", "/"})
    public String subjects(Model model) {
        model.addAttribute("subjects", subjectService.findAll());
        return "subject-list";
    }
}
