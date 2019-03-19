package com.haidong.serialize;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * This mapper provides functionality for
 * converting between Java objects and matching JSON constructs.
 *
 * Mapper registered custom {@link JsonSerializerProvider}
 *
 * @author Anna_Popova
 */

public class JsonObjectMapper extends ObjectMapper {

    private static final long serialVersionUID = 1687448143760034558L;

    public JsonObjectMapper() {
        super();
        this.setSerializerProvider(new JsonSerializerProvider());
        this.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        this.configure(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
    }
}
