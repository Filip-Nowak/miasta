package org.example.miasta2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Section {
    private String text;
    private String image;
}
