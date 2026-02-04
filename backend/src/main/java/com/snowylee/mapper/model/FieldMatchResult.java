package com.snowylee.mapper.model;

import java.util.List;

public class FieldMatchResult {
    public TemplateField field;
    public MatchCandidate best;
    public List<MatchCandidate> candidates;
    public boolean usedNull;
}