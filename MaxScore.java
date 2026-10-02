class MaxScore {
    public int maximumScore(int a, int b, int c) {

        int total = a + b + c;

        int smallest = Math.min(a, Math.min(b, c));

        int largest = Math.max(a, Math.max(b, c));

        int secondSmallest = total - smallest - largest;

        return Math.min(total / 2, smallest + secondSmallest);
    }
}