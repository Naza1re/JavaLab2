
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countt;


        Stack finish = new Stack();
        Stack toSew = new Stack();
        Stack toDarn = new Stack();

        System.out.println("Введите количество одежды для заполнения");
        countt=in.nextInt();
        Queue start = new Queue(countt);
        start=fullCollection(countt);

        int N = start.size();

        Seamstress sew = new Seamstress();
        Seamstress darn = new Seamstress();

        while(finish.size() != N) {

            if (!start.isEmpty()) {
                start.peek().toFix--;

                if(start.peek().toFix==0){
                    toSew.add(start.peek());
                    start.remove();
                }
            }

            if(sew.cloth == null) {
                if(toSew.size()!=0) {
                    sew.cloth = toSew.peak();
                    toSew.remove();
                }
                else sew.breakTime++;
            }

            if(sew.cloth != null) {
                if(sew.cloth.timeSew==0) {
                    toDarn.add(sew.cloth);
                    sew.cloth = null;
                }
                else {
                    sew.cloth.timeSew--;
                    sew.workTime++;
                }

            }



            if(darn.cloth == null) {
                if(toDarn.size()!=0) {
                    darn.cloth = toDarn.peak();
                    toDarn.remove();
                }
                else darn.breakTime++;
            }


            if(darn.cloth != null) {
                if(darn.cloth.timeDarn==0) {
                    finish.add(darn.cloth);
                    darn.cloth = null;
                }
                else {
                    darn.cloth.timeDarn--;
                    darn.workTime++;
                }
            }

        }


        System.out.println("Швея 1, которая пришивает: " + sew);
        System.out.println("Швея 2, которая штопает:" + darn);


    }
    public static Queue fullCollection(int count){
        Queue queue = new Queue(count);
        Scanner in = new Scanner(System.in);
        int buttonKol,t,timeDarn,tofix;
        for(int i = 0;i<count;i++){
            System.out.println("Ввелите buttonKol : ");
            buttonKol= in.nextInt();
            System.out.println("Ввелите время на пошивку  : ");
            t = in.nextInt();
            System.out.println("Ввелите timeDarn : ");
            timeDarn= in.nextInt();
            System.out.println("Ввелите tofix : ");
            tofix= in.nextInt();
            System.out.println();
            queue.add(new Clothing(buttonKol,t,timeDarn,tofix));
        }
        return queue;

    }
}