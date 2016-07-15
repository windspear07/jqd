package com.windspear.st.web;

import com.windspear.st.domain.D2;
import com.windspear.st.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
@Slf4j
public class MyRestController {

    @Autowired
    private D2 d2;

    @RequestMapping("/")
    public String itest(){
        log.info("it my first test. where is the config ? {}" , d2.getName());
        return "hello ----. its works right..!!!!";
    }

    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        User u = new User();
        u.setAge(1);
        u.setName("jack");

        return u;
    }

    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
    List<User> getUserCustomers(@PathVariable Long user) {
        // ...

        return null;
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        // ...

        return null;
    }

}
