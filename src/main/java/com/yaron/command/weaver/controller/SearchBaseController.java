package com.yaron.command.weaver.controller;

import com.yaron.command.weaver.service.SearchBaseService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class SearchBaseController {

    private SearchBaseService searchBaseService;

    public String doSearch(HttpServletRequest request, HttpServletResponse response) throws Exception{

        searchBaseService.doSearch4pc(new HashMap<>());

        return "";
    }
}
