/**
 * Run your answer against a specific test-case input from a JSON file.
 *
 * This file serves two purposes:
 *
 *     * It's a convenience script that allows you to execute your answer with a test-case,
 *       and view the results in the generated `output.json` file or stdout. It's analogous
 *       to pressing 'Try Answer' on the side panel, except it DOES NOT tell you if
 *       your answer is right or wrong.
 *
 *     * It's used by the Lytmus platform to execute your answer with private test-cases.
 *
 * Usage:
 *     gradle run -q -P "appArgs='<test_case_path>'"
 * Example:
 *     gradle run -q -P "appArgs='tests/input_1.json'"
 *
 * The path of a JSON file containing test case input must always be provided when running this
 * file.
 *
 * --------------------------------------------------------------------------------------
 * IMPORTANT: You DO NOT need to modify this file. If you decide to do so,
 *            please follow these guidelines:
 *
 *     1. The name of this file must always be `TestAnswer.java`. Don't rename or delete
 *        this file.
 *
 *     2. This file must always accept as a first argument the path to the JSON-encoded
 *        test file.
 *
 *     3. This file must always write to a file called `output.json`, located
 *        in the same folder as `TestAnswer.java`.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import com.eclipsesource.json.*;

public class TestAnswer {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Error, the name of the input file must be provided as a command line argument");
            System.exit(1);
        }

        runAnswer(args[0]);
    }

    /**
     * Feed the provided test-case to the answer() method, and dump the output to a JSON file.
     *
     * @param testCasePath Path of test-case file, eg, 'tests/input_1.json'.
     */
    public static void runAnswer(String testCasePath) {
        JsonObject input = loadInputFromFile(testCasePath);
        if (input == null || !inputIsValid(input)) {
            System.exit(1);
        }

        System.out.println("Calling find_words()");
        System.out.printf("Arguments: boggle_board=%s, list_path=%s\n",
                        input.get("boggle_board").asArray(),
                        input.get("list_path").asString());

        String[] output = Answer.find_words(getStringArrayFromJsonArray(input.get("boggle_board").asArray()), input.get("list_path").asString());
        
        JsonValue json = null;
        if (output == null) {
            json = Json.NULL;
        } else {
            json = Json.array(output);
        }
        
        System.out.printf("Returned: %s\n", json);
        

        dumpOutputToFile(json);
    }

    /**
     * Helper to convert Json array to string array
     *
     * @param array - the Json array to be converted
     *
     * @return String[]
     */
    public static String[] getStringArrayFromJsonArray(JsonArray array) {
        String[] values = new String[array.size()];
        int index = 0;
        for (JsonValue val: array.values()) {
            values[index++] = val.asString();
        }

        return values;
    }

    /**
     * Helper to convert Json array to int array
     *
     * @param array - the Json array to be converted
     *
     * @return int array
     */
    public static int[] getIntegerArrayFromJsonArray(JsonArray array) {
        int[] values = new int[array.size()];
        int index = 0;
        for (JsonValue val: array.values()) {
            values[index++] = val.asInt();
        }
        return values;
    }

    /**
     * Helper to convert Json array to double array
     *
     * @param array - the Json array to be converted
     *
     * @return double array
     */
    public static double[] getDoubleArrayFromJsonArray(JsonArray array) {
        double[] values = new double[array.size()];
        int index = 0;
        for (JsonValue val: array.values()) {
            values[index++] = val.asDouble();
        }
        return values;
    }

    /**
     * Helper to convert Json array to boolean array
     *
     * @param array - the Json array to be converted
     *
     * @return boolean array
     */
    public static boolean[] getBooleanArrayFromJsonArray(JsonArray array) {
        boolean[] values = new boolean[array.size()];
        int index = 0;
        for (JsonValue val: array.values()) {
            values[index++] = val.asBoolean();
        }
        return values;
    }

    /**
     * Load the specified JSON-encoded file to a Java JsonObject.
     *
     * @param filepath Path of JSON-encoded file, eg, 'tests/input_1.json'.
     * @return A JsonObject holding the content of the JSON-encoded file, eg, {"name": "bill"}.
     */
    public static JsonObject loadInputFromFile(String filename) {
        JsonObject object = null;
        try {
            FileReader fr = new FileReader(filename);
            object = Json.parse(fr).asObject();
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.printf("Error, file doesn't exist: %s\n", filename);
        } catch (ParseException e) {
            System.err.printf("Error, input file %s does not contain valid JSON\n", filename);
        } catch (IOException e) {
            System.err.printf("Error, could not read input file %s:\n", filename);
        }

        return object;
    }


    /**
     * Validates the input from the input file provided when running this script. The input file
     * must contain all of the required fields, and the values for those fields must all be of an
     * required type.
     *
     * @param inputObject: The contents of the input file provided when this script is run.
     *
     * @return Boolean indicating whether the input file contains all required fields and that they
     *         all contain values of the correct type.
     */
    public static boolean inputIsValid(JsonObject inputObject) {

        // Mapping of required field names to the required type of values for that field for the
        // contents of the input file
        HashMap<String, String> requiredFields = new HashMap<>();
        requiredFields.put("boggle_board", "Array");
        requiredFields.put("list_path", "String");

        boolean fieldsAreValid = true;

        String fieldType;
        String requiredFieldType;
        for (String field : requiredFields.keySet()) {
            if (inputObject.get(field) == null) {
                System.err.printf("Error, input JSON file does not have field \"%s\"\n", field);
                fieldsAreValid = false;
            } else {
                fieldType = getJsonValueType(inputObject.get(field));
                requiredFieldType = requiredFields.get(field);

                if (!fieldType.equals(requiredFieldType)) {
                    System.err.printf("Error, field \"%s\" in input file has the type \"%s\", but the type should be \"%s\"\n",
                                      field, fieldType, requiredFieldType);
                    fieldsAreValid = false;
                }
            }
        }

        return fieldsAreValid;
    }


    /**
     * Gets the name of the type a JsonValue represents.
     *
     * @param value The value to get the type of.
     * @return The name of the type the JsonValue represents, eg, "String"
     */
    public static String getJsonValueType(JsonValue value) {
        String typeName = null;
        if (value.isString()) {
            typeName = "String";
        } else if (value.isNumber()) {
            typeName = "Number";
        } else if (value.isBoolean()) {
            typeName = "Boolean";
        } else if (value.isArray()) {
            typeName = "Array";
        }

        return typeName;
    }


    /**
     * Encode the specified output as JSON, and write it to the specified file.
     *
     * @param output The output to be JSON-encoded and dumped to file.
     * @param filepath String with path of file to create, eg, 'output.json'.
     */
    public static void dumpOutputToFile(JsonValue output) {
        try {
            FileWriter fw = new FileWriter("output.json");
            output.writeTo(fw);
            fw.close();
        } catch (IOException e) {
            System.err.println("Error occurred when writing output to file");
            System.exit(1);
        }
    }
}
