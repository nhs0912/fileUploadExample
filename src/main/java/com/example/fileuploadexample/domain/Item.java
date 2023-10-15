package com.example.fileuploadexample.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private String myIp;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;

}
