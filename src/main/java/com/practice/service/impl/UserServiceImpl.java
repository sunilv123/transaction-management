/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 1:36 PM
 * Project Name: practice
 */

package com.practice.service.impl;

import com.practice.entity.AppUser;
import com.practice.exception.CustomException;
import com.practice.repo.AppUserRepo;
import com.practice.service.MessageService;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    AppUserRepo appUserRepo;

    @Autowired
    MessageService messageService;

    //REQUIRED,REQUIRED_NEW,SUPPORT,MANDATORY,NEVER,NOT_SUPPORTED

    @Override
    @Transactional
    public void add() throws CustomException {

        System.out.println("Hi user addition is done");

        AppUser user = new AppUser();

        user.setName("Thrymr");
        user.setEmail("abcd@gmail.com");

        appUserRepo.save(user);

        messageService.add();
    }
}
