class MinPanalty {
    public int bestClosingTime(String customers) {

        int n = customers.length();

        // Initially shop closes at 0
        // Every 'Y' becomes a penalty
        int penalty = 0;

        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                penalty++;
            }
        }

        int minPenalty = penalty;
        int answer = 0;

        // Move closing time from left to right
        for (int i = 0; i < n; i++) {

            if (customers.charAt(i) == 'Y') {
                // This customer is now during open hours
                penalty--;
            } else {
                // This is a 'N' during open hours
                penalty++;
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                answer = i + 1;
            }
        }

        return answer;
    }
}