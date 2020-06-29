package com.staff.staff.controllers;

import com.staff.staff.models.Staff;
import com.staff.staff.repo.StaffRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private final StaffRepository staffRepository;

    public LoginController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping("/login")
    public String login(Model model) {
        Iterable<Staff> staffs = staffRepository.findAll();
        model.addAttribute("staffs", staffs);
        return "login";

    }
}
