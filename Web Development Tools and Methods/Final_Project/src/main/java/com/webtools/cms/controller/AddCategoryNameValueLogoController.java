package com.webtools.cms.controller;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.DAO.CategoryDAO;
import com.webtools.cms.DAO.PageDAO;
import com.webtools.cms.FileUploader.FileUploader;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;

@Controller
@RequestMapping("/admin/addCategoryNameValueLogo.htm")
public class AddCategoryNameValueLogoController {

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doSubmitAction(@ModelAttribute("uploadedFiles") FileUploader uploadedFiles, Model map, HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<MultipartFile> files = uploadedFiles.getFiles();
		System.out.println("Files recieved"+files);
		List<String> fileNames = new ArrayList<String>();
		for (MultipartFile multipartFile : files) {
                String fileName = multipartFile.getOriginalFilename();
                fileNames.add(fileName);
                if(!fileName.equals(""))
    			{
    				File uploads = new File("D:\\Web Tools\\Final_Project\\src\\main\\webapp");
    				File fileUploaded = new File(uploads, fileName);
    				InputStream fileContent = (InputStream) multipartFile.getInputStream();
    				try {
    					Files.copy(fileContent,fileUploaded.toPath());
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			}
                }
		
        HttpSession session = request.getSession();
        Set<String> categoryNames = (Set<String>) session.getAttribute("categoryNames");
        String[] categoryNamesArray = new String[categoryNames.size()];
        Iterator<String> it1 = categoryNames.iterator();
        for(int i = 0; i < categoryNames.size(); i++){
        	categoryNamesArray[i] = it1.next();
        }
        Set<String> categoryValues = (Set<String>) session.getAttribute("categoryValues");
        String[] categoryValuesArray = new String[categoryValues.size()];
        Iterator<String> it2 = categoryValues.iterator();
        for(int i = 0; i < categoryValues.size(); i++){
        	categoryValuesArray[i] = it2.next();
        }
        CategoryDAO categoryDAO = new CategoryDAO();
    	
        Enumeration enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String parameterName = (String) enumeration.nextElement();
            if(parameterName.substring(0, 5).equals("files")){
            	parameterName = (String) enumeration.nextElement();
            }
            else{
            	if(parameterName.substring(0, 12).equals("categoryName")){
            		parameterName = parameterName.substring(12, parameterName.length());
            		for(int i = 0; i < categoryNamesArray.length; i++){
            		System.out.println("parameter name -> " + parameterName);
            		System.out.println("category name of i -> " + categoryNamesArray[i]);
            		if(parameterName.length()>categoryNamesArray[i].length()){
            			System.out.println("substring - > "+parameterName.substring(0, ((categoryNamesArray[i].length()))));
            		if(categoryNamesArray[i].equals(parameterName.substring(0, categoryNamesArray[i].length()))){
            		String fileNumber = parameterName.substring(categoryNamesArray[i].length(), parameterName.length());
            		String fileName = fileNames.get(Integer.valueOf(fileNumber));
            		categoryDAO.updateCategoryLogo(fileName,categoryNamesArray[i]);
            		break;
            		}
            		}
            	}
            }
            	else if(parameterName.substring(0, 13).equals("categoryValue")){
            		parameterName = parameterName.substring(13, parameterName.length());
            		for(int i = 0; i < categoryValuesArray.length; i++){
	            		System.out.println("parameter value -> " + parameterName);
	            		System.out.println("category value of i -> " + categoryValuesArray[i]);
	            		if(parameterName.length()>categoryValuesArray[i].length()){
	            		if(categoryValuesArray[i].equals(parameterName.substring(0,(categoryValuesArray[i].length())))){
	            		String fileNumber = parameterName.substring(categoryValuesArray[i].length(), parameterName.length());
	            		String fileName = fileNames.get(Integer.valueOf(fileNumber));
	            		categoryDAO.updateValueLogo(fileName,categoryValuesArray[i]);
	            		break;
	            		}
	            		}
            		}
        
            }
            }
        }
		
		ModelAndView mv = new ModelAndView("home", "userName", null);
	    return mv;
	}
}
