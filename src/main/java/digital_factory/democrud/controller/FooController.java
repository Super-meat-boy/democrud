package digital_factory.democrud.controller;

import digital_factory.democrud.model.Foo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/foos")
class FooController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Foo> findAll() {
        List<Foo> Foo = new ArrayList<>();
        Foo Foo1 = new Foo("Foo1000");
        Foo Foo2 = new Foo("Foo 2");
        Foo Foo3 = new Foo("Foo 3");
        Foo Foo4 = new Foo("Foo 4");
        Foo Foo5 = new Foo("Foo 5");
        Foo.add(Foo1);
        Foo.add(Foo2);
        Foo.add(Foo3);
        Foo.add(Foo4);
        Foo.add(Foo5);
        return Foo;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Long create(@RequestBody Foo resource) {
        System.out.println("Tentative de création de " + resource);
        return 1L;
    }

}