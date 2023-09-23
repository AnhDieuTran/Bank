
public class Bank {
    public static boolean valid(int value) {
        if (value <= 0) return false;
        else return true;
    }

    public static double validTime(int time, String customer) {
        double rate = 0.0;
        if (!valid(time)) rate = -1;
        else if (time < 3) {
            switch (customer) {
                case "canhan":
                    rate = 3.0;
                    break;
                case  "tochuc":
                    rate = 2.7;
                    break;
            }
        } else if (time < 6) {
            switch (customer) {
                case "canhan":
                    rate = 3.5;
                    break;
                case  "tochuc":
                    rate = 3.3;
                    break;
            }
        } else if (time < 12) {
            switch (customer) {
                case "canhan":
                    rate = 4.5;
                    break;
                case  "tochuc":
                    rate = 4.3;
                    break;
            }
        } else {
            switch (customer) {
                case "canhan":
                    rate = 5.5;
                    break;
                case  "tochuc":
                    rate = 4.9;
                    break;
            }
        }
        return rate;
    }
    public static String bankInterestRate(int money, String customer, boolean type, int time) {
        if (!valid(money)) {
            return "So tien khong hop le";
        } else {
            double rate = validTime(time, customer);
            if (rate == -1.0) return "Ky han khong hop le";
            if (type) {
                System.out.print(rate);
                return "So lai la " + Math.round((money*1.0 * rate/100 * time*1.0) /12) + " VNĐ";

            } else {
                return "So lai la " + Math.round((money * 0.2/100 * time) /365) + " VNĐ";
            }
        }
    }

}
