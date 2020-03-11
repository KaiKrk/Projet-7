package microserviceclientui.clientui.Controller;

import microserviceclientui.clientui.Beans.BookBean;
import microserviceclientui.clientui.proxies.MicroserviceBookProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ClientuiController {


    @Autowired
    MicroserviceBookProxy microserviceBookProxy;
    @GetMapping("/")
    public String hi(){
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/books")
    public String books(@RequestHeader("Authorization") String authHeader,Model model){
        List<BookBean> books = microserviceBookProxy.books();
        model.addAttribute("produits",books);
        return "books";
    }



}


