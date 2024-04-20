package org.codewithsitangshu.jsoncomparator;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonNodeType {

    /**
     * Extracts the value from a JsonNode object based on its type.
     *
     * @param node The JsonNode object to extract the value from.
     * @return The value contained by the JsonNode, or the node itself if it's a complex type.
     */
    public static Object getType(JsonNode node) {
        if (node.isNumber())
            return node.numberValue();
        if (node.isTextual())
            return node.textValue();
        if (node.isBoolean())
            return node.booleanValue();
        return node;
    }

}
