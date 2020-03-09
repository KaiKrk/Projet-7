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

//    @Autowired
//    private JwtUtil jwtTokenUtil;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private MyUserDetailsService userDetailsService;

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


//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
//
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
//            );
//        }
//        catch (BadCredentialsException e) {
//            throw new Exception("Incorrect username or password", e);
//        }
//
//
//        final UserDetails userDetails = userDetailsService
//                .loadUserByUsername(authenticationRequest.getUsername());
//
//        final String jwt = jwtTokenUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(new AuthenticationResponse(jwt));
//    }

}


