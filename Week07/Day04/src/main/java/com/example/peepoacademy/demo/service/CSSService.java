package com.example.peepoacademy.demo.service;

import com.example.peepoacademy.demo.model.BackgroundImages;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CSSService {
    private List<String> backgroundImageList = getBackgroundImageList();
    public HashMap <String,String> backgroundImageHashmap = new HashMap<>();
    public HashMap <String, String> peepoTaskGifMap = new HashMap<>();
    public HashMap <String,String> pepeEmotionMap = new HashMap<>();

    public List<String> getBackgroundImageList() {
        return Arrays.stream(BackgroundImages.values()).map(Enum::toString).collect(Collectors.toList());
    }
    public HashMap<String, String> setBackgroundImageHashmap(){
        backgroundImageHashmap.put(backgroundImageList.get(0),"/home.jpg");
        backgroundImageHashmap.put(backgroundImageList.get(1),"/nasa.jpg");
        backgroundImageHashmap.put(backgroundImageList.get(2),"/office.jpg");
        backgroundImageHashmap.put(backgroundImageList.get(3),"/road.jpg");
        backgroundImageHashmap.put(backgroundImageList.get(4),"/room.jpg");
        backgroundImageHashmap.put(backgroundImageList.get(5),"/smokes.jpg");
        return backgroundImageHashmap;
    }
    public HashMap<String,String> getBackgroundImageHashmap(){
        return setBackgroundImageHashmap();
    }

    public HashMap<String, String> setPeepoTaskGifMap() {
        peepoTaskGifMap.put("coggers","coggers.gif");
        peepoTaskGifMap.put("peepoChill","peepoChill.gif");
        peepoTaskGifMap.put("FeelsLitMan","FeelsLitMan.gif");
        peepoTaskGifMap.put("hackerPepe","hackerPepe.gif");
        peepoTaskGifMap.put("monkaSaved","monkaSaved.gif");
        peepoTaskGifMap.put("monkaSteer","monkaSteer.gif");
        peepoTaskGifMap.put("monkaWash","monkaWash.gif");
        peepoTaskGifMap.put("peepoCoffee","peepoCoffee.gif");
        peepoTaskGifMap.put("peepoCoffeev2","peepoCoffeev2.gif");
        peepoTaskGifMap.put("peepoJuice","peepoJuice.gif");
        peepoTaskGifMap.put("peepoPizza","peepoPizza.gif");
        peepoTaskGifMap.put("pepeDab","pepeDab.png");
        peepoTaskGifMap.put("pepegaCredit","pepegaCredit.gif");
        peepoTaskGifMap.put("pepegSit","pepegSit.png");
        peepoTaskGifMap.put("pepejam","pepejam.gif");
        peepoTaskGifMap.put("pepeWhy","pepeWhy.gif");
        peepoTaskGifMap.put("Smoge","Smoge.gif");
        peepoTaskGifMap.put("ez","ez.jpg");
//        peepoTaskGifMap.put(,);
        return peepoTaskGifMap;
    }

    public HashMap<String, String> getPeepoTaskGifMap() {
        return setPeepoTaskGifMap();
    }
    public HashMap<String,String> setPepeEmotionMap(){
        pepeEmotionMap.put("ez","ez.jpg");
        pepeEmotionMap.put("happypepe","happypepe.png");
        pepeEmotionMap.put("pepewhy","pepewhy.png");
        pepeEmotionMap.put("sadpepe","sadpepe.png");
        pepeEmotionMap.put("yep","YEP.png");
        return pepeEmotionMap;
    }

    public HashMap<String, String> getPepeEmotionMap() {
        return setPepeEmotionMap();
    }
}
