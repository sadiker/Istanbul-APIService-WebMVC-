package com.github.sadiker.IstanbulAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sadiker.IstanbulAPI.models.district.District;
import com.github.sadiker.IstanbulAPI.models.district.NoDistrict;
import com.github.sadiker.IstanbulAPI.models.district.ReplyDistrict;
import com.github.sadiker.IstanbulAPI.models.district.Result;
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
    public Result getDistrictByContinent(String continent) {
        if (districtRepository.findDistrictByContinent(continent).size()>0) {
            return new Result(true, "İstek Başarılı", districtRepository.findDistrictByContinent(continent));
        } else {
            return new Result(false, "İstanbul sadece Anadolu,Avrupa ve Adalar'dan oluşur ..!", null);
        }

    }

    public ReplyDistrict getByName(String name) {
        Optional<District> optional = districtRepository.findByName(name);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return noDistrict;
        }

    }

    public Result getDistrictByDescPopulation(Long population) {
List<District> list = districtRepository.findDistrictByDescPopulation(population);
        if(list.size()>0){
            return new Result(true, "İstek Başarılı", list);
        } else {
            return new Result(false, "O miktardan yüksek nüfuslu ilçe yok", null);
        }

    }

    public Result deleteById(Long id) {
        if(districtRepository.findById(id).isPresent()){
            districtRepository.deleteById(id);
            return new Result(true, "O id'deki ilçe silindi..",districtRepository.findAll());
        } else {
            return new Result(false, "O id'de ilçe yok silinemedi", districtRepository.findAll());
        }
        
    }

    public Result update(District district, Long id) { 
        if(districtRepository.findById(id).isPresent()) {
            districtRepository.save( district);
            return new Result(true, "İlçe bilgileri güncellendi", getAll());
        } else {
            return new Result(false, "İlçe bilgileri güncellenemedi,O id'de ilçe yok", getAll());
        }  
    }

    public ReplyDistrict createDistrict(District district) {
        districtRepository.save(district);
        return district;
    }

 

}
