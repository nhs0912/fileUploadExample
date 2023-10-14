package com.example.fileuploadexample.domain;

import lombok.Data;

@Data
public class UploadFile {
    private final String uploadFileName;
    private final String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
