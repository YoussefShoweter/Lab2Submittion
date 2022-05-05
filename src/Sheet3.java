public class Sheet3 {
    public String state = "NORMAL";
    public String Option2 = "TIME";
    public int m = 0, h = 0, D = 1, M = 1, Y = 2000;

    public String[] input(char c) {
        if (state.equals("NORMAL")) {
            if (c == 'c') {
                state = "UPDATE";
                Option2 = "min";
            }

            if (c == 'b') {
                state = "ALARM";
                Option2 = "Alarm";
            }
            if (c == 'a') {
                if (Option2.equals("TIME")) {
                    Option2 = "DATE";
                } else {
                    Option2 = "TIME";
                }
            }
        }
        if (state.equals("UPDATE")) {
            if (c == 'd') {
                state = "NORMAL";
                Option2 = "TIME";
            }
            if (c == 'a') {
                if (Option2.equals("year")) {
                    state = "NORMAL";
                    Option2 = "TIME";
                }
                if (Option2.equals("month")) {
                    Option2 = "year";
                }
                if (Option2.equals("day")) {
                    Option2 = "month";
                }
                if (Option2.equals("hour")) {
                    Option2 = "day";
                }
                if (Option2.equals("min")) {
                    Option2 = "hour";
                }
            }
            if (c == 'b') {
                if (Option2.equals("min")) {
                    m++;
                }
                if (m >= 60) {
                    m = 0;
                }


                if (Option2.equals("hour")) {
                    h++;
                    if (h >= 24) {
                        h = 0;
                    }
                }
                if (Option2.equals("day")) {
                    D++;
                    if (D > 31) {
                        D = 1;
                    }
                }
                if (Option2.equals("month")) {
                    M++;
                    if (M > 12) {
                        M = 1;
                    }
                }
                if (Option2.equals("year")) {
                    Y++;
                    if (Y > 2100) {
                        Y = 2000;
                    }
                }
            }

        }
        if(state.equals("ALARM")){
            if (c == 'd') {
                state = "NORMAL";
                Option2 = "TIME";
            }if (c == 'a') {
                Option2 = "Chime";
            }
        }
        return new String[]{state, Option2, String.valueOf(Y) + "-" +
                String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(h) + ":" +
                String.valueOf(m) };
    }
}





