package com.example.demo.controller;

import com.example.demo.model.entity.Phone;
import com.example.demo.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/phoneRest")
public class PhoneRestController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = {"/", "/list"})
    public ResponseEntity<Page<Phone>> goListPhone (@RequestParam(name = "page", defaultValue = "0") int page){
        Sort sort = Sort.by("name").and(Sort.by("id")).ascending();
        Page<Phone> phoneList = phoneService.findAll(PageRequest.of(page,2,sort));
        return new ResponseEntity<>(phoneList, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createPhone(@Valid @RequestBody Phone phone, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.phoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/edit")
    public ResponseEntity<?> editPhone(@Valid @RequestBody Phone phone, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.phoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/delete")
    public ResponseEntity<?> deletePhone(@Valid @RequestBody Phone phone, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.phoneService.delete(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
