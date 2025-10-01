package com.civica.tiendaOnline.dto;

import java.util.List;

public class CategoryDTO {

    private Long id;
    private String name;
    private List<String> productNames;

    public CategoryDTO(Long id, String name, List<String> productNames) {
        this.id = id;
        this.name = name;
        this.productNames = productNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    public String toString() {
        return "CategoryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productNames=" + productNames +
                '}';
    }
}
