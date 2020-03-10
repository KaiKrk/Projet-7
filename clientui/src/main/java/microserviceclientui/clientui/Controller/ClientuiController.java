package microserviceclientui.clientui.Controller;

import microserviceclientui.clientui.Beans.BookBean;
import microserviceclientui.clientui.Model.AuthenticationRequest;
import microserviceclientui.clientui.Model.AuthenticationResponse;
import microserviceclientui.clientui.proxies.MicroserviceBookProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClientuiController {


    @Autowired
    MicroserviceBookProxy microserviceBookProxy;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("books")
    public String books(){
        List<BookBean> books = microserviceBookProxy.books();
        return "books";
    }



}


