package com.ejemplo.factura.models;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description.office}")
    private String description;

    @Autowired
    @Qualifier("default")
    private List<Item> items;

    public Invoice(){
        System.out.println("Iniciando Invoice...");
        System.out.println(client);
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct invoice...");
        System.out.println(client.getName());
        client.setName(client.getName().concat(" Pepe"));
        System.out.println(client.getName());
        System.out.println(client.getLastname());
        client.setLastname(client.getLastname().concat(" Pepe"));
        System.out.println(client.getLastname());
    }

    public Double getTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

}
