package de.intranda.goobi.plugins;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MarcDocstructField {

    private boolean exportDocstruct;

    private String docstructName;

    private String leader6;
    private String leader7;
    private String leader19;

    private String dependencyType; // anchor | child
    private String dependencyMetadata; // name of the metadata to check
    private String dependencyValue; // value of the metadata to check
}
