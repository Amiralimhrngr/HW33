package ir.maktabsharif.controller;

import ir.maktabsharif.model.StudySession;
import ir.maktabsharif.service.StudySessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("/sessions")
public class SessionController {
    private final StudySessionService sessionService;

    @Autowired
    public SessionController(StudySessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping({"", "/"})
    public String displayAll(Model model) {
        model.addAttribute("sessions", sessionService.findAll());
        return "session-list";
    }

    @GetMapping("/add")
    public String emptyForm() {
        return "add-session";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam Long id, Model model) {
        StudySession session = sessionService.findById(id);
        if (Optional.ofNullable(session).isEmpty()) {
            return "redirect:/sessions";
        }
        model.addAttribute("sessionById", session);
        return "session-detail";
    }

    @PostMapping("/save")
    public String saveSession(@ModelAttribute StudySession studySession) {
        sessionService.add(studySession);
        return "redirect:/sessions";
    }

}
