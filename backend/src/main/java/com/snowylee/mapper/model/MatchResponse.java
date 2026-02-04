package com.snowylee.mapper.model;

import java.util.List;

public class MatchResponse {
    public String taskId;
    public String sql;
    public List<FieldMatchResult> results;
}