package com.ejemplo.factura.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Invoice {
    @Autowired
    private Client client;
    private String description;
    private List<Item> items;
}
