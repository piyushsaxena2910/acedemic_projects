package com.webtools.cms.FileUploader;
import java.util.*;

import org.springframework.web.multipart.MultipartFile;

public class FileUploader {

	private List<MultipartFile> files;

	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
	
}
