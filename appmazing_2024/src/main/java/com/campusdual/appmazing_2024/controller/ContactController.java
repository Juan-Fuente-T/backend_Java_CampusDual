package com.campusdual.appmazing_2024.controller;

import com.campusdual.appmazing_2024.api.IContactService;
import com.campusdual.appmazing_2024.api.IProductService;
import com.campusdual.appmazing_2024.model.dto.ContactDTO;
import com.campusdual.appmazing_2024.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private IContactService contactService;

    @GetMapping
    public String testController(){
        return "Contacts controller works!";
    }

    @PostMapping
    public String testControllerPost(@RequestBody String name){
        return "Contacts controller POST works! " + name + "!";
    }
    @GetMapping(value = "/testMethod")
    public String testControllerGet2() {
        return "El metodo del controller de Contacts, Get2 funciona ok!";
    }

    @PostMapping(value= "/get")
    public ContactDTO queryContact(@RequestBody ContactDTO contactDTO){
        return this.contactService.queryContact(contactDTO);
    }
    @GetMapping(value = "/getAll")
    public List<ContactDTO> queryAllContacts() {
        return contactService.queryAllContacts();
    }
    @PostMapping(value = "/add")
    public int addContact (@RequestBody ContactDTO contactDTO){
        return contactService.insertContact(contactDTO);
    }
    @PutMapping(value = "/update")
    public int updateContact (@RequestBody ContactDTO contactDTO){
        return contactService.updateContact(contactDTO);
    }
    @DeleteMapping(value = "/delete")
    public int deleteContact (@RequestBody ContactDTO contactDTO){
        return contactService.deleteContact(contactDTO);
    }
}
