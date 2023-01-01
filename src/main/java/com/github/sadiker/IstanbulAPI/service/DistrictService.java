package com.github.sadiker.IstanbulAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sadiker.IstanbulAPI.models.district.District;
import com.github.sadiker.IstanbulAPI.models.district.NoDistrict;
import com.github.sadiker.IstanbulAPI.models.district.ReplyDistrict;
import com.github.sadiker.IstanbulAPI.repository.DistrictRepository;

@Service
public class DistrictService {

    @Autowired
    NoDistrict noDistrict;

    @Autowired
    DistrictRepository districtRepository;

    public List<District> getAll() {
        return districtRepository.findAll();
    }

    public ReplyDistrict getById(Long id) {
        Optional<District> optional =  districtRepository.findById(id);
        if(optional.isPresent()) {
            return  districtRepository.findById(id).get();
        } else {
            return  noDistrict;

        }
    }

 

}
