package com.example.demo.bootstrap;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (partRepository.count() == 0) {
            Part intelCpu = new Part("i7-14700k", 399.99, 150, 10, 300);
            Part nvidiaGpu = new Part("RTX 4080", 1099.99, 100, 10, 300);
            Part psu = new Part("850 Watt PSU", 99.99, 250, 10, 300);
            Part ram = new Part("32 Gb RAM", 129.99, 220, 10, 300);
            Part pcCase = new Part("PC Case", 79.99, 200, 10, 300);

            partRepository.save(intelCpu);
            partRepository.save(nvidiaGpu);
            partRepository.save(psu);
            partRepository.save(ram);
            partRepository.save(pcCase);

        }
        if (productRepository.count() == 0) {
            Product intro = new Product(1, "Introductory PC", 479.99, 100);
            Product beginner = new Product(2, "Beginner PC", 979.99, 100);
            Product enthusiast = new Product(3, "Enthusiast PC", 1479.99, 100);
            Product professional = new Product(4, "Professional PC", 1979.99, 100);
            Product ultra = new Product(5, "Ultra PC", 2479.99, 100);

            productRepository.save(intro);
            productRepository.save(beginner);
            productRepository.save(enthusiast);
            productRepository.save(professional);
            productRepository.save(ultra);

        }

        List<Part> partsList =(List<Part>) partRepository.findAll();
        for(Part part:partsList){
            System.out.println(part.getName());
        }

        List<Product> productList =(List<Product>) productRepository.findAll();
        for(Product product:productList){
            System.out.println(product.getName());
        }
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
