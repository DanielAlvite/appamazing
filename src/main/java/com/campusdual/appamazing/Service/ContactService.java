package com.campusdual.appamazing.Service;

import com.campusdual.appamazing.api.IContactsService;
import com.campusdual.appamazing.model.Contact;
import com.campusdual.appamazing.model.dao.ContactDao;
import com.campusdual.appamazing.model.dto.ContactDTO;
import com.campusdual.appamazing.model.dto.dtomapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContactService")
@Lazy
public class ContactService implements IContactsService {
    @Autowired
    private ContactDao contactDao;

    @Override
    public ContactDTO queryContact(ContactDTO contactDTO) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        return ContactMapper.INSTANCE.toDTO(contactDao.getReferenceById(contact.getID()));
    }

    @Override
    public List<ContactDTO> queryAllContacts() {
        return ContactMapper.INSTANCE.toDTOList(contactDao.findAll());
    }

    @Override
    public int insertContact(ContactDTO contactDTO) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        contactDao.saveAndFlush(contact);
        return contact.getID();
    }

    @Override
    public int updateContact(ContactDTO contactDTO) {
        return this.insertContact(contactDTO);
    }

    @Override
    public int deleteContact(ContactDTO contactDTO) {
        int id = contactDTO.getID();
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        contactDao.delete(contact);
        return id;
    }
}
