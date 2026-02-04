package com.snowylee.mapper.model;

import java.util.List;

public class MatchRequest {
    public String targetDb;
    public String viewName;
    public double threshold = 0.6;
    public DbConfig db;
    public List<TemplateField> fields;
}