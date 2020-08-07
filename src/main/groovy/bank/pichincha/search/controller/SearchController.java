package bank.pichincha.search.controller;

import bank.pichincha.search.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/rest/v1")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping(value = "/get")
    public String search(@RequestHeader Integer id) {
        String name = "";
        try {
            name = searchService.get(id);
        } catch (Exception e) {
            System.out.println("Generate error search");
            System.out.println(e.getMessage());
        }

        return name;
    }

    @PostMapping(value = "/create")
    public String create(@RequestHeader String name) {
        try {
            searchService.create(name);
        } catch (Exception e) {
            System.out.println("Generate error in create");
            System.out.println(e.getMessage());
        }

        return "I created user";
    }

    @PostMapping(value = "/update")
    public String update(@RequestHeader Integer id, @RequestHeader String name) {
        try {
            searchService.update(id, name);
        } catch (Exception e) {
            System.out.println("Generate error in update");
            System.out.println(e.getMessage());
        }

        return "I updated user";
    }


    @PostMapping(value = "/delete")
    public String delete(@RequestHeader Integer id) {
        try {
            searchService.delete(id);
        } catch (Exception e) {
            System.out.println("Generate error in delete");
            System.out.println(e.getMessage());
        }

        return "I deleted user";
    }

}
