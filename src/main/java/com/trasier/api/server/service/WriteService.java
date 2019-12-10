package com.trasier.api.server.service;

import java.util.List;

import com.trasier.api.server.model.Span;

public interface WriteService {
    void writeSpans(String accountId, String spaceKey, List<Span> spans);
}