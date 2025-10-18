package com.ejemplo.factura;

import com.ejemplo.factura.models.Item;
import com.ejemplo.factura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        return Arrays.asList(new Item(new Product("Sony", 1.5), 2), new Item(new Product("Bianchi", 150.150), 10));
    }

}
