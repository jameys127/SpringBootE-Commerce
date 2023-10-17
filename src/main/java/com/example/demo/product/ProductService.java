package com.example.demo.product;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    public String getProduct(){
        Product iPhone = new Product("iphone", 899.99, "crazy cool stuff");
        return "This iphone is priced at: " + iPhone.getPrice() + " and is described as: "
                + iPhone.getDescription();

    }

//    public List<Product> getProduct(){
  //      return List.of(
    //            new Product(
      //                  202839150,
        //                "IPhone 13",
          //              899.99,
            //            "The newest Iphone on the market currently!"
              //  )
        //);
    //}
}
