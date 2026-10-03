import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        // Step 1: Separate letter and digit logs
        for (String log : logs) {

            String[] parts = log.split(" ");

            // Check the first character after identifier
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        // Step 2: Sort letter logs
        Collections.sort(letterLogs, (a, b) -> {

            // Remove identifier
            String contentA = a.substring(a.indexOf(' ') + 1);
            String contentB = b.substring(b.indexOf(' ') + 1);

            // First compare contents
            int compare = contentA.compareTo(contentB);

            if (compare != 0) {
                return compare;
            }

            // If contents are same, compare identifiers
            String idA = a.substring(0, a.indexOf(' '));
            String idB = b.substring(0, b.indexOf(' '));

            return idA.compareTo(idB);
        });

        // Step 3: Combine letter logs + digit logs
        List<String> result = new ArrayList<>();

        result.addAll(letterLogs);
        result.addAll(digitLogs);

        return result.toArray(new String[0]);
    }
}