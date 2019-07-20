package com.bootcamp.hibernate.invoice.dao;

import com.bootcamp.hibernate.invoice.Invoice;
import com.bootcamp.hibernate.invoice.Item;
import com.bootcamp.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("book");
        Product product2 = new Product("bread");
        Product product3 = new Product("bike");

        Item item1 = new Item(product1, new BigDecimal("30"), 2);
        Item item2 = new Item(product2, new BigDecimal("5"), 1);
        Item item3 = new Item(product3, new BigDecimal("2000"), 1);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("1/1/2019");
        invoice.setItems(items);

        // When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // Then
        Assert.assertEquals(3, productDao.count());
        Assert.assertEquals(3, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, id);

        // Cleanup
        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {

        }
    }
}