class CountVowel {

    public int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;

        // Prefix sum
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {

            prefix[i + 1] = prefix[i];

            if (isVowel(words[i].charAt(0)) &&
                isVowel(words[i].charAt(words[i].length() - 1))) {

                prefix[i + 1]++;
            }
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            answer[i] = prefix[right + 1] - prefix[left];
        }

        return answer;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}