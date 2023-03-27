package com.homework.homework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.homework.home.Home;
import com.homework.homework.homedao.HomeDao;

import java.util.List;

@Service
public class ServiceImpl {
    
    @Autowired
    private HomeDao HomeRepository;
    
    public String addload(Home load){
        HomeRepository.save(load);
        return "Load details Added Successfully!";
    }
    public List<Home> getloads(String shipperId){
        return HomeRepository.findByShipperId(shipperId);
    }
    public Home getload(long loadId){
        Home l=HomeRepository.findById(loadId).orElse(null);
        return l;
    }
    public String putload(long loadId,Home load){
        Home l = HomeRepository.findById(loadId).orElse(null);
    if (l == null) {
        return "Load Not Found";
    }
    l.setLoadingPoint(load.getLoadingPoint());
    l.setUnloadingPoint(load.getUnloadingPoint());
    l.setProductType(load.getProductType());
    l.setTruckType(load.getTruckType());
    l.setNoOfTrucks(load.getNoOfTrucks());
    l.setWeight(load.getWeight());
    l.setComment(load.getComment());
    l.setDate(load.getDate());
    HomeRepository.save(l);
    return "Load Updated";
    
}

    public String deleteload(long loadId){
        Home l=HomeRepository.findById(loadId).orElse(null);
        if(l==null){
            return "Load Not Found";
        }
        HomeRepository.delete(l);
        return "Load Deleted";
    }
}