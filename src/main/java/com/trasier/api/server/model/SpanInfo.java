package com.trasier.api.server.model;

import java.util.ArrayList;
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
public class SpanInfo {

    @NonNull
    private String id;

    @NonNull
    private String name;

    @NonNull
    private String status;

    @NonNull
    private Long startTimestamp;

    private List<SpanInfo> children = new ArrayList<>();

    private Long endTimestamp;

    private Long beginProcessingTimestamp;

    private Long finishProcessingTimestamp;

    private Map<String, String> tags;

    private Endpoint incomingEndpoint;

    private Map<String, String> incomingHeader;

    private Endpoint outgoingEndpoint;

    private Map<String, String> outgoingHeader;
}
