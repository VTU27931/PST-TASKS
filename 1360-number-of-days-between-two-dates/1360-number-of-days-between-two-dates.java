class Solution {
    int days(String s) {
        int y = Integer.parseInt(s.substring(0, 4));
        int m = Integer.parseInt(s.substring(5, 7));
        int d = Integer.parseInt(s.substring(8));

        int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 365 * (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

        for (int i = 0; i < m - 1; i++) n += a[i];

        if (m > 2 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))) n++;

        return n + d;
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(days(date1) - days(date2));
    }
}