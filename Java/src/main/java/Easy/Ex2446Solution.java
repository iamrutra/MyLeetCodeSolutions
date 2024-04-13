package Easy;

class Solution2446 {

    private int getTimeInMinutes(String time) {
        try {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            return hours * 60 + minutes;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Обработка ошибок парсинга времени
            e.printStackTrace();
            return -1; // или другое значение по умолчанию
        }
    }
    public boolean haveConflict(String[] event1, String[] event2) {

            int startTime1 = getTimeInMinutes(event1[0]);
            int endTime1 = getTimeInMinutes(event1[1]);

            int startTime2 = getTimeInMinutes(event2[0]);
            int endTime2 = getTimeInMinutes(event2[1]);

            return (startTime1 <= startTime2 && startTime2 <= endTime1) ||
                    (startTime2 <= startTime1 && startTime1 <= endTime2);

    }

    public static void main(String[] args) {
        Solution2446 sol = new Solution2446();
        String[] event1 = {"01:15","02:00"};
        String[] event2 = {"02:00","03:00"};
        System.out.println(sol.haveConflict(event1, event2));
    }
}
