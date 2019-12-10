package com.trasier.api.server.model;

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
public class Span {
    @NonNull
    private String id;

    private String parentId;

    @NonNull
    private String traceId;

    @NonNull
    private String conversationId;

    @NonNull
    private String name;

    @NonNull
    private String status;

    private Long startTimestamp;

    private Long endTimestamp;

    private Long beginProcessingTimestamp;

    private Long finishProcessingTimestamp;

    private Map<String, String> tags;

    private Map<String, String> features;

    private Endpoint incomingEndpoint;

    private ContentType incomingContentType;

    private Map<String, String> incomingHeader;

    private String incomingData;

    private Endpoint outgoingEndpoint;

    private ContentType outgoingContentType;

    private Map<String, String> outgoingHeader;

    private String outgoingData;
}
