package ie.atu.prelab2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<Product> myList = new ArrayList<>();

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/getProduct")
    public Product getProduct()
    {
        Product myProduct = new Product("Tv", 499);
            return myProduct;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product myProduct)
    {
        myList.add(myProduct);
        return myProduct;
    }

}
