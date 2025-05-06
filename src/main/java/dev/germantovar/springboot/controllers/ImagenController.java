package dev.germantovar.springboot.controllers;

import dev.germantovar.springboot.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ImagenController {

  @Autowired
  private ImagenService imagenService;

  @GetMapping
  public ResponseEntity<List<String>> getImageUrls() {
    List<String> urls = imagenService.getImageUrls();
    return ResponseEntity.ok(urls);
  }
}

