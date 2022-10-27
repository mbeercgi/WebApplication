package com.example.WebApplication.controller;

import com.example.WebApplication.entity.MaSuche;
import com.example.WebApplication.repository.MaSucheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class MaSucheController {

    @Autowired
    MaSucheRepository maSucheRepository;
/*
    @GetMapping("/masuche/{anmeldename}")
    public ResponseEntity<MaSuche> getMaSucheById(@PathVariable("anmeldename") String anmeldename) {
        Optional<MaSuche> maSuche = maSucheRepository.findById(anmeldename);
        if(maSuche.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(maSuche.get(), HttpStatus.OK);
    }

    @GetMapping("/masuche/derived")
    public ResponseEntity<HttpStatus> getCustomQuery() {

        maSucheRepository.findAllMaSuche().forEach(p -> System.out.println(p.toString()));
        return new ResponseEntity<>(HttpStatus.OK);

        maSucheRepository.findByNameLike("anmeldename 1")
                .forEach(anmeldename -> System.out.println(.toString()));

        return new ResponseEntity<>(HttpStatus.OK);
    }
 */

    @GetMapping("/masuche")
    public ResponseEntity<List<MaSuche>> getMaSucheById (@RequestParam String anmeldename){
        return new ResponseEntity<List<MaSuche>>(maSucheRepository.findByAnmeldenameLike("%"+anmeldename+"%"), HttpStatus.OK);
    }

}

