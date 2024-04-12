package com.devoxx.genie.service.dto;

import com.devoxx.genie.domain.enumeration.LanguageModelType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * A DTO for the LanguageModelDTO entity.
 */
@Getter
@Setter
public class LanguageModelDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;
    private Long id;
    private String name;
    private String baseUrl;
    private String description;
    private String version;
    private LanguageModelType modelType;
    private double costInput1M;
    private double costOutput1M;
    private boolean tokens;
    private double paramsSize;
    private Integer contextWindow;
    private Boolean apiKeyRequired;
    private String website;
}
