package org.codewithsitangshu.jsoncomparator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JsonNodeExtensions {


    /**
     * Converts a JSON array node into an indexed map.
     *
     * @param node the JSON node to convert
     * @return an indexed map of array elements, or an empty map if the node is not an array
     */
    public static Map<Integer, JsonNode> toIndexedMap(JsonNode node) {
        if (!node.isArray())
            return Collections.emptyMap();

        Map<Integer, JsonNode> indexedMap = new HashMap<>();
        for (int i = 0; i < node.size(); i++) {
            indexedMap.put(i, node.get(i));
        }
        return indexedMap;
    }

    /**
     * Checks if a JSON node represents a simple type.
     *
     * @param node the JSON node to check
     * @return true if the node represents a simple type, false otherwise
     */
    public static boolean isSimpleType(JsonNode node) {
        return node != null && !node.isContainerNode();
    }

}