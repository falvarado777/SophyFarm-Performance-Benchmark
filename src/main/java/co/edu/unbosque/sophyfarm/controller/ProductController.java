package co.edu.unbosque.sophyfarm.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.sophyfarm.model.Product;
import co.edu.unbosque.sophyfarm.service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam(required = false) String query,
                                @RequestParam(required = false) Short category,
                                @RequestParam(required = false) BigDecimal minPrice) {
        return service.search(query, category, minPrice);
    }

    @GetMapping("/products/{id}/details")
    public Product details(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/inventory/low-stock")
    public List<Product> lowStock() {
        return service.lowStock();
    }
}
