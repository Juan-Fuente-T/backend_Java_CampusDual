package com.campusdual.appmazing_2024.controller;

import com.campusdual.appmazing_2024.api.IProductService;
import com.campusdual.appmazing_2024.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;
    @GetMapping
    public String testController(){
        return "Products controller works!";
    }
    @PostMapping
    public String testControllerPost(@RequestBody String name){
        return "Products controller POST works! " + name + "!";
    }
    @GetMapping(value = "/testMethod")
    public String testControllerGet2() {
        return "El metodo del controller Get2 funciona ok!";
    }
    @PostMapping(value= "/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO productDTO){
        return this.productService.queryProduct(productDTO);
    }
    @GetMapping(value = "/getAll")
    public List<ProductDTO> queryAllProducts(){
        return productService.queryAllProducts();
        }
    @PostMapping(value = "/add")
    public int addProduct (@RequestBody ProductDTO productDTO) {
        return productService.insertProduct(productDTO);
    }
    @PutMapping(value = "/update")
    public int updateProduct(@RequestBody ProductDTO productDTO){
        return productService.updateProduct(productDTO);
    }
    @DeleteMapping(value = "/delete")
    public int deleteProduct(@RequestBody ProductDTO productDTO){
        return productService.deleteProduct(productDTO);
    }
}
