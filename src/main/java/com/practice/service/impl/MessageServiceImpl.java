/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 1:37 PM
 * Project Name: practice
 */

package com.practice.service.impl;

import com.practice.entity.Message;
import com.practice.exception.CustomException;
import com.practice.repo.MessageRepo;
import com.practice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepo messageRepo;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void add() throws CustomException{

        Message message = new Message();
        message.setMessage("Welcome");

        messageRepo.save(message);
        System.out.println("Hi msg addition is done");



    }

}
