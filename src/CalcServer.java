import java.rmi.RemoteException;

import static java.lang.Math.sqrt;

public class CalcServer implements Calc {
    @Override
    public String equation(int a, int b, int c) throws RemoteException {
        double disc = (b * b) - (4 * a * c);

        if (disc > 0) {
            double ans1 = ((-b + sqrt(disc)) / (2 * a));
            double ans2 = ((-b - sqrt(disc)) / (2 * a));
            return "x1 = " + ans1 + ", x2 = " + ans2;
        } else if (disc == 0) {
            double ans = (-b / (2 * a));
            return "x = " + ans;
        } else if (disc < 0) {
            return "Нет корней";
        }
        return "done!";
    }
}
