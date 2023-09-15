package com.campusdual.appamazing.controller;

import com.campusdual.appamazing.api.IContactsService;
import com.campusdual.appamazing.model.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private IContactsService contactsService;

    @PostMapping
    public String testController(@RequestBody String name){
        return "Contacts controller works " + name + " !!";
    }

    @PostMapping("/get")
    public ContactDTO queryContact(@RequestBody ContactDTO contactDTO){
        return this.contactsService.queryContact(contactDTO);
    }

    @GetMapping("/get/{id}")
    public ContactDTO queryContact(@PathVariable int id){
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setID(id);
        return this.contactsService.queryContact(contactDTO);
    }
    @GetMapping("/getAll")
    public List<ContactDTO> queryAllContacts(){
        return this.contactsService.queryAllContacts();
    }

    @PostMapping("/add")
    public int addContacts(@RequestBody ContactDTO contactDTO){
        return this.contactsService.insertContact(contactDTO);
    }

    @PutMapping("/update")
    public int updateContacts(@RequestBody ContactDTO contactDTO){
        return this.contactsService.updateContact(contactDTO);

    }
    @PutMapping("/delete")
    public int deleteContacts(@RequestBody ContactDTO contactDTO){
        return this.contactsService.deleteContact(contactDTO);

    }

}

