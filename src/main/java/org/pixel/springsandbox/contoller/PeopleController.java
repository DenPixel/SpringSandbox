package org.pixel.springsandbox.contoller;

import org.pixel.springsandbox.dao.PersonDAO;
import org.pixel.springsandbox.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping
    public String getPeople(Model model) {
        model.addAttribute("people", personDAO.getPeople());

        return "people/people";
    }

    @GetMapping("/{id}")
    public String getPerson(@PathVariable("id") int id,
                            Model model) {
        model.addAttribute("person", personDAO.getPerson(id));

        return "people/person";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person) {
        return "people/new";
    }

    @PostMapping
    public String createPerson(@ModelAttribute("person") Person person) {
        personDAO.save(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable("id") int id,
                           Model model) {

        model.addAttribute("person", personDAO.getPerson(id));

        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable("id") int id,
                         @ModelAttribute("person") Person person) {

        personDAO.update(id, person);

        return "redirect:/people/{id}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        personDAO.delete(id);

        return "redirect:/people";
    }
}
