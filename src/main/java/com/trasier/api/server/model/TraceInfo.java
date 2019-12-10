package com.trasier.api.server.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public class TraceInfo {
    @NonNull
    private String id;

    @NonNull
    private Long startTimestamp;

    @NonNull
    private Long endTimestamp;

    private Map<String, String> labels = new HashMap<>();

    private List<SpanInfo> spans = new ArrayList<>();
}