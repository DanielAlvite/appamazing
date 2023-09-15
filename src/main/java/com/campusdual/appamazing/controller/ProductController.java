package com.campusdual.appamazing.controller;

import com.campusdual.appamazing.api.IProductsService;
import com.campusdual.appamazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductsService productsService;

    @PostMapping
    public String testController(@RequestBody String name){
        return "Products controller works " + name + " !!";
    }

    @PostMapping("/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO productDTO){
        return this.productsService.queryProduct(productDTO);
    }

    @GetMapping("/get/{id}")
    public ProductDTO queryProduct(@PathVariable int id){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(id);
        return this.productsService.queryProduct(productDTO);
    }
    @GetMapping("/getAll")
    public List<ProductDTO> queryAllProducts(){
        return this.productsService.queryAllProducts();
    }

    @PostMapping("/add")
    public int addProducts(@RequestBody ProductDTO productDTO){
        return this.productsService.insertProduct(productDTO);
    }

    @PutMapping("/update")
    public int updateProducts(@RequestBody ProductDTO productDTO){
        return this.productsService.updateProduct(productDTO);

    }
    @PutMapping("/delete")
    public int deleteProducts(@RequestBody ProductDTO productDTO){
        return this.productsService.deleteProduct(productDTO);

    }

}
