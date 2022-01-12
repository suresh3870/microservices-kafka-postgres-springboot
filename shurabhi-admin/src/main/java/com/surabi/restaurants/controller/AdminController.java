package com.surabi.restaurants.controller;

import com.surabi.restaurants.DTO.BillDTO;
import com.surabi.restaurants.DTO.MaxSaleDayDTO;
import com.surabi.restaurants.DTO.SaleDTO;
import com.surabi.restaurants.entity.User;
import com.surabi.restaurants.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/surabi/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/GetAllUser")
    public List<User> getAllUser() {
        return adminService.getAllUser();
    }

    @GetMapping("/CreateUser")
    public String CreateUser(User user) {
        return adminService.CreateUser(user);
    }

    @GetMapping("/UpdateUser")
    public String UpdateUser(User user) {
        return adminService.UpdateUser(user);
    }

    @GetMapping("/DeleteUser")
    public String deleteUser(String userName) {
        return adminService.deleteUser(userName);
    }

    @GetMapping("/TotalSellByMonth")
    public double totalSellByMonth(@RequestParam(value = "MonthID", defaultValue = "11")int monthID, @RequestParam(value = "YearID", defaultValue = "2021")int year) {
        return adminService.totalSellByMonth(monthID, year);
    }

    @GetMapping("/ViewAllBills")
    public List<BillDTO>  viewTodaysBills() {
        return adminService.viewTodayBills();
    }

    @GetMapping("/ViewMyBills")
    public List<BillDTO>  viewMyBills(String userName) {
        return adminService.viewMyBills(userName);
    }

    @GetMapping("/ViewSaleByCity")
    public List<SaleDTO>  viewSaleByCity() {
        return adminService.viewSaleByCity();
    }

    @GetMapping("/ViewSaleByMonth")
    public List<MaxSaleDayDTO>  viewSaleByMonth() {
        return adminService.viewSaleByMonth();
    }

    @GetMapping("/ViewMaxSaleInAMonthAndYear")
    public List<MaxSaleDayDTO>  viewMaxSaleInAMonth() {
        return adminService.viewMaxSaleInAMonth();
    }

}
