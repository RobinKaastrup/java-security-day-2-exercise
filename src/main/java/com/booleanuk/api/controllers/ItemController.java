package com.booleanuk.api.controllers;

import com.booleanuk.api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemController {

    @Autowired
    ItemRepository itemRepository;


}
