public class Seamstress {

    int workTime;
    int breakTime;
    Clothing cloth;

    public Seamstress() {
        workTime = 0;
        breakTime = 0;
        cloth = null;
    }

    public String toString() {

        return "время работы " + workTime + "c, время простоя " + breakTime + "с.";
    }



}

