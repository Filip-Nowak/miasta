package org.example.miasta2.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class ResponseModel {
    private String header;
    private List<Section> sections;
}
