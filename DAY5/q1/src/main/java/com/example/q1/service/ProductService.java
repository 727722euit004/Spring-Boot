package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.repository.ProductRepo;
import com.example.springapp.model.Product;

@Service
public class ProductService {
    @Autowired
    ProductRepo obj;
    public List<Product> getProducts()
    {
       return obj.findAll();
    }
    public Product postProduct(Product newProduct)
    {
        return obj.save(newProduct);
    }
    public Product updateProduct(int id,Product newProduct)
    {
        Product p1=obj.findById(id).orElse(null);
        if(p1!=null)
        {
            p1.setProductDescription(newProduct.getProductDescription());
            p1.setProductName(newProduct.getProductName());
            return obj.saveAndFlush(p1);
        }
        else{
            return null;
        }
    }
    public Boolean deleteProduct(int id)
    {
        try{
        obj.deleteById(id);
        return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
