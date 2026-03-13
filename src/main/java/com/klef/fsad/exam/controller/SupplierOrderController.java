package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;

@RestController
@RequestMapping("/supplierorder")
public class SupplierOrderController {

    @Autowired
    private SupplierOrderService supplierOrderService;

    @PostMapping("/add")
    public SupplierOrder addSupplierOrder(@RequestBody SupplierOrder supplierOrder) {
        return supplierOrderService.addSupplierOrder(supplierOrder);
    }

    @GetMapping("/all")
    public List<SupplierOrder> getAllSupplierOrders() {
        return supplierOrderService.getAllSupplierOrders();
    }
}
