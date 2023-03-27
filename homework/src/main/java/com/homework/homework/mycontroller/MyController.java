package com.homework.homework.mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homework.homework.home.Home;
import com.homework.homework.services.ServiceImpl;

import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
public class MyController {
    
    @Autowired
    private ServiceImpl HomeService;
    
    @PostMapping("/load")
    public String addload(@RequestBody Home load){
        return HomeService.addload(load);
    }
    @GetMapping("/load")
    public List<Home> getloads(@RequestParam (name="shipperId") String shipperId){
        return HomeService.getloads(shipperId);
    }
    @GetMapping("/load/{loadId}")
    public Home getload(@PathVariable long loadId){
        return HomeService.getload(loadId);
    }
    @PutMapping("/load/{loadId}")
    public String putload(@PathVariable long loadId,@RequestBody Home load){
        return HomeService.putload(loadId,load);
    }
    @DeleteMapping("/load/{loadId}")
    public String deleteload(@PathVariable long loadId){
        return HomeService.deleteload(loadId);
    }
}