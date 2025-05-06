package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Imagen;
import dev.germantovar.springboot.repository.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImagenServiceImpl implements ImagenService {

  @Autowired
  private ImagenRepository imagenRepository;

  @Override
  public List<String> getImageUrls() {
    return imagenRepository.findAll()
      .stream()
      .map(Imagen::getUrl)
      .collect(Collectors.toList());
  }
}
