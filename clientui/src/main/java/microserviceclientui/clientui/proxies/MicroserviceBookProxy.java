package microserviceclientui.clientui.proxies;

import microserviceclientui.clientui.Beans.BookBean;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.print.Book;
import java.util.List;

@FeignClient(name = "microservice-book", url = "localhost:9001")
public interface MicroserviceBookProxy {

    @GetMapping("/books")
    List<BookBean> books();

    @GetMapping("/books/{id}")
    BookBean getBook(@PathVariable("id") int id);
}
