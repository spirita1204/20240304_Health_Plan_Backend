package com.daniel.controller;

import com.daniel.service.NoteService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController {
  
  @Resource
  NoteService noteService;
  
  
}
